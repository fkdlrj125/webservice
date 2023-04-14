package compartir.project.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import compartir.project.domain.Noti;
import compartir.project.domain.NotiPage;
import compartir.project.domain.User;
import compartir.project.service.AdminService;
import compartir.project.service.NotiService;

@RequestMapping("/noti")
@Controller
public class NotiController {

	private final NotiService notiService;
	private final AdminService adminService;
	
	public NotiController(NotiService notiService, AdminService adminService) {
		this.notiService = notiService;
		this.adminService = adminService;
	}

	@GetMapping("/list")
	public String notiList(@SessionAttribute User loginUser, Model model,@RequestParam(defaultValue = "1") int currentPage) {
		List<Noti> notiList = notiService.findAll();
		model.addAttribute("loginUser", loginUser);
		model.addAttribute("notiList", new NotiPage(notiList.size(), currentPage, 10, 10, notiList));
		model.addAttribute("auth", adminService.adminCheck(loginUser.getUserId()));
		return "noti/noti-list";
	}

	@GetMapping("/{notiId}")
	public String noti(@SessionAttribute User loginUser, @PathVariable Long notiId, Model model) {
		Noti noti = notiService.findById(notiId).get();
		model.addAttribute("loginUser", loginUser);
		model.addAttribute("noti", noti);
		model.addAttribute("auth", adminService.adminCheck(loginUser.getUserId()));
		return "noti/noti";
	}

	@GetMapping("/{notiId}/edit")
	public String notiEditForm(@SessionAttribute User loginUser, @PathVariable Long notiId, Model model) {
		model.addAttribute("loginUser", loginUser);
		model.addAttribute("noti", notiService.findById(notiId).get());
		return "noti/noti-edit";
	}

	@PostMapping("/{notiId}/edit")
	public String notiEdit(@PathVariable Long notiId, @ModelAttribute Noti noti, Model model,RedirectAttributes redirect) {
		model.addAttribute("noti", notiService.update(notiId, noti));
		redirect.addAttribute("notiId", notiId);
		return "redirect:/noti/{notiId}";
	}

	// 공지사항 글 작성 폼 화면
	@GetMapping("/create")
	public String notiCreateForm(@SessionAttribute User loginUser, Model model) {
		model.addAttribute("loginUser", loginUser);
		return "noti/noti-create";
	}

	@PostMapping("/create")
	public String createNoti(@ModelAttribute Noti noti,
			RedirectAttributes redirectAttributes, Model model) {

		notiService.create(noti);
		redirectAttributes.addAttribute("notiId", noti.getNotiId());
		return "redirect:/noti/{notiId}";
	}

	@PostMapping("/{notiId}/del")
	public String deleteById(@SessionAttribute User loginUser, @PathVariable Long notiId,Model model,@RequestParam(defaultValue = "1") int currentPage) {
		notiService.deleteById(notiId);
		List<Noti> notiList = notiService.findAll();
		model.addAttribute("notiList", new NotiPage(notiList.size(), currentPage, 10, 10, notiList));
		model.addAttribute("loginUser", loginUser);
		model.addAttribute("auth", adminService.adminCheck(loginUser.getUserId()));
		return "noti/noti-list";
	}
}
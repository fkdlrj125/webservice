package himedia.third.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import himedia.third.domain.Member;
import himedia.third.domain.MemberForm;
import himedia.third.service.MemberService;

@Controller
@RequestMapping("/member")
public class MemberController {
	
	private final MemberService service;
	
	public MemberController(MemberService service) {
		this.service = service;
	}
	
	@GetMapping("/new")
	public String form() {
		return "member/new-form";
	}
	
//	@PostMapping("/new")
//	public String create(@RequestParam String name) {
//		Member member = new Member();
//		member.setName(name);
//		
//		System.out.println("name >> "+name);
//		service.join(member);
//		
//		return "redirect:/";
//	}
	
	@PostMapping("/new")
	public String create(@ModelAttribute MemberForm form) {
		Member member = new Member();
		member.setName(form.getName());
		
		System.out.println("name >> "+form.getName());
		service.join(member);
		
		return "redirect:/";
	}
	
	@GetMapping("/list")
	public String list(Model model) {
		List<Member> list = service.findMembers();
		
		model.addAttribute("members", list);
		return "member/member-list";
	}
}

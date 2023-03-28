package himedia.fourth.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import himedia.fourth.domain.Item;
import himedia.fourth.repository.ItemRepository;

@Controller
@RequestMapping("/store/items")
public class StoreController {
	private final ItemRepository repository;
	
	public StoreController(ItemRepository repository) {
		this.repository= repository;
	}
	
	@GetMapping
	public String items(Model model) {
		List<Item> list = repository.findAll();
		model.addAttribute("itemlist", list);
		return "store/items";
	}
	
	@GetMapping("/search")
	public String search(@RequestParam String searchItem, Model model) {
		Item result; 
		result = searchItem.isEmpty() ? new Item() : repository.findByName(searchItem).orElse(new Item());
		model.addAttribute("item", result);
		return "store/item";
	}
	
	@GetMapping("/{itemId}") 
	public String item(@PathVariable Long itemId,Model model) {
		Item item = repository.findById(itemId).get();
		model.addAttribute("item",item);
		return "store/item";
	}
	
	@GetMapping("/add")
	public String getAddForm() {
		return "store/addForm";
	}
	
	@PostMapping("/add")
	public String postAddForm(Item item, RedirectAttributes redirect ) {	
		repository.save(item);
		redirect.addAttribute("itemId", item.getId());
		return "redirect:/store/items/{itemId}";
	}
	
	@GetMapping("/{itemId}/edit")
	public String getEditForm(@PathVariable Long itemId, Model model) {
		if(itemId == 0) {
			return "redirect:/store/items/add";
		}
		Item item = repository.findById(itemId).get();
		model.addAttribute("item", item);
		return "store/editForm";
	}
	
//	@ModelAttribute item의 id 값이 없는 이유
//	id에 해당하는 input의 속성이 disabled이기 때문에 
	
//	Model이 없는데 객체가 넘어간 이유
//	@ModelAttribute내부에서 값을 받으면 자동으로 Model에 추가를 해준다
	
//	넘어간 객체는 무엇?
//	@ModelAttribute로 받은 item객체
	
//	redirect를 한 이유?
//	redirect를 하지않으면 요청에 쿼리 파라미터가 남아있는 상태고
//	새로고침을 하면 계속해서 쿼리 파라미터를 포함해서 요청하기 때문에
	@PostMapping("/{itemId}/edit")
	public String postEditForm(@PathVariable Long itemId,@ModelAttribute Item item) {
		repository.update(itemId, item);
		return "store/item";
	}
	
}

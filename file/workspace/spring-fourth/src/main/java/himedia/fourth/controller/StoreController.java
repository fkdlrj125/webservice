package himedia.fourth.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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
	public String search(@RequestParam String searchItem, RedirectAttributes redirect) {
		redirect.addAttribute("searchId", repository.findByName(searchItem).get().getId());
		return "redirect:/store/items/{searchId}";
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
		Item item = repository.findById(itemId).get();
		model.addAttribute("item", item);
		return "store/editForm";
	}
	
	@PostMapping("/{itemId}/edit")
	public String postEditForm(Item item) {
		repository.update(item.getId(), item);
		return "redirect:/store/items/{itemId}";
	}
	
}

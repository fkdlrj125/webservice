package himedia.fourth.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import himedia.fourth.domain.Item;
import himedia.fourth.repository.ItemRepository;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
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
	
	@GetMapping("/{itemId}")
	public String item(@PathVariable long itemId,Model model) {
		Item item = repository.findById(itemId).get();
		model.addAttribute("item",item);
		return "store/item";
	}
	
	@GetMapping("/add")
	public String getAddForm() {
		return "store/addForm";
	}
	
	@PostMapping("/add")
	public String postAddForm(Item item,Model model) {
		repository.save(item);
		return "redirect:/store/items/"+item.getId();
	}
	
	@GetMapping("/{itemId}/edit")
	public String getEditForm(@PathVariable Long itemId, Model model) {
		Item item = repository.findById(itemId).get();
		model.addAttribute("item", item);
		return "store/editForm";
	}
	
	@PostMapping("/{itemId}/edit")
	public String postEditForm(Item item,Model model) {
		log.info("id >> "+item.getId());
		repository.update(item.getId(), item);
		model.addAttribute("item",item);
		return "redirect:/store/items/"+item.getId();
	}
	
}

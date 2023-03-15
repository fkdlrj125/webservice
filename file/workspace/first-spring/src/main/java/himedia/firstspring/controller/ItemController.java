package himedia.firstspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/item")		// 요청이 들어왔을 때 Mapping 시작 위치를 지정(class level mapping)
public class ItemController {
	
	@GetMapping
	public String welcome() {
		return "item/welcome";
	}
								// html 처리방식 중 get 방식 사용
//	@GetMapping("item")			// item이 요청되면 실행(uri)
//	public String item() {
//		return "item";			// 파일을 문자열형태로 리턴
//	}							// viewresolver가 해당 파일을 전송
	
	@GetMapping("/item-list")
	public String itemList() {
		return "item/item";
	}
	
	@GetMapping("/item-view")
	public String itemView(Model model) {
		model.addAttribute("title", "새우깡");
		// price는 1500으로 넘기시오.
		model.addAttribute("price", 1500);
		return "item/item-view";
	}
}

package himedia.second.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import himedia.second.domain.Member;
import himedia.second.domain.MemberForm;
import himedia.second.service.MemberService;

@Controller
@RequestMapping("/member")
public class MemberController {
	
	// Service Layer 사용 방법
	// [첫 번째 방법] - 멤버로 객체 생성
	// private final MemberService service = new MemberService();
	
	// [두 번째 방법] - container에 만들어진 객체 사용
	private final MemberService service;
	
	// Container에 생성된 MemberService bean을 받아와 사용
	// 의존성 주입(DI : Dependency Injection)
	// Container가 자동으로 의존성을 주입해줌
	
	// [필드를 통한 의존성 주입] - 권장X
	// @Autowired
	// private MemberService service;
	// - final이 아니기 때문에 값이 변경될 수 있고
	//   어노테이션을 남발해 bean관리가 어려워짐
	
	// [setter를 통한 의존성 주입] - 권장X
	// - 값 변경이 가능하기 때문에 bean관리가 어려워짐
	
	// [생성자를 통한 의존성 주입] 
	// @Autowired
	// 생성자를 통한 의존성 주입엔 어노테이션 @Autowired를 적어줘야되는데
	// 참조변수의 키워드가 final이고 생성자가 1개일 땐 생략가능
	public MemberController(MemberService service) {
		System.out.println("[MemberController] 실행");
		this.service = service;
	}
	
	@GetMapping("/new")
	public String newForm() {
		return "member/new-form";
	}
	
	@PostMapping("/new")	// 관련있는 요청인데 처리방식이 다르다면 요청을 같게 설정하는 것이 좋음
	public String newMember(MemberForm form) {	// domain을 이용해 데이터를 받음
		System.out.println("[post mapping] 이름 >> " + form.getName());
		Member member = new Member();
		member.setName(form.getName());
		service.join(member);
		return "redirect:/";	// 클라이언트에게 '/'로 요청하게 만듦
	}
	
	@GetMapping("/list")
	public String list(Model model) {
		List<Member> members = service.findMember();
		model.addAttribute("members", members);
		return "member/member-list";
	}
////	[첫 번째 방법]
//	@GetMapping("/search")
//	public String search(@RequestParam(required = false) Long id, 
//			@RequestParam String name, 
//			Model model) {
////		Optional<Long> id = Optional.ofNullable(searchId);
////		[첫 번째]
////		Optional<Member> result = service.findMember().stream()
////				.filter((Member m) -> {
////					if(id.isEmpty())
////						return m.getName().equals(searchName);
////					return m.getId().equals(searchId));
////				})
////				.findAny();
//		
////		[두 번째]
////		Optional<Member> searchResult= id.isPresent() ? service.findId(searchId) : service.findName(searchName);
////		model.addAttribute("searchResult",searchResult.isPresent() ? searchResult.get() : new Member());
//		
////		[세 번째]
//		Optional<Member> searchResult = Optional.of(new Member());
//		if (id != null) {
//			searchResult = service.findId(id);
//		} else if (!name.isEmpty()) {
//			searchResult = service.findName(name);
//		}
//		model.addAttribute("searchResult", searchResult.isPresent() ? searchMember.get() : new Member() );
//		return "member/search";
//	}
	
//	[두번째 방법]
//	[리플렉션 기법] : Reflection 
//	- 사용하려는 클래스의 정보(필드, 메소드)가 없을 때 클래스를 사용하는 기법
//	view -> controller
//	자동으로 setter 실행 -> 데이터 자동 처리
	
//	@ModelAttribute : view -> controller 
//	Model 			: controller -> view
	
////	[첫 번째]
//	@GetMapping("/search")
//	public String search(@ModelAttribute Member member, Model model) {
//		Optional<Member> searchMember = Optional.of(new Member()); // 빈 객체
//		
//		if(member.getId() != null)
//			searchMember = service.findId(member.getId());
//		else if(!member.getName().isEmpty())
//			searchMember = service.findName(member.getName());
//		model.addAttribute("searchResult", searchMember.isPresent() ? searchMember.get() : new Member());
//		return "member/search";
//	}
	
//	[두 번째]
	@GetMapping("/search")
	public String search(@ModelAttribute Member member, Model model) {
//		Member searchMember = new Member();
//		
//		if(member.getId() != null) {
//			searchMember = service.findId(member.getId()).get();
//		} else if(!member.getName().isEmpty()) {
//			searchMember = service.findName(member.getName()).get();
//		}
//
		Optional<Member> searchMember = Optional.empty(); // 빈 객체
		
//		if(member.getId() != null) {
//			searchMember = service.findId(member.getId());
//		} else if(!member.getName().isEmpty()) {
//			searchMember = service.findName(member.getName());
//		}
		searchMember = member.getName().isEmpty() ? 
				service.findId(member.getId()) : 
					service.findName(member.getName());
//		if(searchMember.isEmpty()) {
//			return "member/no-member";
//		}
//		
//		model.addAttribute("searchResult", searchMember.get());
		model.addAttribute("searchResult", searchMember.isPresent() ?
											searchMember.get() :
												null);
		return "member/search";
	}

}

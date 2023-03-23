package himedia.fourth.domain;

import lombok.Getter;
import lombok.Setter;

//@Data	 // @see Getter
		 // @see Setter
		 // @see RequiredArgsConstructor
		 // @see ToString
		 // @see EqualsAndHashCode
		 // @see lombok.Value
// Data는 위 어노테이션을 다 지니고 있기 때문에 
// 사용에 유의해야 함

@Getter @Setter
public class Item {
	private Long id;
	private String itemName;
	private Integer price;
	private Integer quantity;
	
	public Item() {}
	
	public Item(String itemName, Integer price, Integer quantity) {
		this.itemName = itemName;
		this.price = price;
		this.quantity = quantity;
	}

}

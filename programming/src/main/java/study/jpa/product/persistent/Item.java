package study.jpa.product.persistent;

import lombok.Data;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "DTYPE")
@Data
public class Item {
	@Id @GeneratedValue
	@Column(name = "ITEM_ID")
	private Long id;

	private String name;
	private int price;
}

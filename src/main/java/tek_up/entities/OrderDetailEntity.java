package tek_up.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;

@Entity
@AllArgsConstructor
public class OrderDetailEntity {
	@Id
	private int id;
	
	private int qty;
	
	private float tax;

	
	
}

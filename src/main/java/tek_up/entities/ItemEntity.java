package tek_up.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;

@Entity
@AllArgsConstructor
public class ItemEntity {
	@Id
	private int id;
	
	private float weight;
	
	private String description;
	
	private float price;
}

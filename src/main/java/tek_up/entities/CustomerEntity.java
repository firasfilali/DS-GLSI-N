package tek_up.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;

@Entity
@AllArgsConstructor
public class CustomerEntity {
	
	@Id
	private int id;
	
	private String name;
	
	private String deleveryAddress;
	
	private String contact;
	
	private boolean active;

}

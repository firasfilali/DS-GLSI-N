package tek_up.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;

@Entity
@AllArgsConstructor
public class DeliveryEntity {
	@Id
	private int id;
	
	private String deliveryman;
	
	private LocalDate shoppingDate;
	
	private LocalDate deliveryDate;
}

package entitys;

import java.math.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class LineItem {
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private long id;
	
	private long quantity  ;
	private String description;
	private BigDecimal unitPrice =  new BigDecimal(0);
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getQuantity() {
		return quantity;
	}
	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public BigDecimal getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}
	
	public BigDecimal getTotal()
	{
		
		     BigDecimal qty = new BigDecimal(getQuantity());
		     
			return unitPrice.multiply(qty);
	}
	
}

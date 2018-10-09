package entitys;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import methods.Totals;


@Entity
public class Invoice {
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private long id;
	
	private String client;
	private long vatRate = (long) 0.15;
	
	
	Date currentDate = new Date();
	private Date date = currentDate;
	
	
	public long getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getClient() {
		return client;
	}
	public void setClient(String client) {
		this.client = client;
	}
	public Long getVatRate() {
		return vatRate;
	}
	public void setVatRate(Long vatRate) {
		this.vatRate = vatRate;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}

	public BigDecimal getTotal()
	{
		LineItem item = new LineItem();
		BigDecimal vat = new BigDecimal(vatRate);
		
		return item.getTotal().add(item.getTotal().multiply(vat));
				
	}
	

}

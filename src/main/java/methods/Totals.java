package methods;

import java.math.BigDecimal;

public class Totals
{
	
	public BigDecimal itemPrice(long qty ,BigDecimal unitPrice )
	{
	    BigDecimal quantity = new BigDecimal(qty);
	    
		return unitPrice.multiply(quantity);
	}
}
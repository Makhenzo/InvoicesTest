      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 

     <h1>LIST OF All INVOICES</h1>
     <ul>
 			<h4>ID===Client====VAT====DATE</h4>
     	<c:forEach items="${invoices}" var="invoice">
     		<li>${invoice.id}===${invoice.client}====${invoice.vatRate}====${invoice.date} </li>
     		 <h1>===================</h1>
     	</c:forEach>	
     	
     </ul>
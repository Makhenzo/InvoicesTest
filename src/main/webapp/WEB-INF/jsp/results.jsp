      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 


     <h1>ONE INVOICE</h1>
     <h1>===========</h1>
     
     <ul>
     	<c:forEach items="${invoice}" var="invoice">
     		<li>${invoice}</li>
     	</c:forEach>	
     </ul>
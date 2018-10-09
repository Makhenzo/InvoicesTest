   
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>  
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 

 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<h3>ADD INVOICE</h3>
		<form:form modelAttribute="form">
			<form:errors path="" element="div" />
			<div>
			
			
					<form:label path="client">Client </form:label>
					<form:input path="client"/>
			
			
			
					<h5>VAT is 0.15%</h5>
					
					<form:label path="client">Client </form:label>
					<form:input path="client"/>
		    <div>
				<input type="submit" />
			</div>
			
		</form:form>
</body>
</html>
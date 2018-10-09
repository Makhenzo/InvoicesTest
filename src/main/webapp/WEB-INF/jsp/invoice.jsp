<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<h1>SPECIFIC INVOICE</h1>
<ul>
 	<jsp:param item="${invoice}" var="invoice"/>	
 	<li>${invoice.id}===${invoice.client}====${invoice.vatRate}====${invoice.date} </li> 
</ul>
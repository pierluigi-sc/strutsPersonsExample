<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ page import="java.util.*"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

</head>

<body>
	<html:form action="/getPersons" focus="person">
		<div id="wrapper">
			<div id="header">
				<h2>Person List</h2>
<!-- 				No of Person required -->
<%-- 				<html:text property="count" /> --%>
			</div>
		</div>
		<fieldset>
			<legend class="legendStyle">Current Person List</legend>
			<table border="1" width="100%" class="dataTableStyle">
				<tr>
					<th id="personId">Person Id</th>
					<th id="personName">Person Name</th>
					<th id="personPlanet">Person Place</th>
					<th id="age">Age</th>
				</tr>

				<c:forEach items="${personsForm.personDTO_List}" var="element"
	 					varStatus="rowIndex">
					<tr>
 						<td><c:out
 								value="${personsForm.personDTO_List[rowIndex.index].personId}" /></td>
 						<td><c:out
 								value="${personsForm.personDTO_List[rowIndex.index].personName}" /></td>
 						<td><c:out 
 								value="${personsForm.personDTO_List[rowIndex.index].personPlace}" /></td> 
 						<td><c:out 
 								value="${personsForm.personDTO_List[rowIndex.index].personAge}" /></td> 
 					</tr> 
 				</c:forEach> 


 			</table> 
 		</fieldset>
 		<html:submit value="List All Persons" /> 
		</html:form>
		<br>
	   <html:form action="/AddPerson" focus="person">
			<h3>Add Person</h3>
			<div id="container">
				Person Id:
				<html:text property="personId" value="" />
				<br> Person Name :
				<html:text property="personName" value="" />
				<br> Person Place:
				<html:text property="personPlace" value="" />
				<br> Person Age
				<html:text property="personAge" value="" />
				<br>
				<html:submit value="Add Person" />
			</div>
	 </html:form>
</body>
</html>
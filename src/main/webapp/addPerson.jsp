<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ page import="java.util.*"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<html:form action="/PersonInfo" focus="person">
		<div id="wrapper">
			<div id="header">
				<h2>Person List</h2>
				No of Person required
				<html:text property="count" />
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

				<c:forEach items="${personForm.personDTO_List}" var="element"
	 					varStatus="rowIndex">
					<tr>
 						<td><c:out
 								value="${personForm.personDTO_List[rowIndex.index].personId}" /></td>
 						<td><c:out
 								value="${personForm.personDTO_List[rowIndex.index].personName}" /></td>
 						<td><c:out 
 								value="${personForm.personDTO_List[rowIndex.index].personPlace}" /></td> 
 						<td><c:out 
 								value="${personForm.personDTO_List[rowIndex.index].age}" /></td> 
 					</tr> -->
 				</c:forEach> 


 			</table> 
 		</fieldset> 
		</html:form>

</body>
</html>
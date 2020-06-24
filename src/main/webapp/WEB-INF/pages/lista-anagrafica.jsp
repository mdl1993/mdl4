<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE html>

<html>
<head>
<title>Anagrafica</title>

<link href="<spring:url value='/css/jquery-ui.css' />" rel="stylesheet">
<link href="<spring:url value='/css/application.css' />" rel="stylesheet">

<script src="<spring:url value='/js/jquery.js' />" type="text/javascript"></script>
<script src="<spring:url value='/js/jquery-ui.js' />" type="text/javascript"></script>
<script src="<spring:url value='/js/application.js' />" type="text/javascript"></script>

</head>
<body>
	<h1>Lista Anagrafiche</h1>

	<a href="openInsert">nuovo</a>
	<br><br>

	<table>
		<tr>
			<th><b>NOME</b></th>
			<th><b>COGNOME</b></th>
			<th>action</th>
		</tr>

		<c:forEach var="item" items="${anagrafiche}">
			<tr>
				<td>${item.nome}</td>
				<td>${item.cognome}</td>
				<td><a href="<spring:url value="/anagrafica/get/${item.id}"/>">Apri Dettaglio</a></td>
			</tr>
		</c:forEach>	

	</table>

</body>
</html>
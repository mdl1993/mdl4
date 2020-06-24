<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!DOCTYPE html>

<html>
	<head><title><spring:message code="anagrafica" /></title></head>
	<body>
		<h1><spring:message code="anagrafica.nuovaAnagrafica" /></h1>

		<c:if test="${fn:length(errors.allErrors) > 0}">
			<div>
				<h4>Errori:</h4>
				<ul>
					<c:forEach var="error" items="${errors.allErrors}">
						<li><spring:message message="${error}" /></li>
					</c:forEach>
				</ul>
			</div>
		</c:if>		

		<br>
		<spring:url var="url" value="/anagrafica/insert"/>
		<form:form id="form" action="${url}" modelAttribute="anagraficaForm">
			
			<label for="nome"><spring:message code="anagrafica.nome" /></label><br> 
			<form:input path="anagrafica.nome" id="nome" maxlength="100"/><br> 
			
			<label for="cognome"><spring:message code="anagrafica.cognome" /></label><br>
			<form:input path="anagrafica.cognome" id="cognome" maxlength="100"/><br> 
	
			<label for="codiceFiscale"><spring:message code="anagrafica.codiceFiscale" /></label><br> 
			<form:input path="anagrafica.codiceFiscale" id="codice-fiscale" maxlength="16"/><br>
	
			<label><spring:message code="anagrafica.provinciaNascita" /></label><br>
			<form:select path="anagrafica.provinciaNascita.idProvincia" id="provincia-nascita">
				<form:options items="${province}" />
			</form:select>
			<br>
			
			<label for="eta"><spring:message code="anagrafica.eta" /></label><br> 
			<form:input path="anagrafica.eta" id="eta" maxlength="2"/><br> 
	
			<label for="sesso"><spring:message code="anagrafica.sesso" /></label> 
			<form:radiobutton path="anagrafica.sesso" id="sesso-m" value="M" /><spring:message code="anagrafica.maschile" />
			<form:radiobutton path="anagrafica.sesso" id="sesso-f" value="F" /><spring:message code="anagrafica.femminile" />
			<br>
			
			<label for="eta"><spring:message code="anagrafica.categoriaProtetta" /></label>
			<form:checkbox path="anagrafica.categoriaProtetta" id="categoria-protetta" />
			<br>

			<label for="eta"><spring:message code="anagrafica.curriculum" /></label><br> 
			<form:textarea path="anagrafica.curriculum" id="curriculum" /><br><br>
	
			<input type="submit" value="Salva">
	
		</form:form>
	</body>
</html>
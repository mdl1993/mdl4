<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html;charset=UTF-8" />
	<title>Home</title>
	</head>
	<body>
		<section>
			<div>
				<ul>
					<li>
						<a href="<spring:url value='/anagrafica/list' />">
							Consultazione Anagrafica
						</a>
					</li>
				</ul>
			</div>
		</section>
	</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html>
<html>
	<%@ include file="/WEB-INF/include/header.jsp" %>
		<a href="ajouter"><spring:message code="h.ajout"/></a><br>
		<a href="utilisateurs"><spring:message code="h.afficher"/></a>
	</body>
</html>
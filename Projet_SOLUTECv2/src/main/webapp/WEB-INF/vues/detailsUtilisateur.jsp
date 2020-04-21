<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html>
<html>
	<%@ include file="/WEB-INF/include/header.jsp" %>
		<h3><spring:message code="t.infos"/></h3>
		<ul>
			<li><spring:message code="l.nom"/>${utilisateur.nom}</li>
			<li><spring:message code="l.prenom"/>${utilisateur.prenom}</li>
			<li><spring:message code="l.compte"/>${utilisateur.nomDeCompte}</li>
		</ul>
		<a href="utilisateurs"><spring:message code="h.infos"/></a>
	</body>
</html>
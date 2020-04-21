<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html>
<html>
	<%@ include file="/WEB-INF/include/header.jsp" %>
		<h3><spring:message code="t.liste"/></h3>
		<table border="1">
			<tr>
				<th><spring:message code="l.nom"/></th>
				<th><spring:message code="l.prenom"/></th>
				<th><spring:message code="l.compte"/></th>
			</tr>
			<c:forEach items="${utilisateurs}" var="u">
				<tr>
					<td>${u.nom}</td>
					<td>${u.prenom}</td>
					<td>${u.nomDeCompte}</td>
				</tr>
			</c:forEach>
		</table>
	</body>
</html>
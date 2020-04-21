<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html>
<html>
	<%@ include file="/WEB-INF/include/header.jsp" %>
		<form:form modelAttribute="utilisateur">
			<h3><spring:message code="t.ajout"/></h3>
			<table>
				<tr>
					<td><spring:message code="l.prenom"/></td>
					<td><form:input path="prenom" />
					<form:errors path="prenom" element="span" cssClass="erreur"/></td>
				</tr>
				<tr>
					<td><spring:message code="l.nom"/></td>
					<td><form:input path="nom" />
					<form:errors path="nom" element="span" cssClass="erreur"/></td>
				</tr>
				<tr>
					<td><spring:message code="l.compte"/></td>
					<td><form:input path="nomDeCompte" />
					<form:errors path="nomDeCompte" element="span" cssClass="erreur"/></td>
				</tr>
				<tr>
					<td><spring:message code="l.motDePasse"/></td>
					<td><form:password path="motDePasse" />
					<form:errors path="motDePasse" element="span" cssClass="erreur"/></td>
				</tr>
				<tr>
					<td colspan="2" style="align: center;">
						<input type="submit" value="<spring:message code="b.ajout"/>"/>
					</td>
				</tr>
			</table>
		</form:form>
	</body>
</html>
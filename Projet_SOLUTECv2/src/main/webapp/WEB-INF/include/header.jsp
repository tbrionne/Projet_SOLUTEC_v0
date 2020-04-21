	<head>
		<meta charset="ISO-8859-1">
		<title>Gestion des utilisateurs</title>
		<link type="text/css" rel="stylesheet" href="css/index.css">
	</head>
	<body>
		<header>
			<a href="${request.getServletContext()}"><spring:message code="t.home"/></a>
			<a href="${requestScope['javax.servlet.forward.resquest_uri']}?lang=fr"><img class="icone" src="img/fr.jpg" alt="Traduire en français" /></a>
			<a href="${requestScope['javax.servlet.forward.resquest_uri']}?lang=us"><img class="icone" src="img/us.jpg" alt="Translate to English" /></a>
			<h1><spring:message code="t.principal"/></h1>
		</header>
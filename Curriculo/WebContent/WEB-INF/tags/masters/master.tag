<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="controls" tagdir="/WEB-INF/tags/controls" %>

<%@ attribute name="header" fragment="true"%>
<%@ attribute name="body" fragment="true"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html ng-app="curriculo">
	<head>
		<title>{{titulo}}</title>
		
		<c:url var="curriculoCss" value="/resources/css/curriculo.css" />
		<c:url var="angularJs" value="/resources/scripts/angular.js" />
		<c:url var="curriculoJs" value="/resources/scripts/curriculo.js" />
		
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css" />
		<link rel="stylesheet" href="${curriculoCss}"  />
		
		<script src="//code.jquery.com/jquery-1.11.2.min.js"></script>
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
		<script src="${angularJs}"></script>
		<script src="${curriculoJs}"></script>
	
		<jsp:invoke fragment="header" />
	</head>

	<body>
		<nav class="navbar navbar-inverse navbar-fixed-top">
			<div class="container-fluid">
				<div class="navbar-header">
					<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
						<span class="sr-only">Toggle navigation</span> 
						<span class="icon-bar"></span> 
						<span class="icon-bar"></span> 
						<span class="icon-bar"></span>
					</button>
					<a class="navbar-brand" href="#">Currículo</a>
				</div>
			</div>
		</nav>
	
		<controls:messageBox />
	
		<div class="container">
			<jsp:doBody />
		</div>
	</body>
</html>

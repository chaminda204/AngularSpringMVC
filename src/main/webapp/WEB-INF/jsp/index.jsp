<!doctype html>
<%-- <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> --%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page isELIgnored="false"%>
<spring:url value="/resources" var="resourceUrl" />

<html lang="en" ng-app="studentApp">
<head>

<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link href="${resourceUrl}/bootstrap/css/bootstrap.css" rel="stylesheet">
<link href="${resourceUrl}/bootstrap/css/bootstrap-responsive.css" rel="stylesheet">
<link href="${resourceUrl}/css/styles.css" rel="stylesheet">
<script src="${resourceUrl}/js/angular.js"></script>
<script src="${resourceUrl}/js/angular-route.js"></script>
<script src="${resourceUrl}/controllers/app.js"></script>
<script src="${resourceUrl}/controllers/studentController.js"></script>


</head>
<body>
	<div class="sapn12 content">
		<div class="span12 nav-bar">
			<ul class="nav nav-pills">
				<li class="active"><a href="#">Home</a></li>
				<li><a href="#">Students</a></li>
				<li><a href="#">Academic</a></li>
				<li><a href="#">More Stuff</a></li>
			</ul>
		</div>
		<br>
		<div class="container greyBackground span12">
			<div ng-view></div>
		</div>

		<div class="footer span12">
			<p class="footer-text">Example courtesy by Chaminda</p>
		</div>
	</div>
</body>
</html>
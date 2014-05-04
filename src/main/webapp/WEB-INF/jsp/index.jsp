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
<script src="${resourceUrl}/js/app.js"></script>
<script src="${resourceUrl}/controllers/studentController.js"></script>


</head>
<body>
<br>

	<div class="container greyBackground" >
	${resourceUrl}
		<h4> Student Details</h4>
		<div ng-view></div>
	</div>
</body>
</html>
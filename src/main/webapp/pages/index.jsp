<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title>Spring Security Simple Application</title>

    <link href="<c:url value="/pages/css/bootstrap.css" />" rel="stylesheet">

    <link href="<c:url value="/pages/css/jumbotron-narrow.css" />" rel="stylesheet">

    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
</head>

<body>

<div class="container">

    <div class="jumbotron" style="margin-top: 20px;">
        <h1>Student.com</h1>

        <p class="lead">Welcome to Online Student Demo!</p>

        <p class="lead">Please, login to access your account.</p>
        <sec:authorize access="!isAuthenticated()">
            <p><a class="btn btn-lg btn-success" href="<c:url value="/login" />" role="button">Sign In</a></p>
        </sec:authorize>
        <sec:authorize access="isAuthenticated()">
            <p>Your login: <sec:authentication property="principal.username"/></p>

            <p><a class="btn btn-lg btn-danger" href="<c:url value="/logout" />" role="button">Sign Out</a></p>

        </sec:authorize>
    </div>

    <div class="footer">
        <p>&copy; Student Demo 2015</p>
    </div>

</div>
</body>
</html>

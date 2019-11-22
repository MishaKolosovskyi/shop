<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
<head>
    <title>Edit User</title>
</head>
<body>
<center>
    <form action="<spring:url value="/admin/user/edit/${id}"/>" method="post">
        ${editUserMessage}
        <br>
        <br>
        First name:<br>
        <input type="text" name="firstName" value="${user.firstName}" required/>
        <br>
        Last name:<br>
        <input type="text" name="lastName" value="${user.lastName}" required/>
        <br>
        Email:<br>
        <input type="email" name="email" value="${user.email}" required/>
        <br>
        Address:<br>
        <input type="text" name="address" value="${user.address}" required/>
        <br>
        Password:<br>
        <input type="text" name="password" value="${user.password}" required/>
        <br>
        Repeat password:<br>
        <input type="text" name="repeatPassword" value="${repeatPassword}" required/>
        <br>
        <br>
        User<input type="radio" name="role" value="ROLE_USER">
        Admin<input type="radio" name="role" value="ROLE_ADMIN">
        <br>
        <br>
        <input type="submit" value="Edit"/>
    </form>
</center>
</body>
</html>

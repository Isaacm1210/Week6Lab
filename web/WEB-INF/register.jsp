<%-- 
    Document   : register
    Created on : 12-Oct-2022, 7:24:16 PM
    Author     : mhame
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Shopping List</title>
    </head>
    <body>
        <h1>Shopping List</h1>
        <div>
            <form action="ShoppingList" method="post" >
                Username: <input type="text" name="username" value="${username}">
                <input type="hidden" name="action" value="register">
                <input type="submit" value="Register Name">
            </form>
        </div>
    </body>
</html>

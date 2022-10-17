<%-- 
    Document   : shoppingList
    Created on : 12-Oct-2022, 7:24:33 PM
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
        
        <div>Hello, ${user}</div>
            <a href="ShoppingList?action=logout" name="logout">Logout</a>  
            
        <form action="ShoppingList" method="post">
            Add Item: <input type="text" name="item" value="">
            <input type="hidden" name="action" value="add">
            <input type="submit" value="add">
        </form>
            
            
    </body>
</html>

<%-- 
    Document   : shoppingList
    Created on : 12-Oct-2022, 7:24:33 PM
    Author     : mhame
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Shopping List</title>
    </head>
    <body>
        <h1>Shopping List</h1>
        <div>Hello, ${username} 
        <a href="ShoppingList" name="logout">Logout</a>
        </div>
        <form>
            Add Item: <input type="text" name="item" value="">
            <input type="submit" name="add" value="add">
        </form>
    </body>
</html>

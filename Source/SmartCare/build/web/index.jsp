<%-- 
    Document   : startPage
    Created on : 27-Nov-2020, 19:20:15
    Author     : bupal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SmartCare</title>
        <link href="bootstrap/css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
            <form action="/SmartCare/login" method="get">
                   <button type="submit" class="btn btn-secondary">Login</button>
            </form>
                        <form action="/SmartCare/register" method="get">
                   <button type="submit" class="btn btn-secondary">Register new user</button>
                </form>

    </body>
</html>

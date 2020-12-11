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
        <div align="center">
            <h5 class="card-header">Welcome to SmartCare</h5>

            <div align="center">
                <h3>I Am</h3>
                <a href="patientLogin.jsp?id=>" class="btn btn-primary btn-lg active" role="button" aria-pressed="true">Patient</a>
                <a href="staffLogin.jsp?id=>" class="btn btn-primary btn-lg active" role="button" aria-pressed="true">Staff</a>
                <a href="adminLogin.jsp?id=>" class="btn btn-primary btn-lg active" role="button" aria-pressed="true">Admin</a>
            </div>
        </div>

    </body>
</html>

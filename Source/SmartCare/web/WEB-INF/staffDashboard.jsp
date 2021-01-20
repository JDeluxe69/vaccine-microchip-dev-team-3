<%-- 
    Document   : staffDashboard
    Created on : 06-Dec-2020, 17:59:08
    Author     : bupal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Staff Dashboard</title>
        <link href="bootstrap/css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div  class="dashboard" align="center">
            <h1>Staff Dashboard</h1>
            <div class="appointment-card">
                <h5 class="card-header">Welcome to SmartCare</h5>
                <div class="col-8">
                ${appointmentsTable}
                </div>
                <div class="col-8">
                   ${table}
                </div>
            </div>
        </div>
    </body>
</html>

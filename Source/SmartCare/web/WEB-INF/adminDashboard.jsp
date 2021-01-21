<%-- 
    Document   : adminDashboard
    Created on : 06-Dec-2020, 19:57:07
    Author     : bupal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Dashboard</title>
        <link href="bootstrap/css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
                    <div>
                <form action="/SmartCare/logout" method="post">
                   <button type="submit" class="btn btn-secondary">Logout</button>
                </form>
            </div>
        <div  class="dashboard" align="center">
            <h1>Admin Dashboard</h1>
            <div class="admin-card">
                <h5 class="card-header">Welcome to SmartCare</h5>
                <h4>This months turnover: £${totalTurnover}</h4>
                <div class="col-8">
                    <br>
                                    <div class="col-8">
                                        <h4>Users to verify</h4>  
                                        ${verifyClients}
                    <br>                    
                    <h4>NHS users</h4>
                    ${nhsClients}
                    <br>
                    <h4>All users</h4>
                   ${table}
                </div>
                    <a  class="btn btn-primary btn-lg active"  role="button" aria-pressed="true">Patient Records</a>
                    <a  class="btn btn-primary btn-lg active" role="button" aria-pressed="true">Staff Records</a>
                    <a  class="btn btn-primary btn-lg active" role="button" aria-pressed="true">Calculate Revenue</a>
                </div>
            </div>
        </div>
    </body>
</html>

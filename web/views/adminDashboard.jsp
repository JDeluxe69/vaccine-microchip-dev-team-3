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
        <link href="../bootstrap/css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <link href="../bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div  class="dashboard" align="center">
            <h1>Admin Dashboard</h1>
            <div class="admin-card">
                <h5 class="card-header">Welcome to SmartCare</h5>
                <div class="col-8">
                    <br>

                    <a href="patientRecords.jsp?id=>" class="btn btn-primary btn-lg active"  role="button" aria-pressed="true">Patient Records</a>
                    <a href="staffRecords.jsp?id=>" class="btn btn-primary btn-lg active" role="button" aria-pressed="true">Staff Records</a>
                    <a href="calcRevenue.jsp?id=>" class="btn btn-primary btn-lg active" role="button" aria-pressed="true">Calculate Revenue</a>
                </div>
            </div>
        </div>
    </body>
</html>
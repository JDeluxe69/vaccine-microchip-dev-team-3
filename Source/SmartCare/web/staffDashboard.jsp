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
                    <table class="table table-striped">
                        <thead class="thead-dark">
                            <tr>
                                <th scope="col">NHS Number</th>
                                <th scope="col">Full name</th>
                                <th scope="col">Email</th>
                                <th scope="col">Time</th>
                                <th scope="col">Date</th>
                                <th scope="col">NHS/Private</th>
                                <th scope="col">Service</th>
                                <th scope="col">Complete</th>
                                <th scope="col">Forward</th>
                                <th scope="col">Prescription</th>

                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <th scope="row">1</th>
                                <td>Mark Otto</td>
                                <td>@mdopolol.com</td>
                                <td>11:00</td>
                                <td>17.12.2020</td>
                                <td>NHS</td>
                                <td>Surgery</td>

                                <td><a href="complete.jsp?id=>">COMPLETE</a></td>
                                <td><a href="forwardPatient.jsp?id=>">FORWARD</a></td>
                                <td><a href="issuePrescription.jsp?id=>">ISSUE</a></td>
                            </tr>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </body>
</html>

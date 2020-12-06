<%-- 
    Document   : patientRecords
    Created on : 06-Dec-2020, 20:22:49
    Author     : bupal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Patient Records</title>
        <link href="bootstrap/css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div  class="patientRecords" align="center">
            <h1>Patient Records</h1>
            <div class="admin-card">
                <h5 class="card-header">Admin:>> ADMIN USERNAME GOES HERE<<<</h5>
                <div class="col-8">
                    <table class="table table-striped">
                        <thead class="thead-light">
                            <tr>
                                <th scope="col">NHS Number</th>
                                <th scope="col">Full name</th>
                                <th scope="col">Email</th>
                                <th scope="col">Time</th>
                                <th scope="col">Date</th>
                                <th scope="col">NHS/Private</th>
                                <th scope="col">Service</th>
                                <th scope="col">Cost</th>
                                <th scope="col">Prescribed</th>


                                <th scope="col">Delete</th>
                                <th scope="col">Update</th>
                                <th scope="col">Issue Prescription</th>
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
                                <td>1000</td>
                                <td>No</td>

                                <td><a href="deletePatient.jsp?id=>">Delete</a></td>                             
                                <td><a href="updatePatient.jsp?id=>">Update</a></td>
                                <td><a href="issuePerscription.jsp?id=>">Issue</a></td>
                            </tr>
                        </tbody>
                    </table>
                </div>
            </div>
            <a href="addPatient.jsp?id=>" class="btn btn-primary btn-lg active"  role="button" aria-pressed="true">Add Patient</a>
        </div>
    </div>
</body>
</html>

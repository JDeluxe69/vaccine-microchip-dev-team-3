<%-- 
    Document   : staffRecords
    Created on : 07-Dec-2020, 15:58:24
    Author     : Abdirahman Ali - 13013021
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Staff Records</title>
        <link href="../bootstrap/css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <link href="../bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div  class="patientRecords" align="center">
            <h1>Staff Records</h1>
            <div class="admin-card">
                <h5 class="card-header">Admin:>> ADMIN USERNAME GOES HERE<<<</h5>
                <div class="col-8">
                    <table class="table table-striped">
                        <thead class="thead-light">
                            <tr>
                                <th scope="col">Staff ID</th>
                                <th scope="col">First name</th>
                                <th scope="col">Last name</th>
                                <th scope="col">Email</th>
                                <th scope="col">Title</th>

                                <th scope="col">Delete</th>
                                <th scope="col">Update</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <th scope="row">125670</th>
                                <td>Ronan</td>
                                <td>Barb</td>
                                <td>ronan.Barb@smartcare.com</td>
                                <td>Doctor</td>

                                <td><a href="deleteStaff.jsp?id=>">Delete</a></td>                             
                                <td><a href="updateStaff.jsp?id=>">Update</a></td>
                            </tr>    

                            <tr>
                                <th scope="row">123005</th>
                                <td>Mia</td>
                                <td>James</td>
                                <td>Mia.James@smartcare.com</td>
                                <td>Nurse</td>

                                <td><a href="deleteStaff.jsp?id=>">Delete</a></td>                             
                                <td><a href="updateStaff.jsp?id=>">Update</a></td>
                            </tr>  
                        </tbody>
                    </table>
                </div>
            </div>
            <a href="addStaff.jsp?id=>" class="btn btn-primary btn-lg active"  role="button" aria-pressed="true">Add Staff</a>
        </div>
    </body>
</html>

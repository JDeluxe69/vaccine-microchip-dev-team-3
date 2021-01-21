<%-- 
    Document   : PatientDashboard
    Created on : 06-Dec-2020, 17:28:17
    Author     : bupal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Patient Dashboard</title>
        <link href="bootstrap/css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div  class="dashboard" align="center">
                        <div>
                <form action="/SmartCare/logout" method="post">
                   <button type="submit" class="btn btn-secondary">Logout</button>
                </form>
            </div>
            <h1 align="center">Patient Dashboard</h1>
            <div align="center">
                               <div>
                    <h4>Book an appointment</h4>
                    <h5>My Id: ${myId}</h5>
                <form  action="/SmartCare/book" method="post">
                    <div class="form-group">
                        <label for="staffId">Staff number</label>
                        <input type="text" class="form-control" id="staffId" placeholder="Staff number" name="staffId" value="">
                    </div>
                    <div class="form-group">
                        <label for="patientId">Patient number</label>
                        <input type="text" class="form-control" id="patientId" placeholder="Patient number" name="patientId" value="">
                    </div>
                    <div class="form-group">
                        <label for="inputPassword">Comments </label>
                        <input type="text" class="form-control" id="comments" placeholder="Comments" name="comments" value="">
                    </div>
                    <div class="form-group">
                        <label for="inputDate">Date of Birth</label>
                        <input type="date" name="appointmentStart" class="form-control" id="inputDate" placeholder="Appointment date" value="">
                    </div>
                    <div class="form-group">
                        <label for="inputPassword">Duration</label>
                        <input type="time" class="form-control" id="comments" placeholder="Duration" name="duration" value="">
                    </div>
                    <button type="submit" class="btn btn-secondary">Book</button>
                   </form>    

                <br/>
                <br/>

                <div class="card text-center">
                    <div class="card-header">
                        Pay Now:
                    </div>
                <div class="col-8">
                <h4>My appointments</h4>
                ${appointmentsTable}
                </div>
                    <div class="card-footer text-muted">
                        Pay in full
                    </div>
                </div>
                
                
            </div>
        </div>
    </body>
</html>

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
            <div>
                <form action="/SmartCare/logout" method="post">
                   <button type="submit" class="btn btn-secondary">Logout</button>
                </form>
            </div>
            
            <div class="appointment-card">
                <h5 class="card-header">Welcome to SmartCare</h5>
                
                <div>
                    <h4>Book an appointment</h4>
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
                </div>
                <div class="col-8">
                <h4>Existing appointments</h4>
                ${appointmentsTable}
                </div>
                <div class="col-8">
                    <h4>All clients</h4>
                   ${table}
                </div>
            </div>
        </div>
    </body>
</html>

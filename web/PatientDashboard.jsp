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
            <h1 align="center">Patient Dashboard</h1>
            <div align="center">
                <div class="appointment-card">
                    <h5 class="card-header">Welcome to SmartCare</h5>
                    <div class="card-body">
                        <h5 class="card-title">You have an appointment:</h5>
                        <div class="appointment-checkbox">
                            <input type="checkbox" class="input_time" id="input_time">
                            <label class="label_time" for="customControlInline">PLACE THE APPOINTMENT TIME IN HERE FROM GOOGLE API</label>
                        </div>
                        <a href="cancelAppointment.jsp?id=>" class="btn btn-primary active">CANCEL</a>
                    </div>
                </div>

                <a href="bookAppointment.jsp?id=>" class="btn btn-primary btn-lg active" role="button" aria-pressed="true">Book Appointment</a>
                <a href="requestPrescription.jsp?id=>" class="btn btn-primary btn-lg active" role="button" aria-pressed="true">Request Prescription</a>

                <br/>
                <br/>

                <div class="card text-center">
                    <div class="card-header">
                        Pay Now:
                    </div>
                    <div class="card-body">
                        <p class="card-text">1000.00.</p>
                        <a href="pay.jsp?id=>" class="btn btn-primary btn-lg active">PAY</a>
                    </div>
                    <div class="card-footer text-muted">
                        Pay in full
                    </div>
                </div>


            </div>
        </div>
    </body>
</html>

<%-- 
    Document   : patientSignup
    Created on : 27-Nov-2020, 19:22:37
    Author     : bupal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Signup</title>
        <link href="bootstrap/css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div align="left" class="allpage">
            <h3 align="center"> Registeration </h3>
                <form  action="/SmartCare/register" method="post">
                    <div class="form-group">
                        <label for="inputUserName">Username</label>
                        <input type="text" name="username" class="form-control" id="inputUserName" placeholder="Username" value="">
                    </div>
                    <div class="form-group">
                        <label for="inputPassword">Password</label>
                        <input type="password" name="password" class="form-control" id="inputPassword" placeholder="Password" value="">
                    </div>
                    <div class="form-group">
                        <label for="inputFullName">Full Name</label>
                        <input type="text" name="fullName" class="form-control" id="inputFullName" placeholder="Full Name" value="">
                    </div>
                    <div class="form-group">
                        <label for="inputAddress">Address</label>
                        <input type="text" name="address" class="form-control" id="inputAddress" placeholder="Address" value="">
                    </div>
                    <div class="form-group">
                        <label for="inputDob">Date of Birth</label>
                        <input type="date" name="dob" class="form-control" id="inputDob" placeholder="Date of birth" value="">
                    </div>
                                    <div class="form-check">
                    <label class="radio-inline">
                      <input type="radio" name="isNhs" value="0">Private
                    </label>
                    <label class="radio-inline">
                      <input type="radio" name="isNhs" value="1" checked>NHS
                    </label>
                    </div>
                    <div class="form-check">
                    <label class="radio-inline">
                      <input type="radio" name="clientType" value="0">Doctor
                    </label>
                    <label class="radio-inline">
                      <input type="radio" name="clientType" value="1" checked>Patient
                    </label>
                    <label class="radio-inline">
                      <input type="radio" name="clientType" value="2">Nurse
                    </label>
                    </div>
                    <button type="submit" class="btn btn-secondary">Register</button>
                </form>  

        
    </body>
</html>

<%-- 
    Document   : calcRevenue
    Created on : 11-Dec-2020, 14:58:27
    Author     : Abdirahman Ali - 13013021
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calculate Revenue</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    </head>
    <body>
        <div class="admin-card" align="center">
            <h5 class="card-header">Revenue (£)</h5>
            <div class="col-8">
                <div class="addStaff">
                    <div class="btn-group btn-group-toggle" data-toggle="buttons">
                        <label class="btn btn-primary">
                            <input type="radio" name="options" id="daily" autocomplete="on" checked> Daily
                            <h5>2,300</h5>
                        </label>

                        <label class="btn btn-dark">
                            <input type="radio" name="options" id="weekly" autocomplete="off"> Weekly
                            <h5>10,400</h5>
                        </label>

                        <label class="btn btn-success">
                            <input type="radio" name="options" id="monthly" autocomplete="off"> Monthly
                            <h5>41,500</h5>
                        </label>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>

<%-- 
    Document   : index
    Created on : 15 Oct, 2019, 5:53:21 PM
    Author     : shubham
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>  
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            body{
                margin: 0px;
                padding: 0px;
                overflow-y: hidden; 
            }
            #maindiv{
                width: 60%;
                height: 660px;
                float: left;
            }
            #forms{
                width: 40%;
                height: 660px;
                float: right;
            }
            input[type=text], select {
                width: 100%;
                padding: 12px 20px;
                margin: 8px 0;
                display: inline-block;
                border: 1px solid #ccc;
                border-radius: 4px;
                box-sizing: border-box;
            }

            input[type=submit] {
                width: 100%;
                background-color: #4CAF50;
                color: white;
                padding: 14px 20px;
                margin: 8px 0;
                border: none;
                border-radius: 4px;
                cursor: pointer;
            }

            input[type=submit]:hover {
                background-color: #45a049;
            }

            #formss {
                border-radius: 5px;
                background-color: #f2f2f2;
                padding: 10px;
                margin-top: 40px;
                margin-right: 20px;
            }
            #roadsinfo{
                float: left;
                width: 50%;
                height: inherit;
            }
            #showpath{
                float: right;
                height: inherit;
                width: 50%;
            }
            #parent{
                border-radius: 5px;
                background-color: #f2f2f2;
                padding: 10px;
                margin-top: 40px;
                margin-right: 20px;
                width: 500px;
                height: 250px;
            }
        </style>
    </head>
    <body>
        <div id="maindiv">
            <img src="map.jpg" style="height: inherit">
        </div>
        <div id="forms">
            <div id="formss">
                <form action="FindPath" method="Post">
                    <label for="fname">Source</label>
                    <select id="city" name="source">
                        <option value="0">Delhi</option>
                        <option value="1">Mumbai</option>
                        <option value="3">Bangalore</option>
                    </select>

                    <label for="lname">Destination</label>
                    <select id="country" name="destination">
                        <option value="1">Mumbai</option>
                        <option value="4">Kolkata</option>
                        <option value="3">Bangalore</option>
                        <option value="2">Ahmedabad</option>
                    </select>         
                    <input type="submit" value="Find Me Path">
                </form>
            </div>
            <div id="parent">
                <div id="roadsinfo">
                    <h1>Cities Connected<br></h1>
                    <h3>Delhi->Mumbai<br>
                        Delhi->Ahmedabad<br>
                        Mumbai->Ahmedabad<br>
                        Mumbai->Bangalore<br>
                        Mumbai->Kolkata<br>
                        Bangalore->Kolkata</h3>
                </div>
                <div id="showpath">
                    <h1>Path<br></h1>
                    ${path}
                </div>
            </div>
        </div>
    </body>
</html>

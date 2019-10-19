<%-- 
    Document   : mathclass
    Created on : 15 Oct, 2019, 8:13:42 PM
    Author     : shubham
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <style>
            body{
                overflow-y: hidden;
                margin: 0px;
                padding: 0px;
            }
            .container {
                position: relative;
                text-align: center;
                color: grey;
            }
            .centered {
                position: absolute;
                top: 40%;
                left: 50%;
                height: 488px;
                width: 770px;
                border-radius: 30px;
                background-color: #f2f2f2;
                transform: translate(-50%, -50%);
            }
        </style>
    </head>
    <body>
        <div class="container">
            <img src="board.png" alt="Snow" style="width:65%;">
            <div class="centered">
                <h1>Lets sort</h1>
                <form method="POST" action="MathClass">
                    <input type="number" name="n1" placeholder="Enter number..." required 
                           style="height: 30px; border-radius:30px;margin-left: 15px; text-align: center;">
                    
                    <input type="number" name="n2" style="height: 30px; border-radius:30px; 
                           margin-left: 15px;text-align: center;" placeholder="Enter number..." required >
                    
                    <input type="number" name="n3" style="height: 30px; border-radius:30px; 
                           margin-left: 15px;text-align: center;" placeholder="Enter number..." required >
                    
                    <input type="number" name="n4" style="height: 30px; border-radius:30px; 
                           margin-left: 15px;text-align: center; margin-top: 15px;" placeholder="Enter number..." required >
                    
                    <input type="number" name="n5" style="height: 30px; border-radius:30px; 
                           margin-left: 15px;text-align: center;" placeholder="Enter number..." required >
                    
                    <input type="number" name="n6" style="height: 30px; border-radius:30px; 
                           margin-left: 15px;text-align: center;" placeholder="Enter number..." required >
                    
                    <input type="number" name="n7" style="height: 30px; border-radius:30px; 
                           margin-left: 15px;text-align: center;"placeholder="Enter number..." required >
                    
                    <input type="number" name="n8" style="height: 30px; border-radius:30px; 
                           margin-left: 15px;text-align: center; margin-top: 15px;" placeholder="Enter number..." required >
                    
                    <input type="number" name="n9" style="height: 30px; border-radius:30px; 
                           margin-left: 15px;text-align: center;" placeholder="Enter number..." required >
                    
                    <input type="number" name="n10" style="height: 30px; border-radius:30px; 
                           margin-left: 15px;text-align: center; margin-top: 15px" placeholder="Enter number..." required >
                    
                    <input type="submit" id="submit" value="SUBMIT" style="height: 30px; 
                           margin-left: 15px; margin-top: 15px; width: 100px; background-color: #4CAF50;
                           display: inline-block; border: 1px solid #ccc; border-radius: 4px; 
                           box-sizing: border-box; color: white; font-size: 20px;"
                           placeholder="Enter number..." required >
                </form>
                <br>
                <h1>
                    Sorted Array:<br>
                    ${result}
                </h1>
            </div>
        </div>
    </body>
</html>



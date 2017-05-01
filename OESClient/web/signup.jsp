<%-- 
    Document   : signup
    Created on : Feb 4, 2017, 7:30:31 PM
    Author     : dell pc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    </head>
    <body>
        <form id="form1" action="signup" method="post">
            <div id="d">
                <h1 style="color:red;margin-left:30%" > User Sign Up</h1>
                <table>
                    <tr>
                        <td>Username:</td>
                        <td><input type="text" name="username" placeholder="Username" required></td>
                    </tr>
                    <tr>
                         <td>Password:</td>
                        <td><input id="Password1" type="password" name="Password" placeholder="Password" required></td>
                    </tr>
                    <tr>
                        <td>Email:</td>
                        <td><input type="email" name="Email" placeholder="Email" required></td>
                        
                    </tr>
                    <tr>
                        <td>Contact:</td>
                        <td><input id="contatctno" type="text" name="contactno"  required></td>
                       
                    </tr>
                    <tr>
                        <td><input type="submit" name="Name" value="Submit"></td>
                    </tr>
                </table>
            </div>
        </form>
        
    </body>
</html>

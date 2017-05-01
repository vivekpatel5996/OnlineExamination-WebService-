<%-- 
    Document   : signin
    Created on : Feb 4, 2017, 7:30:52 PM
    Author     : dell pc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    </head>
    <body>
        <form id="form2" action="signin" method="post">
                <div id="d1">
                <h1 style="color:red;margin-left:30%" >Login page</h1>
                <table>
                    <tr>
                        <td>
                            <label id="confi_msg"></label>
                        </td>
                    </tr>
                    <tr>
                    <td> Username: </td>
                    <td><input type="text" name="uname" placeholder="Username" required="true"/></td>
                    </tr>
                    <tr>
                    <td> Password: </td>
                 
                    
                    <td><input type="password" name="password" placeholder="Enter password" required="true"/></td>
                    </tr>
                    <tr>
                        <td><input type="submit" name="Name" value="Submit"></td>
                    </tr>
    
                </table>
        </form>
    </body>
    </html>

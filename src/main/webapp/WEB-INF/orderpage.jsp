<%-- 
    Document   : orderpage
    Created on : 21-03-2019, 21:07:32
    Author     : frizz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Customer orders homepage</title>
    </head>
    <body>
        <h1>Hello <%=request.getParameter( "email" )%> </h1>
        What lego house would you like to order?
        What's the length of your desired legohouse(in legodots)?
        What's the width of your desired legohouse(in legodots)?
        What's the height of your desired legohouse(in legobricks)?
        <div>
            <form id="addProduct" action="?action=order" method="POST">
                        <input type="hidden" name="action" value="order">
                        <table class="table table-striped">
                            <td><input type="text" name="length" placeholder="length" id="qtyInput"></td>
                            <td><input type="text" name="width" placeholder="width" id="qtyInput"></td>
                            <td><input type="text" name="height" placeholder="height" id="qtyInput"></td>
                            
                        </table>
            </form>
        </div>
    </body>
</html>

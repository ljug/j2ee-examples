
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Logout</title>
        
    </head>
    <body>
        <% session.invalidate(); 
         out.println("Merci "+request.getRemoteUser()); 
         out.println("A bientôt "+request.getUserPrincipal().getName());
       %>
        <center>
        Vous êtes déconnecté avec succès.
        <br>
        </center>
    </body>
</html>

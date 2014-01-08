<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SMB214 </title>
        <jsp:useBean id="b" class="isae.Params" scope="application" />
        <jsp:setProperty name="b" property="*" />
    </head>
    <body>
        
        <h1>Hello World!</h1>       
         <br/>
         Toto est ${b.toto} 
         <br/>
         Num = ${b.num}
       
    </body>
</html>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

    <h1> My Bank </h1>
        
         <form name="servletone" method="POST" action="LoginController">                  
                   
             <label for="pwd">User</label><br>
                <input type="text"  name="user" value="user"  /><br>
            
                <label for="pwd">Password:</label><br>
                <input type="password" id="pwd" name="pwd" > 
         
        
               <input type="submit" value="Submit">
        
               </form>

</body>
</html>
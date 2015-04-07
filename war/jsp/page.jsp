<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>home page</title>
  
            <h1>social network</h1>
            
             
</head>
<body>

    <p>  ${it.name} home page </p>
    <form action="/social/addFriend" method="post">
  name : <input type="text" name="uname" value="${it.name} " /> <br>
  yourname: <input type="text" name="name1" /> <br>
   <input type="submit" value="add frind"> 
  
  </form>
 
</body>
</html>
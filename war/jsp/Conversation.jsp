<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>home page</title>
 <marquee direction="left" behavior="alternate">
            <h1>social network</h1></marquee>
            <img src="image/logo.png"/>
            <marquee direction="left" behavior="alternate">
            <h1>page of Conversation ${it.name}</h1></marquee>
</head>
<body>

    <p>  ${it.name} home page </p>
    <form action="/social/conversationC" method="post">
  name : <input type="text" name="sender" value=" " /> <br>
  name1 : <input type="text" name="reciver1" value=" " /> <br>
  name2 : <input type="text" name="reciver2" value=" " /> <br>   
  name3 : <input type="text" name="reciver3" value=" " /> <br>
  message : <input type="text" name="Message" value=" " /> <br>
  
            <input type="submit" value="send message"/><br>
  
  </form>
 
</body>
</html>
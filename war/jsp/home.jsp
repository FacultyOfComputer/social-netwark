<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1256">
<title>Insert title here</title>
 
            <h1>social network</h1>
            
            
            <h1>${it.name}</h1>
</head>

<body>
<p>  home page </p>
<p> Welcome  ${it.name} </p>

<form action="/social/signout" method="post">
   
  <input type="submit" value="Sign Out"> 
  </form>
  
  <a href="/social/search/">search</a> <br><br>
  <a href="/social/add/">add friend</a> <br><br>
 <a href="/social/conversation/">chat Group</a> <br><br>
<a href="/social/SendMeassage/">chat</a> <br><br>
 


<form action="/social/acceptance" method="post">
    your name : <input type="text" name="uname" value="${it.name} " /> <br>
    acceptname: <input type="text" name="fname" /> <br>
   <input type="submit" value="Accept frind"> 
  </form>
</body>
</html>
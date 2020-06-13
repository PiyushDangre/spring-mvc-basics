<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Give your name man</title>
<form action="processForm" method="GET">	
	<input type="text" name="myName"/>
	<input type="submit" />
</form>

<hr>

<h2>You get your name uppercase'd</h2>
<form action="processFormUppercase" method="GET">	
	<input type="text" name="name" placeholder="Ypur Name"/>
	<input type="submit" />
</form>
<hr>
<h2>We gonna use @RequestParam to read name parameter</h2>
<form action="processFormVersion2" method="GET">	
	<input type="text" name="theName" placeholder="Ypur Name"/>
	<input type="submit" />
</form>
</head>
<body>

</body>
</html>
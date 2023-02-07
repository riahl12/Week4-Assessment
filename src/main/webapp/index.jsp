<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Addition Calculator</title>
</head>
<body>
	<h1>Addition Calculator</h1>
	<form action="getTwoNumbers" method="post">
	Please supply 2 whole numbers you would like to add together.
	<input type="text" name="number1">
	<input type="text" name="number2">
	<input type="submit" value="Enter">
	</form>
</body>
</html>
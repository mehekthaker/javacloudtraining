<!DOCTYPE html>
<html>
<head>
<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<style>
h1{
	text-align:center;
	font-family:"Serif";
	color:#CCCC00;
}
div{
	box-shadow: 5px 10px #888888;
	padding: 10px;

}

</style>
</head>
<body>

<div>
<h1>Online Book Shopping Portal</h1>
<a href="viewAll.app">Cart(${requestScope.cartCount})</a>
</div>

</body>
</html>
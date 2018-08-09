<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
<div>
	<jsp:include page="Header.jsp"></jsp:include>
</div>
<div style="align: center;">
		<h2>Book Details</h2>		
			<table>
				<tr>
					<th>Book ID</th>
					<th>Book Name</th>
					<th>Book Author Name</th>
					<th>Description</th>
					<th>Book Price</th>
				</tr>
				<jstl:forEach var="book" items="${requestScope.books}">
					<tr>
						<td>${book.bookId}</td>
						<td>${book.bookName}</td>
						<td>${book.authorName}</td>
						<td>${book.description}</td>
						<td>${book.bookPrice}</td>
						<td><a href="addtocart.app?bookId=${book.bookId}">Add To Cart</a></td>
					</tr>
				</jstl:forEach>
			</table>
	</div>
<div>
	<jsp:include page="Footer.jsp"></jsp:include>
</div>

</body>
</html>
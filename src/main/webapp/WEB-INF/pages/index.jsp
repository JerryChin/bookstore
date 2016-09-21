<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" isELIgnored="false" %>


<html>
<body>
<c:if test="${not empty message}">
    <div style="width: 400px; height: 40px; padding: 5px;">
        <p style="color:red; border:1px solid gray; background-color: #EAF2D3; border-radius:3px">${message}</p>
    </div>
</c:if>

<h1>Home page</h1>
<p>Welcome to my bookstore ;)</p>
<p>what you can do:
<p><a href="book/create">Add a new book</a></p>
<p><a href="book/list">List all books</a></p>
</body>
</html>

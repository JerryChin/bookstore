<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Developer
  Date: 2016/9/16
  Time: 19:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Bookshelf</title>
    <link href="${pageContext.request.contextPath}/css/style.css" rel="stylesheet" type="text/css">
</head>


<body>
<div class="content">
    <table id="books">
        <tr>
            <th>Id</th>
            <th>Title</th>
            <th>Author</th>
            <th>Genre</th>
            <th>Publish Date</th>
            <th>Price</th>
            <th>Description</th>
            <th>Action</th>
        </tr>

        <c:forEach var="item" items="${shopList}" varStatus="theCount">

            <tr class="<c:if test="${theCount.count % 2 == 0}">alt</c:if>">
                <td>${item.id}</td>
                <td>${item.title}</td>
                <td>${item.author}</td>
                <td>${item.genre}</td>
                <td>${item.publishDate}</td>
                <td>${item.price}</td>
                <td>${item.description}</td>
                <td><a href="${pageContext.request.contextPath}/book/edit/${item.id}">Edit</a>
                    <a href="${pageContext.request.contextPath}/book/delete/${item.id}">Delete</a></td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>

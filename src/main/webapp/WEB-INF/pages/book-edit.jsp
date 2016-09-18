<%--
  Created by IntelliJ IDEA.
  User: Developer
  Date: 2016/9/17
  Time: 12:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Edit an Existed Book</title>
</head>
<body>
<h3>Edit an Existed Book</h3>
<hr />
    <form action="${pageContext.request.contextPath}/book/edit/${book.id}" method="post" enctype="application/x-www-form-urlencoded">
        <table>
            <tr>
            <td>book id</td>
            <td><input type="text" name="id" maxlength="20" value="${book.id}"></td>
            </tr>
            <tr>
                <td>title</td>
                <td><input type="text" name="title" maxlength="20" value="${book.title}"></td>
            </tr>
            <tr>
                <td>author</td>
                <td><input type="text" name="author" maxlength="20" value="${book.author}"></td>
            </tr>
            <tr>
                <td>genre</td>
                <td><input type="text" name="genre" maxlength="20" value="${book.genre}"></td>
            </tr>
            <tr>
                <td>publish date</td>
                <td><input type="text" name="publishDate" maxlength="20" value="${book.publishDate}"> </td>
            </tr>
            <tr>
                <td>price</td>
                <td><input type="text" name="price" maxlength="20" value="${book.price}"></td>
            </tr>
            <tr>
                <td>description</td>
                <td><textarea rows="20" cols="40" name="description">${book.description}</textarea></td>
            </tr>
            <tr>
                <td colspan="2" align="middle">
                    <input type="submit" value="Submit">
                </td>
            </tr>
        </table>

    </form>


</body>
</html>

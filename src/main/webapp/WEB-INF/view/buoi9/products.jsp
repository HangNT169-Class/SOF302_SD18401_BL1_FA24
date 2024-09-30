<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>

    <thead>
    <tr>
        <th>ID</th>
        <th>Code</th>
        <th>Name</th>
        <th>Price</th>
        <th>Description</th>
        <th>Category Code</th>
        <th>Category Name</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${products}" var="item">
        <tr>
            <td>${item.id}</td>
            <td>${item.productCode}</td>
            <td>${item.productName}</td>
            <td>${item.price}</td>
            <td>${item.description}</td>
            <td>${item.cate.categoryCode}</td>
            <td>${item.cate.categoryName}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>

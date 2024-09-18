<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<table>
    <form action="">
        Tên: <input name="ten"/>
        <button type="submit">Search</button>
    </form>
    <br/>
    <button><a href="">Add Student</a></button>
    <tr>
        <th>STT</th>
        <th>MSSV</th>
        <th>Tên</th>
        <th>Tuổi</th>
        <th>Địa chỉ</th>
        <th>Giới tính</th>
        <th colspan="2">Action</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${lists}" var="sv" varStatus="i">
        <tr>
            <td>${i.index}</td>
            <td>${sv.masv}</td>
            <td>${sv.ten}</td>
            <td>${sv.diaChi}</td>
            <td>${sv.tuoi}</td>
            <td>${sv.gioiTinh}</td>
            <td>
                <%--C1: Giong J4: ? => lay ra controller: @RequestParam
                    C2: J5: /${giatri} => Lay ra controller : PathVariable
                 --%>
                <a href="/sinh-vien/remove/${sv.masv}">Delete</a>
                <a href="/sinh-vien/detail/${sv.masv}">Detail</a>
                <a href="/sinh-vien/view-update/${sv.masv}">Update</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>

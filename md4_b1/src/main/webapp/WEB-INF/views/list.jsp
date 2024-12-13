<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Danh sách cầu thủ</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.3.0/font/bootstrap-icons.css">
</head>
<body>
<div class="container mt-5">
    <h1>Danh sách cầu thủ</h1>
    <table class="table table-bordered">
        <thead>
        <tr>
            <th>ID</th>
            <th>Mã cầu thủ</th>
            <th>Họ và tên</th>
            <th>Ngày sinh</th>
            <th>Kinh nghiệm</th>
            <th>Vị trí</th>
            <th>Ảnh đại diện</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="player" items="${playerList}" varStatus="c">
            <tr>
                <td>${c.count}</td>
                <td>${player.maCauthu}</td>
                <td>${player.hoVaTen}</td>
                <td>${player.ngaySinh}</td>
                <td>${player.kinhNghiem}</td>
                <td>${player.viTri}</td>
                <td>
                    <img src="${player.anhDaiDien}" alt="Ảnh đại diện" style="width: 100px; height: auto;">
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>

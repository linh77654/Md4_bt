<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 12/16/2024
  Time: 3:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Student</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

</head>
<body>
<div class="container mt-5">
    <h1>Thêm cầu thủ mới</h1>
    <form action="/player/create" method="post">
        <div class="mb-3">
            <label for="maCauthu" class="form-label">Mã cầu thủ</label>
            <input type="text" class="form-control" id="maCauthu" name="maCauthu" required>
        </div>
        <div class="mb-3">
            <label for="hoVaTen" class="form-label">Họ và tên</label>
            <input type="text" class="form-control" id="hoVaTen" name="hoVaTen" required>
        </div>
        <div class="mb-3">
            <label for="ngaySinh" class="form-label">Ngày sinh</label>
            <input type="date" class="form-control" id="ngaySinh" name="ngaySinh" required>
        </div>
        <div class="mb-3">
            <label for="kinhNghiem" class="form-label">Kinh nghiệm</label>
            <input type="text" class="form-control" id="kinhNghiem" name="kinhNghiem" required>
        </div>
        <div class="mb-3">
            <label for="viTri" class="form-label">Vị trí</label>
            <input type="text" class="form-control" id="viTri" name="viTri" required>
        </div>
        <div class="mb-3">
            <label for="anhDaiDien" class="form-label">Ảnh đại diện</label>
            <input type="text" class="form-control" id="anhDaiDien" name="anhDaiDien" required>
        </div>
        <button type="submit" class="btn btn-primary">Thêm cầu thủ</button>
    </form>
</div>
</body>
</html>

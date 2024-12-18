<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Thêm cầu thủ</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
<div class="container mt-5">
    <h1>Thêm cầu thủ mới</h1>
    <form:form action="/player/create" method="post" modelAttribute="player">
        <div class="mb-3">
            <label for="playerCode" class="form-label">Mã cầu thủ</label>
            <form:input type="text" class="form-control" id="playerCode" path="playerCode" />
        </div>
        <div class="mb-3">
            <label for="fullName" class="form-label">Họ và tên</label>
            <form:input type="text" class="form-control" id="fullName" path="fullName" />
        </div>
        <div class="mb-3">
            <label for="birthDate" class="form-label">Ngày sinh</label>
            <form:input type="date" class="form-control" id="birthDate" path="birthDate" />
        </div>
        <div class="mb-3">
            <label for="experience" class="form-label">Kinh nghiệm</label>
            <form:input type="text" class="form-control" id="experience" path="experience" />
        </div>
        <div class="mb-3">
            <label for="position" class="form-label">Vị trí</label>
            <form:input type="text" class="form-control" id="position" path="position" />
        </div>
        <div class="mb-3">
            <label for="avatarUrl" class="form-label">Ảnh đại diện</label>
            <form:input type="text" class="form-control" id="avatarUrl" path="avatarUrl" />
        </div>
        <button type="submit" class="btn btn-primary">Thêm cầu thủ</button>
    </form:form>
</div>
</body>
</html>

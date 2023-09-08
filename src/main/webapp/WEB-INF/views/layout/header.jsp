<%@ page language="java" contentType="text/html; charset-UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>

<html lang="en">
<head>
    <title>Yeon's blog</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
    <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.4/dist/jquery.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
</head>

<body>
<nav class="navbar navbar-expand-mg bg-dark navbar-dark">
    <div class="navbar navbar-expand-sm bg-dark navbar-dark">
        <ul class="navbar-nav">
            <li class="nav-item active">
                <a class="nav-link" href="/user">Yeon's blog</a>
            </li>
            <c:choose>
                <c:when test="${empty sessionScope.principal}">
                    <li class="nav-item">
                        <a class="nav-link" href="/user/loginForm">로그인</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="/user/signupForm">회원가입</a>
                    </li>
                </c:when>
                <c:otherwise>
                    <li class="nav-item">
                        <a class="nav-link" href="/board/writeForm">글쓰기</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="/user/userForm">회원정보</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="/user/logout">로그아웃</a>
                    </li>
                </c:otherwise>
            </c:choose>

        </ul>
    </div>

    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#collapsibleNavbar">
        <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="collapsibleNavbar">
        <ul class="navbar-nav">
            <li class="nav-item">
                <a class="nav-link" href="#">전체보기</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#">Daily:)</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#">Travel:p</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#">Review:D</a>
            </li>
        </ul>
    </div>
</nav>

<br>
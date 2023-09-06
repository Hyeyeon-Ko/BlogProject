<%@ page language="java" contentType="text/html; charset-UTF-8" pageEncoding="UTF-8" %>

<%@include file="../layout/header.jsp" %>

<div class="container">
    <form action="/user/signup">
        <div class="form-group">
            <label for="user_id">Username:</label>
            <input type="text" class="form-control" placeholder="Enter Id" id="user_id">
        </div>

        <div class="form-group">
            <label for="user_pw">Password:</label>
            <input type="password" class="form-control" placeholder="Enter Password" id="user_pw">
        </div>

        <div class="form-group">
            <label for="email">Email:</label>
            <input type="email" class="form-control" placeholder="Enter Email" id="email">
        </div>
    </form>
    <button id="btn-save" class="btn btn-primary">Sign up</button>

</div>

<script src="/js/user.js"></script>
<%@include file="../layout/footer.jsp" %>
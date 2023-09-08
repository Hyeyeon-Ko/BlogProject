<%@ page language="java" contentType="text/html; charset-UTF-8" pageEncoding="UTF-8" %>


<%@include file="../layout/header.jsp" %>

<div class="container">
    <form>
        <div class="form-group">
            <label for="user_id">Id:</label>
            <input type="text" class="form-control" placeholder="Enter Id" id="user_id">
        </div>
        <div class="form-group">
            <label for="user_pw">Password:</label>
            <input type="password" class="form-control" placeholder="Enter Password" id="user_pw">
        </div>
        <div class="form-group form-check">
            <label class="form-check-label">
                <input class="form-check-input" type="checkbox"> Remember me
            </label>
        </div>
    </form>
    <button id="btn-login" class="btn btn-primary">Sign in</button>
</div>

<script src="/js/user.js"></script>
<%@include file="../layout/footer.jsp" %>
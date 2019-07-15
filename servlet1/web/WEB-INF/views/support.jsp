<%--
  Created by IntelliJ IDEA.
  User: nguyenngocvu
  Date: 2019-07-14
  Time: 14:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>SupportServlet</title>
    <link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
          rel="stylesheet">
    <style>
        .submitted {
            display: none;
        }
    </style>

</head>
<body>
<div class="container" >
    <form action="/support" method="post">
        <div class="form-group">
            <label for="name">Name</label>
            <input type="text" class="form-control" id="name" name="name" aria-describedby="nameHelp" placeholder="Enter name">
            <small id="nameHelp" class="form-text text-muted">We'll never share your name with anyone else.</small>
        </div>
        <div class="form-group">
            <label for="email">Email address</label>
            <input type="email" class="form-control" id="email" name="email" aria-describedby="emailHelp" placeholder="Enter email">
            <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
        </div>
        <div class="form-group">
            <label for="problem">Problem</label>
            <input type="text" class="form-control" id="problem" name="problem" aria-describedby="problemHelp" placeholder="Enter problem">
        </div>
        <div class="form-group">
            <label for="problemDescription">Problem description</label>
            <textarea class="form-control" id="problemDescription" name="problemDescription" rows="3"></textarea>
        </div>
        <button type="submit" class="btn btn-primary">Help</button>
    </form>
</div>

<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>

</body>
</html>

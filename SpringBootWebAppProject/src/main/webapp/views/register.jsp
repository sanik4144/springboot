<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Register</title>
</head>
<body>
    <h2>Register Here</h2>

    <c:if test="${not empty successMsg}">
        <h4 style="color:green"> ${successMsg} </h4>
    </c:if>
    <c:if test="${not empty errorMsg}">
        <h4 style="color:red"> ${errorMsg} </h4>
    </c:if>

    <form action="postUserPage" method="post">
        <label>Name: </label>
        <input type="text" name="name"><br><br>
        <label>Email: </label>
        <input type="text" name="email"><br><br>
        <label>Password: </label>
        <input type="password" name="password"><br><br>

        <input type="submit" name="register" value="Register">
    </form>
</body>
</html>
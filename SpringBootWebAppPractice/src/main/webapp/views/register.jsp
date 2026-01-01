<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Register</title>
</head>
<body>
    <h2>Register</h2>
    <c:if test="${not empty successMsg}">
            <h4 style="color:green"> ${successMsg} </h4>
    </c:if>

    <c:if test="${not empty errorMsg}">
            <h4 style="color:red"> ${errorMsg} </h4>
    </c:if>
    <form action="registerPerson" method="POST">
        Name: <input type="text" name="name"> <br><br>
        Email: <input type="text" name="email"> <br><br>
        Password: <input type="password" name="password"> <br><br>
        <input type="submit" name="register" value="Register"> <br><br>
    </form>
</body>
</html>
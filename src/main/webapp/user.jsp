<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link type="text/css"
          href="css/ui-lightness/jquery-ui-1.8.18.custom.css" rel="stylesheet" />
    <script type="text/javascript" src="js/jquery-1.7.1.min.js"></script>
    <script type="text/javascript" src="js/jquery-ui-1.8.18.custom.min.js"></script>
    <title>Add new user</title>
</head>
<body>

<form method="POST" action='UserController' name="formAddUser">
    User ID : <input type="text" readonly="readonly" name="id"
                     value="<c:out value="${user.id}" />" /> <br />
    First Name : <input
        type="text" name="firstname"
        value="<c:out value="${user.firstName}" />" /> <br />
    Last Name : <input
        type="text" name="lastname"
        value="<c:out value="${user.lastName}" />" /> <br />
    Age : <input type="text" name="age"
                 value="<c:out value="${user.age}" />" /> <br /> <input
        type="submit" value="Добавить" />
</form>
</body>
</html>
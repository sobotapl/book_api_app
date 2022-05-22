<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Delete Confirmation</title>
</head>
<body>
Sure to delete: ${book.title}?
<a href="/admin/books/delete/${book.id}">Confirm</a>
<a href="/admin/books/all">Cancel</a>
</body>
</html>
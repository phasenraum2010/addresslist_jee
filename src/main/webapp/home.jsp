<%@ include file="taglibs.jsp"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Home JSP</title>
</head>
<body>
<h1>Home JSP</h1>
<table>
    <tr>
        <th>name</th>
        <th>Street</th>
        <th>houseNumber</th>
        <th>zip</th>
        <th>city</th>
        <th>&nbsp;</th>
        <th>&nbsp;</th>
    </tr>
    <c:forEach items="${addresses}" var="address">
        <tr>
            <td>${address.name}</td>
            <td>${address.street}</td>
            <td>${address.houseNumber}</td>
            <td>${address.zip}</td>
            <td>${address.city}</td>
            <td><a href="${ctx}/edit?id=${address.id}">Edit</a></td>
            <td><a href="${ctx}/delete?id=${address.id}">Delete</a></td>
        </tr>
    </c:forEach>
</table>
<a href="${ctx}/new">Neue Adresse einf&uuml;gen</a>
</body>
</html>

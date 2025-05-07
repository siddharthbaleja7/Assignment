<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html><body>
<h2>Students List</h2>
<a href="/students/new">Add New Student</a>
<table border="1">
    <tr><th>ID</th><th>Name</th><th>Email</th><th>Actions</th></tr>
    <c:forEach items="${students}" var="stu">
        <tr>
            <td>${stu.id}</td><td>${stu.name}</td><td>${stu.email}</td>
            <td><a href="/students/edit/${stu.id}">Edit</a></td>
        </tr>
    </c:forEach>
</table>
</body></html>
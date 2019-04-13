<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>新增</title>
</head>
<body>
    <form action="/test/update" method="post">
        <table>
            <tr>
                <td>学生编号:</td>
                <td>
                    <input type="text" name="id" value="${requestScope.student.id}"/>
                </td>
            </tr>
            <tr>
                <td>学生姓名:</td>
                <td>
                    <input type="text" name="name" value="${requestScope.student.name}"/>
                </td>
            </tr>
            <tr>
                <td>学生年龄:</td>
                <td>
                    <input type="text" name="age" value="${requestScope.student.age}"/>
                </td>
            </tr>
            <tr>
                <td>
                    <input type="submit" value="提交"/>
                </td>
                <td>
                    <input type="reset" value="重置"/>
                </td>
            </tr>
        </table>
    </form>
</body>
</html>
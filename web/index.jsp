<%@ page import="student.model.Student" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: gaosh
  Date: 2019/11/3
  Time: 14:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
<head>
    <title>学生管理页面</title>
    <style type="text/css">
        .table{
            border-collapse: collapse;
            border-width: 1px;
        }
    </style>
</head>
<body>
<p>请输入学生信息：</p>
<form action="AddStudentServlet" method="post">
    学号：<input type="text" name="stuNo"><br>
    姓名：<input type="text" name="stuName"><br>
    年龄：<input type="text" name="stuAge"><br>
    专业：<input type="text" name="graName"><br>
    性别：<input type="text" name="stuSex"><br>
    <input type="submit" name="提交">
</form>
<hr>
<table class = "table">
    <tr>
        <td>学号</td>
        <td>姓名</td>
        <td>年龄</td>
        <td>专业</td>
        <td>性别</td>
        <td>是否删除</td>
    </tr>
    <%
        List<Student> students = (List<Student>) request.getAttribute("students");
        System.out.println(students.size());
        for (Student student : students) {
    %>
    <tr>
    <td><%=student.getStuNo()%>
    </td>
    <td><%=student.getStuName()%>
    </td>
    <td><%=student.getStuAge()%>
    </td>
    <td><%=student.getGraName()%>
    </td>
    <td><%=student.getStuSex()%>
    </td>
    <td><a href="DeleteStudentServlet?stuNo=<%=student.getStuNo()%>">删除学生</a></td>
    </tr>
    <%
        }
    %>
</table>
</body>
</html>

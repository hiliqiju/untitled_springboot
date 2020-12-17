<%--
  Created by IntelliJ IDEA.
  User: liqiju
  Date: 2020/12/17
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <base href="<%=basePath%>">

    <title>My JSP 'MyJsp.jsp' starting page</title>

    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is my page">
    <!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

</head>

<body>
This is my JSP page. <br>
<div>
    <table border="1" width="50%" align="center" style="text-align: center;">
        <tr style="background-color: darkgrey;">
            <th>编号</th>
            <th>姓名</th>
            <th>年龄</th>
            <th>爱好</th>
        </tr>
        <c:forEach items="${stuList}" var="stu" varStatus="index">
            <c:if test="${index.count % 2 == 0}">
                <tr style="background-color: snow">
            </c:if>
            <c:if test="${index.count % 2 !=1}">
                <tr style="background-color: #F1F0F6;">
            </c:if>
            <td>${stu.no}</td>
            <td>${stu.name}</td>
            <td>${stu.age}</td>
            <td>${stu.hobby}</td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>































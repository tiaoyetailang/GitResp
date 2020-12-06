<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/11/17
  Time: 18:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"   %>
<html>
<head>
    <title>愚公列表</title>
   <%
       pageContext.setAttribute("ba",request.getContextPath());
   %>
    <script type="text/javascript" src="${ba}/static/js/jquery-1.7.2.js"></script>
    <link href="${ba}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="${ba}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
</head>
<body>
<%--显示页面--%>
<div class="container">
<%--   标题 --%>
    <div class="row">
        <div class="col-md-12">
            <h1>SSM-curd</h1>
        </div>
    </div>
<%--按钮--%>
    <div class="row">
        <div class="col-md-4 col-md-offset-8">
            <button class="btn btn-primary">新增</button>
            <button class="btn btn-danger">删除</button>
        </div>

    </div>
<%--显示表格数据--%>
    <div class="row">
        <div class="col-md-12">
            <table class="table table-hover">
                <tr>
                    <th>#</th>
                    <th>empname</th>
                    <th>gender</th>
                    <th>email</th>
                    <th>deptname</th>
                    <th>操作</th>

                </tr>
        <c:forEach items="${pageInfo.list}" var="emp">
            <tr>
                <th>${emp.id}</th>
                <th>${emp.name}</th>
                <th>${emp.gender=="M"?"男":"女"}</th>
                <th>${emp.email}</th>
                <th>${emp.dept.deptname}</th>
                <th>
                    <button class="btn btn-primary btn-sm">
                        <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>
                        编辑</button>
                    <button class="btn btn-danger btn-sm">

                        删除</button>
                </th>

            </tr>
        </c:forEach>


            </table>

        </div>
    </div>
<%--分页栏--%>
    <div class="row">
        <div class="col-md-6">
            当前${pageInfo.pageNum}页,总共${pageInfo.pages}页,总共${pageInfo.total}记录
        </div>

        <div class="col-md-6">

            <nav aria-label="Page navigation">
                <ul class="pagination">
                    <li><a href="${ba}/emps?pn=1">首页</a></li>
                    <c:if test="${pageInfo.hasPreviousPage}">
                    <li>
                            <a href="${ba}/emps?pn=${pageInfo.pageNum-1}" aria-label="Previous">
                                <span aria-hidden="true">&laquo;</span>
                            </a>
                    </li>
                    </c:if>
                    <c:forEach items="${pageInfo.navigatepageNums}" var="pageNum">
                        <c:if test="${pageNum==pageInfo.pageNum}">
                            <li class="active"><a href="#">${pageNum}</a></li>
                        </c:if>
                        <c:if test="${pageNum!=pageInfo.pageNum}">
                            <li><a href="${ba}/emps?pn=${pageNum}">${pageNum}</a></li>
                        </c:if>



                    </c:forEach>
                    <c:if test="${pageInfo.hasNextPage}">

                    <li>
                        <a href="${ba}/emps?pn=${pageInfo.pageNum+1}" aria-label="Next">
                            <span aria-hidden="true">&raquo;</span>
                        </a>
                    </li>

                    </c:if>
                    <li><a href="${ba}/emps?pn=${pageInfo.pages}">末页</a></li>
                </ul>
            </nav>
        </div>
    </div>

</div>

</body>
</html>

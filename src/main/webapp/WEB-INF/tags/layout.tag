<%@ tag language="java"  pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"></c:set>
<%@ attribute name="title" required="true" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>手机</title>
<link href="${contextPath}/assets/css/form.css" rel="stylesheet">
	<style type="text/css">
		.ultable{
			display: inline-block;
		}	
	</style>
</head>
<body>
	<a href="${contextPath}/">首页</a>
	<div class="header">	
		<table>
			<tr>
				<th>手　　机</th>
				<th>用　　户</th>
				<th>订　　单</th>
			</tr>	
			<tr>
				<td><a href="${contextPath}/cellphones/">手机列表</a></td>
				<td><a href="${contextPath}/cellphoneUsers/">用户列表</a></td>
				<td><a href="${contextPath}/cellphoneOrders/">订单列表</a></td>
			</tr>
			<tr>
				<td><a href="${contextPath}/cellphones/add">上架手机</a></td>
				<td></td>
			</tr>
		</table>
	</div>
	
  	<div class="content">
   	 <!-- 取tag参数值 -->
   	 	
   	 <!-- 把t:layout标签的内容插入此处 -->
   		 <jsp:doBody />
  	</div>

  <div class="footer" style="color:#dDaAbB"><I>copyright</I> 2018</div>
		
</body>
</html>

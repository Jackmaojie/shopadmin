<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"></c:set>
<t:layout title="用户列表">
	<style type="text/css">
		.menu {
			display: inline-block;
			color: #00AA0B;
		}
	</style>
	<div>
		<table class="menu">
			<tr>
				<th>用户名</th>
				<th>查看用户</th>
			</tr>
			<c:forEach items="${cellphoneUsers}" var="cellphoneUser">
				<tr>
					<td>${cellphoneUser.username}</td>
					<td><a href="${contextPath}/cellphoneUsers/${cellphoneUser.id}">详情</a></td> 
				</tr>
			</c:forEach>

		</table>
	
	</div>
	
</t:layout>
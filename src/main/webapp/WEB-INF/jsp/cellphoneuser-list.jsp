<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"></c:set>
<t:layout title="用户列表">
	<style type="text/css">
		.menu {
			display: inline-block;
			color: #00AA00;
		}
	</style>
	<div>
		<ul class="menu">
			<c:forEach items="${cellphoneUsers}" var="cellphoneUser">
				<li>${cellphoneUser.username}<br>
					<a href="${contextPath}/cellphoneusers/${cellphoneUser.id}">详情</a> 
				</li>
			</c:forEach>

		</ul>
	
	</div>
	
</t:layout>
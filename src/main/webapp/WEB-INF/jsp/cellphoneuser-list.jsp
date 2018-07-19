<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"></c:set>
<t:layout title="用户列表">
	<div>
		<ul>
			<c:forEach items="${cellphoneUsers}" var="cellphoneUser">
				<li><a href="${contextPath}/cellphoneusers/${cellphoneUser.id}">${cellphoneUser.username}</a> 
				${cellphoneUser.gender}<br> ${cellphoneUser.lastdate}</li>
			</c:forEach>

		</ul>
	
	</div>
	
</t:layout>
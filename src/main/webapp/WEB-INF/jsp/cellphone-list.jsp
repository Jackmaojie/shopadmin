<%@ page language="java" contentType="text/html; charset=UTF-8"    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"></c:set>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<t:layout title="手机列表">
	<style type="text/css">
		.menu{
			display: inline-block;
			color:#00AB00;
		}
	</style>
	<h1>手机列表</h1>
	<div >
		<ul class="menu">
			<c:forEach items="${cellphones}" var="cellphone">
				<li>${cellphone.id}<br>
					${cellphone.brand}<br>
					<a href="${contextPath}/cellphones/${cellphone.id}">${cellphone.model}</a>
					<a href="${contextPath}/cellphones/${cellphone.id}/edit">【编辑】</a>
					<a href="${contextPath}/cellphones/${cellphone.id}/delete">下架</a>
				</li>
			</c:forEach>

		</ul>
	</div>
</t:layout>
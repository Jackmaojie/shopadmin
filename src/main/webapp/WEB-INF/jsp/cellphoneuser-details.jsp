<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="gender" value="${cellphone.gender==Female ? '女' : '男'}"></c:set>
<t:layout title="用户详情">
	<style type="text/css">
		.menu {
			display: inline-block;
			color: #DD00F0;
		}
	</style>
	<h3>${cellphoneUser.username}</h3>
	<ul class="menu">
		<li>姓名:${cellphoneUser.username}</li>
		<li>性别:${gender}</li>
		<li>最近上线时间:${cellphoneUser.lastdate}</li>
	</ul>
</t:layout>
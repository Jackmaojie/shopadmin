<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>

<t:layout title="用户详情">
	<h3>${cellphoneUser.username}</h3>
	<ul class="menu">
		<li>姓名:${cellphoneUser.username}</li>
		<li>性别:${cellphoneUser.gender}</li>
		<li>最近上线时间:${cellphoneUser.lastdate}</li>
	</ul>
</t:layout>
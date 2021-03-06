<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>
<c:set var="title" value="${cellphone.model}"></c:set> 
 <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<t:layout title="${title}">
	<div>
		<h1>${title}</h1>
		<ul>
			<li>手机编号:${cellphone.id}<br> 手机品牌:${cellphone.brand}<br>
				手机型号:${cellphone.model}<br> 手机颜色${cellphone.color}
			</li>
			<li>手机运行内存:${cellphone.ram/1024}GB<br>
				手机内存:${cellphone.storage}GB<br> 系统:${cellphone.os}<br>
				CPU:${cellphone.cpubrand}
			</li>
			<li>手机简介:${cellphone.description}<br>
				价格:￥${cellphone.price/100}
			</li>
		</ul>
	</div>
</t:layout>



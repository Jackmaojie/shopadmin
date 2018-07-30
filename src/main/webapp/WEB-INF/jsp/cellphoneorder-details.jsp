<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="format" uri="http://java.sun.com/jsp/jstl/fmt" %>
 <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<t:layout title="订单详情">
	<h1>【${cellphoneOrder.cellphoneUser.username}】${cellphoneOrder.id}号订单详情</h1>
	<div>用户名：${cellphoneOrder.cellphoneUser.username} ${cellphoneOrder.cellphoneUser.gender}</div>
	<div>用户最近登录时间：<format:formatDate value="${cellphoneOrder.cellphoneUser.lastdate}" pattern="HH:mm:ss yyyy-MM-dd " /></div>
	<div>订单创建的时间：${cellphoneOrder.createtime}</div>
	<div>
		<table>
			<caption><b>订单项</b></caption>
			<tr>
				<th>商品名称</th>
				<th>单价</th>
				<th>数量</th>
			</tr>
			<c:forEach items="${cellphoneOrder.orderItems}" var="item">
				<tr>
					<td>${item.cellphone.brand}${item.cellphone.model}</td>
					<td>￥${item.cellphone.price/100}</td>
					<td>${item.amount}</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</t:layout>



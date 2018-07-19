<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<c:set var="pagetitle" value="${cellphoneForm.model ==null ? '手机上架' : '修改手机信息'}"></c:set>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
		
<t:layout title="${pagetitle}">
	<h1>${pagetitle}</h1>
	<form:form action="" method="post" commandName="cellphoneForm">
		<div>
			<label for="brnad">品　　牌:</label>
			<form:select path="brand">
				<form:option value="">--请选择品牌--</form:option>
				<form:option value="苹果">苹果</form:option>
				<form:option value="华为">华为</form:option>
				<form:option value="小米">小米</form:option>
				<form:option value="vivo">vivo</form:option>
				<form:option value="魅族">魅族</form:option>	
			</form:select>
			<form:errors path="brand" cssClass="field-error"></form:errors>
		</div>
		<div>
			<label for="model">型　　号:</label>
			<form:input type="text" path="model" id="model" />
			<form:errors path="model" cssClass="field-error"></form:errors>
		</div>
		<div>
			<label for="os">操作系统:</label>
			<form:input type="text" path="os" id="name" />
			<form:errors path="os" cssClass="field-error"></form:errors>
		</div>
		<div>
			<label for="cpubrand">CPU型号:</label>
			<form:input type="text" path="cpubrand" id="cpubrand" />
			<form:errors path="cpubrand" cssClass="field-error"></form:errors>
		</div>
		<div>
			<label for="ram">运行内存:</label>
			<form:input type="text" path="ram" id="ram" />MB
			<form:errors path="ram" cssClass="field-error"></form:errors>
		</div>
		<div>
			<label for="storage">内　　存:</label>
			<form:input type="text" path="storage" id="storage" />GB
			<form:errors path="storage" cssClass="field-error"></form:errors>
		</div>
		<div>
			<label for="color">颜　　色:</label>
			<form:input type="text" path="color" id="color" />
			<form:errors path="color" cssClass="field-error"></form:errors>
		</div>
		<div>
			<label for="description">手机信息:</label> 
			<form:textarea path="description" id="description"/>
			<form:errors path="description" cssClass="field-error"></form:errors>
		</div>
		<div>
			<label for="price">价　　格:</label>
			<form:input type="text" path="price" id="price" />分
			<form:errors path="price" cssClass="field-error"></form:errors>
		</div>
		<div>
			<button type="submit">${pagetitle}</button>
		</div>
	</form:form>
</t:layout>	
	

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome</title>

</head>
<body>
	<h2>NORMAL USER LIST</h2>

	<div class="topnav">
		<a href="/Struts2Login">LOGIN</a>
	</div>
	<br>
	<p>To view the list of normal user click on the "Show Normal Users"
		button</p>

	<s:actionerror />

	<s:form action="normaluserlist.action" method="get">
		<s:iterator value="normalUserList">
			<p>
				NORMAL USER
				<s:property value="username" />
				PERSONAL INFORMATION
			</p>
			<table>
				<tr>
					<td>USERNAME: <s:property value="username" /></td>
				</tr>
				<tr>
					<td>PASSWORD: <s:property value="password" /></td>
				</tr>
				<tr>
					<td>NAME: <s:property value="name" /></td>
				</tr>
				<tr>
					<td>EMAIL: <s:property value="email" /></td>
				</tr>
				<tr>
					<td>CITY: <s:property value="city" /></td>
				</tr>
				<tr>
					<td>COUNTRY: <s:property value="country" /></td>
				</tr>
			</table>
			<br>
		</s:iterator>
		<s:submit method="execute" key="normalUserlist.show" align="center" />
	</s:form>
</body>
</html>

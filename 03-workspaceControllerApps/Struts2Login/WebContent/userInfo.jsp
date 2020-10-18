<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome</title>
</head>
<body>
	<h2>
		Welcome
		<s:property value="username" />
	</h2>

	<div class="topnav">
		<a href="/Struts2Login">Logout</a>
	</div>
	<br>

	<h2>Here you can see your personal data</h2>

	<p>
		USERNAME:
		<s:property value="user.username" />
	</p>
	<p>
		PASSWORD:
		<s:property value="user.password" />
	</p>
	<p>
		NAME:
		<s:property value="user.name" />
	</p>
	<p>
		EMAIL:
		<s:property value="user.email" />
	</p>
	<p>
		CITY:
		<s:property value="user.city" />
	</p>
	<p>
		COUNTRY:
		<s:property value="user.country" />
	</p>
</body>
</html>
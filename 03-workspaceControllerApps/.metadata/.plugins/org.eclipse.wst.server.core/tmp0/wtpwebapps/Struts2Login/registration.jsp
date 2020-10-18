<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sign up form</title>
</head>
<body>

	<h2>Sign up form</h2>

	<div class="topnav">
		<a href="/Struts2Login">Go Back</a>
	</div>
	<br>

	<s:actionerror />

	<s:form action="registration.action" method="post">
		<s:textfield name="username" key="reg.username" size="50" />
		<s:password name="password" key="reg.password" size="50" />
		<s:textfield name="name" key="reg.name" size="50" />
		<s:textfield name="email" key="reg.email" size="50" />
		<s:textfield name="city" key="reg.city" size="50" />
		<s:textfield name="country" key="reg.country" size="50" />
		<br>
		<s:submit method="execute" key="reg.signup" align="center" />
	</s:form>

</body>
</html>
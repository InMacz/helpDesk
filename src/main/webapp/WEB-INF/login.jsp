<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
<meta charset="UTF-8">
<title>HelpDesk - Login</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/estilos.css">
</head>
<body>

<h1>HelpDesk</h1>

<form action="" method="post">
<label>E-Mail:</label>
<input type="text" name="txtEmail" required<br>
<label>Senha:</label>
<input type="password" name="txtSenha" required><br>
<button type="submit">Logar</button>
</form>
</body>

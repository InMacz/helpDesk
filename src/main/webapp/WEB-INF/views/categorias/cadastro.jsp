<%--
  Created by IntelliJ IDEA.
  User: LAB-11
  Date: 09/09/2026
  Time: 21:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Title</title>
  </head>
  <body>
  <h1>Nova Categoria</h1>
  <form action="${pageContext.request.contextPath}/categorias/SalvarCategoriasServlet" method="post">


    <label>Nome:</label>
    <input type="text" name="txtNome" required> <br>

    <label>Descrição:</label>
    <input type="text" name="txtDescricao"><br>

    <button type="submit">Salvar</button>
    </form>
  </body>
</html>

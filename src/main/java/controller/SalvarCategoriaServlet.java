package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/SalvarCategoriaServlet")
public class SalvarCategoriaServlet extends HttpServlet {

    @Override
    protected void doPost(jakarta.servlet.http.HttpServletRequest request, jakarta.servlet.http.HttpServletResponse response)
            throws ServletException, IOException {
        String nome = request.getParameter("txtNome");
        String descricao = request.getParameter("txtDescricao");

        Categorias cat = new Categorias();
        cat.setNome(nome);
        cat.setDescricao(descricao);

        try {
            categoriaDAO.salvar(cat);
            response.sendRedirect(request.getContextPath() + "/categorias");
        }catch (SQLException e ){
            throws new ServletException("Erro ao salvar categoria", e);
        }

        response.getWriter().println("Olá, Servlet!");
    }
}

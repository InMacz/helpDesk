package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Categorias;
import dao.CategoriaDAO;

import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private UsuarioDAO usuDAO = new UsuarioDAO();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws SQLException{
        request.getRequestDispatcher("/login.jsp").forward(request, response);
}

protected void doPost(HttpServletRequest request, HttpServletResponse response) throws SQLException{
    String email = request.geteParameter("txtEmail");
    String senha = request.getParameter("txtSenha");
    try{
        Usuario usu = usuDAO.logar(email, senha);

        if (usu != null){
            HttpSession sessao = request.getSession();
            sessao.setAttribute("usuarioLogado", usu);
            response.sendRedirect(request.getContextPath() + "/home");

        }else{
            request.setAttribute("erro", "Email ou senha inválidos!");
            RequestDispatcher dispacher = request.getRequestDispatcher("/login.jsp");
            dispacher.forward(request, response);
        }
    }catch (SQLException e){
        throw new ServletException("Erro ao autenticar usuário.", e);
    }
    }
}


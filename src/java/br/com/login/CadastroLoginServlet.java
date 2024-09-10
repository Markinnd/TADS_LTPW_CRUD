
package br.com.login;

import br.com.conexao.CriarConexao;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.mysql.cj.jdbc.Driver;
import java.sql.DriverManager;

//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;

public class CadastroLoginServlet extends HttpServlet {
     private static final long serialVersionUID = 1L;
     
     public CadastroLoginServlet() {
         super();
     }
     
     @Override
     protected void doPost(HttpServletRequest request, HttpServletResponse response)
             throws ServletException, IOException {
         PrintWriter writer = response.getWriter();
         String email = request.getParameter("email");
         String senha = request.getParameter("senha");
         
         Connection con = null;
         
         try {
             con = CriarConexao.getConexao();
         } catch (SQLException ex) {
             Logger.getLogger(CadastroLoginServlet.class.getName()).log(Level.SEVERE, null, ex);
         }
             
             Usuario u = new Usuario();
             u.setEmail(email);
             u.setSenha(senha);
             
             UsuarioDao dao = new UsuarioDao(con);
         try {
             dao.adicionar(u);
         } catch (SQLException ex) {
             Logger.getLogger(CadastroLoginServlet.class.getName()).log(Level.SEVERE, null, ex);
         }
             request.setAttribute("email", u.getEmail());
             request.getRequestDispatcher("cadastrado.jsp").forward(request, response);
             
         
         }
     }

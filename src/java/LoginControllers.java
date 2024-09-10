
import br.com.conexao.CriarConexao;
import java.io.IOException;
import java.sql.Connection;
import com.mysql.cj.jdbc.Driver;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 *
 * @author marki
 */

public class LoginControllers extends HttpServlet {

    @Override
    protected void doPost (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String emailBuscado = "";
        String senhaBuscada = "";
        Connection con;
        String email = request.getParameter("email");
        String senha = request.getParameter("senha");
        String sql = "Select * from tb_login where email = ? and senha = ?";
        
        try {
            con = CriarConexao.getConexao();
            try (PreparedStatement stmt = con.prepareStatement(sql)) {
                stmt.setString(1, email);
                stmt.setString(2, senha);
                
                try (ResultSet rs = stmt.executeQuery()) {
                    while (rs.next()){
                        emailBuscado = rs.getString("email");
                        senhaBuscada = rs.getString("senha");
                    }
                }
            }
        } catch (SQLException e) {
        }
        if(emailBuscado.equals(email) || senhaBuscada.equals(senha)){
            HttpSession session = request.getSession();
            session.setAttribute("email", email);
            request.getRequestDispatcher("logado.jsp").forward(request, response);
        } else {
            System.out.println(emailBuscado + "-" + email);
            System.out.println(senhaBuscada  + "-" + senha);
            request.getRequestDispatcher("errodeusuario.jsp").forward(request, response);
        }
    }
}

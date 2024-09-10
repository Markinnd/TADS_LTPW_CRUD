package br.com.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
        
public class CriarConexao {
    
    public static Connection getConexao() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.print("conectou");
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/Login", "root", "admin");
        } catch (SQLException e) {
            throw new SQLException(e);
        }       
        catch (ClassNotFoundException ex) {
            throw new SQLException(ex);
        }
}
}

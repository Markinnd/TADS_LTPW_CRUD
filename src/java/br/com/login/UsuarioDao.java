/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author marki
 */
public class UsuarioDao {
    private Connection con;
    public UsuarioDao (Connection con) {
        this.con = con;
    }
    public void adicionar (Usuario u) throws SQLException {
        
        String sql = "insert into tb_login(email,senha)values(?,?)";
        
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            
            stmt.setString(1, u.getEmail());
            stmt.setString(2, u.getSenha());
            
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            con.close();
        }
    }
}

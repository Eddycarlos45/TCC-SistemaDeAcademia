/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import conexao.Conexao;
import entidade.Administradores;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Jocélia
 */
public class DAOAdministradores {
    
    private final String URL = "jdbc:mysql://localhost:3306/academia", NOME = "root", SENHA = "";
    private Connection conexao;
    private Statement comando;
    
    public DAOAdministradores() throws ClassNotFoundException, SQLException{
        
        conexao = Conexao.conexao(URL, NOME, SENHA);
        
    }
    
    public void conectar() throws ClassNotFoundException, SQLException {
        try {
            conexao = Conexao.conexao(URL, NOME, SENHA);
            comando = conexao.createStatement();
            System.out.println("Conectado!");
        } catch (ClassNotFoundException e) {
            imprimeErro("Erro ao carregar o driver", e.getMessage());
        } catch (SQLException e) {
            imprimeErro("Erro ao conectar", e.getMessage());
        }
    }
    
    public void imprimeErro(String msg, String msgErro) {
        JOptionPane.showMessageDialog(null, msg, "Erro Crítico!", 0);
        System.err.println(msg);
        System.out.println(msgErro);
        System.exit(0);
    }
    
    public void cadastrarAdmin(Administradores admin){
        try {
            
            conectar();
            
            PreparedStatement stmt = conexao.prepareStatement("INSERT INTO administradores"
                    + " (nome_admin, rg_admin, telefone_admin, celular_admin, foto_admin, usuario_admin, senha_admin, tipo_cargo_admin)"
                    + " VALUES(?, ?, ?, ?, ?, ?, ?, ?)");
            
            InputStream foto_admin = new FileInputStream(new File(admin.getCaminho_foto_admin()));
            
            stmt.setString(1, admin.getNome_admin());
            stmt.setString(2, admin.getRg_admin());
            stmt.setString(3, admin.getTelefone_admin());
            stmt.setString(4, admin.getCelular_admin());
            stmt.setBlob(5, foto_admin);
            stmt.setString(6, admin.getUsuario_admin());
            stmt.setString(7, admin.getSenha_admin());
            stmt.setString(8, "Administrador");
            
            stmt.execute();
            stmt.close();
            
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!" );
        } catch (SQLException ex) {
            imprimeErro("Erro ao cadastrar Administrador ! ", ex.getMessage());
     } catch (ClassNotFoundException | FileNotFoundException ex) {
            Logger.getLogger(DAOAlunos.class.getName()).log(Level.SEVERE, null, ex);
      }
    }
    
    public List<Administradores> PesquisaAdministradores(Administradores admin) throws ClassNotFoundException, SQLException {

        conectar();

        List<Administradores> lista = new ArrayList<Administradores>();
        ResultSet rs;

        try {
            rs = comando.executeQuery("SELECT id_admin, nome_admin, rg_admin"
                    + " FROM administradores"
                    + " WHERE nome_admin LIKE '" + admin.getNome_admin() + "%'");

            while (rs.next()) {
                Administradores adm = new Administradores();

                adm.setId_admin(rs.getInt("id_admin"));
                adm.setNome_admin(rs.getString("nome_admin"));
                adm.setRg_admin(rs.getString("rg_admin"));

                lista.add(adm);
            }
        } catch (SQLException ex) {
            imprimeErro("Erro ao buscar Administrador(s) !", ex.getMessage());
        }

        return lista;
    }
    
    public Administradores PesquisaLogin(Administradores admin) throws ClassNotFoundException, SQLException {

        
        conectar();
        
        ResultSet rs;
        Administradores adm = new Administradores();
        
            
            rs = comando.executeQuery("SELECT id_admin, nome_admin, usuario_admin, senha_admin, foto_admin, wallpaper_admin,"
                    + " tipo_cargo_admin"
                    + " FROM administradores"
                    + " WHERE usuario_admin = '" + admin.getUsuario_admin()+ "'"
                    + " AND senha_admin = '" + admin.getSenha_admin() + "'"
                    + " AND tipo_cargo_admin = '" + admin.getTipo_cargo_admin() + "'");
            
            if (rs.next()) {
                
                adm.setId_admin(rs.getInt("id_admin"));
                adm.setNome_admin(rs.getString("nome_admin"));
                adm.setUsuario_admin(rs.getString("usuario_admin"));
                adm.setSenha_admin(rs.getString("senha_admin"));
                adm.setFoto_admin(rs.getBytes("foto_admin"));
                adm.setWallpaper_admin(rs.getBytes("wallpaper_admin"));
                adm.setTipo_cargo_admin(rs.getString("tipo_cargo_admin"));
            }
            else{
                
                adm.setUsuario_admin(null);
                adm.setSenha_admin(null);
                adm.setTipo_cargo_admin(null);
                
            }
        
        return adm;
    
    }
    
    public void novoLogin(Administradores admin) throws ClassNotFoundException, SQLException {

        conectar();

        try {

            PreparedStatement stmt = conexao.prepareStatement("UPDATE administradores SET usuario_admin = ?, senha_admin = ?"
                    + " WHERE usuario_admin = '" + admin.getConfirma_usuario()+ "'"
                    + " AND senha_admin = '" + admin.getConfirma_senha() + "'");
            
            stmt.setString(1, admin.getUsuario_admin());
            stmt.setString(2, admin.getSenha_admin());

            stmt.execute();
            stmt.close();
            
            JOptionPane.showMessageDialog(null, "Login alterado com Sucesso !!");

        } catch (SQLException ex) {
            imprimeErro("Erro ao atualizar Login ! ", ex.getMessage());
        }
    }
    
}

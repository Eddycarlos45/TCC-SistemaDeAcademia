/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import conexao.Conexao;
import entidade.Cargos;

import entidade.Funcionarios;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Lab01_Aluno
 */
public class DAOFuncionarios {

    private final String URL = "jdbc:mysql://localhost:3306/academia", NOME = "root", SENHA = "";
    private Connection conexao;
    private Statement comando;

    public DAOFuncionarios() throws ClassNotFoundException, SQLException {
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

    public void fechar() throws SQLException {
        try {
            comando.close();
            conexao.close();
            System.out.println("Conexão Fechada!");
        } catch (SQLException e) {
            imprimeErro("Erro ao fechar a conexão", e.getMessage());
        }
    }

    public void imprimeErro(String msg, String msgErro) {
        JOptionPane.showMessageDialog(null, msg, "Erro Crítico!", 0);
        System.err.println(msg);
        System.out.println(msgErro);
        System.exit(0);
    }

    public void cadastrarFuncionarios(Funcionarios funcionarios) {
        try {

            conectar();

            PreparedStatement stmt = conexao.prepareStatement("INSERT INTO funcionarios"
                    + " (nome_funci, data_nasci_funci, telefone_funci, celular_funci, rg_funci, id_cargo_funci,"
                    + " usuario_funci, senha_funci, foto_funci)"
                    + " VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)");

            SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");

            stmt.setString(1, funcionarios.getNome());

            if (funcionarios.getData_nasc_funcionario() != null) {
                stmt.setString(2, formato.format(funcionarios.getData_nasc_funcionario()));
            } else {
                stmt.setString(2, null);
            }

            stmt.setString(3, funcionarios.getTelefone());

            stmt.setString(4, funcionarios.getCelular());

            stmt.setString(5, funcionarios.getRg_funcionario());
            stmt.setInt(6, funcionarios.getCargo().getId_cargo());

            stmt.setString(7, funcionarios.getUsuario());
            stmt.setString(8, funcionarios.getSenha());

            if (funcionarios.getImagem_funcionario() != null) {
                InputStream arquivo = new FileInputStream(new File(funcionarios.getImagem_funcionario()));
                stmt.setBlob(9, arquivo);
            } else {
                stmt.setBlob(9, (Blob) null);
            }

            stmt.execute();
            stmt.close();

            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");

        } catch (SQLException ex) {
            imprimeErro("Erro ao inserir Funcionário", ex.getMessage());
        } catch (ClassNotFoundException | FileNotFoundException ex) {
            Logger.getLogger(DAOAlunos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarFuncionarios(Funcionarios funcionario) throws ClassNotFoundException, SQLException {

        conectar();

        try {
            SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");

            if (funcionario.getImagem_funcionario().isEmpty() == false) {
                JOptionPane.showMessageDialog(null, "Certo");
                PreparedStatement stmt = conexao.prepareStatement("UPDATE funcionarios"
                        + " SET nome_funci = ?, telefone_funci = ?, celular_funci = ?, rg_funci = ?, id_cargo_funci = ?,"
                        + " usuario_funci = ?, senha_funci = ?, data_nasci_funci = ?, foto_funci = ?"
                        + " WHERE id_funci = '" + funcionario.getId_funcionario() + "'");

                stmt.setString(1, funcionario.getNome());
                stmt.setString(2, funcionario.getTelefone());
                stmt.setString(3, funcionario.getCelular());
                stmt.setString(4, funcionario.getRg_funcionario());
                stmt.setInt(5, funcionario.getCargo().getId_cargo());
                stmt.setString(6, funcionario.getUsuario());
                stmt.setString(7, funcionario.getSenha());

                if (funcionario.getData_nasc_funcionario() != null) {
                    stmt.setString(8, formato.format(funcionario.getData_nasc_funcionario()));
                } else {
                    stmt.setString(8, null);
                }

                InputStream arquivo = new FileInputStream(new File(funcionario.getImagem_funcionario()));
                stmt.setBlob(9, arquivo);

                stmt.execute();
                stmt.close();
            } else {

                PreparedStatement stmt = conexao.prepareStatement("UPDATE funcionarios"
                        + " SET nome_funci = ?, telefone_funci = ?, celular_funci = ?, rg_funci = ?, id_cargo_funci = ?,"
                        + " usuario_funci = ?, senha_funci = ?, data_nasci_funci = ?"
                        + " WHERE id_funci = '" + funcionario.getId_funcionario() + "'");

                stmt.setString(1, funcionario.getNome());
                stmt.setString(2, funcionario.getTelefone());
                stmt.setString(3, funcionario.getCelular());
                stmt.setString(4, funcionario.getRg_funcionario());
                stmt.setInt(5, funcionario.getCargo().getId_cargo());
                stmt.setString(6, funcionario.getUsuario());
                stmt.setString(7, funcionario.getSenha());

                if (funcionario.getData_nasc_funcionario() != null) {
                    stmt.setString(8, formato.format(funcionario.getData_nasc_funcionario()));
                } else {
                    stmt.setString(8, null);
                }

                stmt.execute();
                stmt.close();

            }

            JOptionPane.showMessageDialog(null, "Atualizado com Sucesso !!");

        } catch (SQLException ex) {
            imprimeErro("Erro ao atualizar Funcionário ! ERRO: ", ex.getMessage());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DAOFuncionarios.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void apagarFuncionario(Funcionarios funci) throws ClassNotFoundException, SQLException {
        conectar();

        try {
            comando.execute("DELETE FROM funcionarios WHERE id_funci = '" + funci.getId_funcionario() + "'");
            JOptionPane.showMessageDialog(null, "Excluído com sucesso !!");

        } catch (SQLException ex) {
            imprimeErro("Erro ao apagar Funcionário ! ERRO: ", ex.getMessage());
        } finally {
            fechar();
        }
    }

    public List<Funcionarios> PesquisaFuncionario(Funcionarios funcionario) throws ClassNotFoundException, SQLException {

        conectar();

        List<Funcionarios> lista = new ArrayList<Funcionarios>();
        ResultSet rs;

        try {
            rs = comando.executeQuery("SELECT id_funci, nome_funci, rg_funci, nome_cargo"
                    + " FROM funcionarios, cargos"
                    + " WHERE nome_funci LIKE '%" + funcionario.getNome() + "%'"
                    + " AND cargos.id_cargo = funcionarios.id_cargo_funci");

            while (rs.next()) {

                Cargos cargo = new Cargos();
                cargo.setNome_cargo(rs.getString("nome_cargo"));

                Funcionarios fun = new Funcionarios();
                fun.setId_funcionario(rs.getInt("id_funci"));
                fun.setNome(rs.getString("nome_funci"));
                fun.setRg_funcionario(rs.getString("rg_funci"));
                fun.setCargo(cargo);

                lista.add(fun);
            }
        } catch (SQLException ex) {
            imprimeErro("Erro ao buscar Funcionario ! ERRO: ", ex.getMessage());
        }

        return lista;
    }
    
    public List<Funcionarios> buscaTodosFuncionarios(Funcionarios funcionario) throws ClassNotFoundException, SQLException {

        conectar();

        List<Funcionarios> lista = new ArrayList<Funcionarios>();
        ResultSet rs;

        try {
            rs = comando.executeQuery("SELECT id_funci, nome_funci, rg_funci, nome_cargo"
                    + " FROM funcionarios, cargos"
                    + " WHERE id_cargo_funci = '" + funcionario.getCargo().getId_cargo() + "'"
                    + " AND cargos.id_cargo = funcionarios.id_cargo_funci");

            while (rs.next()) {

                Cargos cargo = new Cargos();
                cargo.setNome_cargo(rs.getString("nome_cargo"));

                Funcionarios fun = new Funcionarios();
                fun.setId_funcionario(rs.getInt("id_funci"));
                fun.setNome(rs.getString("nome_funci"));
                fun.setRg_funcionario(rs.getString("rg_funci"));
                fun.setCargo(cargo);
                
                lista.add(fun);
            }
        } catch (SQLException ex) {
            imprimeErro("Erro ao buscar Funcionario ! ERRO: ", ex.getMessage());
        }

        return lista;
    }
    
    public List<Funcionarios> buscaQuantFuncionarios(Funcionarios funcionario) throws ClassNotFoundException, SQLException {

        conectar();

        List<Funcionarios> lista = new ArrayList<Funcionarios>();
        ResultSet rs;

        try {
            rs = comando.executeQuery("SELECT id_funci, nome_funci, rg_funci, nome_cargo"
                    + " FROM funcionarios, cargos"
                    + " WHERE id_cargo_funci = '" + funcionario.getCargo().getId_cargo() + "'"
                    + " AND cargos.id_cargo = funcionarios.id_cargo_funci");

            while (rs.next()) {

                Cargos cargo = new Cargos();
                cargo.setNome_cargo(rs.getString("nome_cargo"));

                Funcionarios fun = new Funcionarios();
                fun.setId_funcionario(rs.getInt("id_funci"));
                fun.setNome(rs.getString("nome_funci"));
                fun.setRg_funcionario(rs.getString("rg_funci"));
                fun.setCargo(cargo);
                
                lista.add(fun);
            }
        } catch (SQLException ex) {
            imprimeErro("Erro ao buscar Funcionario ! ERRO: ", ex.getMessage());
        }

        return lista;
    }

    public Funcionarios buscarFuncionario(Funcionarios funcionario) throws ClassNotFoundException, SQLException, ParseException {

        conectar();

        Cargos cargo = new Cargos();
        Funcionarios fun = new Funcionarios();
        ResultSet rs;

        try {
            rs = comando.executeQuery("SELECT nome_funci, data_nasci_funci, telefone_funci, celular_funci, foto_funci,"
                    + " rg_funci, id_cargo_funci, nome_cargo, usuario_funci, senha_funci"
                    + " FROM funcionarios, cargos"
                    + " WHERE id_funci = '" + funcionario.getId_funcionario() + "'"
                    + " AND cargos.id_cargo = funcionarios.id_cargo_funci");

            //pega todos os atributos da pessoa
            if (rs.next()) {

                cargo.setId_cargo(rs.getInt("id_cargo_funci"));
                cargo.setNome_cargo(rs.getString("nome_cargo"));

                fun.setNome(rs.getString("nome_funci"));
                fun.setData_nasc_funcionario(rs.getDate("data_nasci_funci"));
                fun.setTelefone(rs.getString("telefone_funci"));
                fun.setCelular(rs.getString("celular_funci"));
                fun.setFoto_funcionario(rs.getBytes("foto_funci"));
                fun.setCargo(cargo);
                fun.setRg_funcionario(rs.getString("rg_funci"));
                fun.setUsuario(rs.getString("usuario_funci"));
                fun.setSenha(rs.getString("senha_funci"));

            }

        } catch (SQLException e) {
            imprimeErro("Erro ao buscar Funcionario ! ERRO: ", e.getMessage());
        }

        return fun;
    }

    public Funcionarios PesquisaLogin(Funcionarios funci) throws ClassNotFoundException, SQLException {

        conectar();

        ResultSet rs;
        Cargos cargo = new Cargos();
        Funcionarios fun = new Funcionarios();

        rs = comando.executeQuery("SELECT id_funci, usuario_funci, senha_funci, nome_funci, gerenciar_aluno, gerenciar_funci,"
                + " gerenciar_cargo, gerenciar_permissoes, gerenciar_relatorio, consulta_mensal, efetuar_pag, foto_funci,"
                + " wallpaper_funci, id_cargo_funci"
                + " FROM funcionarios, cargos"
                + " WHERE usuario_funci = '" + funci.getUsuario() + "'"
                + " AND senha_funci = '" + funci.getSenha() + "'"
                + " AND funcionarios.id_cargo_funci = cargos.id_cargo");

        if (rs.next()) {

            cargo.setId_cargo(rs.getInt("id_cargo_funci"));
            cargo.setGerenciar_aluno(rs.getBoolean("gerenciar_aluno"));
            cargo.setGerenciar_funci(rs.getBoolean("gerenciar_funci"));
            cargo.setGerenciar_cargo(rs.getBoolean("gerenciar_cargo"));
            cargo.setGerenciar_permissoes(rs.getBoolean("gerenciar_permissoes"));
            cargo.setGerenciar_relatorio(rs.getBoolean("gerenciar_relatorio"));
            cargo.setConsulta_mensal(rs.getBoolean("consulta_mensal"));
            cargo.setEfetuar_pag(rs.getBoolean("efetuar_pag"));

            fun.setId_funcionario(rs.getInt("id_funci"));
            fun.setNome(rs.getString("nome_funci"));
            fun.setUsuario(rs.getString("usuario_funci"));
            fun.setSenha(rs.getString("senha_funci"));
            fun.setFoto_funcionario(rs.getBytes("foto_funci"));
            fun.setCargo(cargo);
            fun.setWallpaper_funci(rs.getBytes("wallpaper_funci"));
        } else {

            fun.setUsuario(null);
            fun.setSenha(null);

        }

        return fun;

    }

    public void novoWallpaper(Funcionarios funci) throws ClassNotFoundException, SQLException {

        conectar();

        try {

            PreparedStatement stmt = conexao.prepareStatement("UPDATE funcionarios"
                    + " SET wallpaper_funci = ?"
                    + " WHERE id_funci = '" + funci.getId_funcionario() + "'");

            InputStream arquivo = new FileInputStream(new File(funci.getCaminho_wallpaper()));

            stmt.setBlob(1, arquivo);

            stmt.execute();
            stmt.close();

        } catch (SQLException ex) {
            imprimeErro("Erro ao atualizar Plano de Fundo ! ERRO: ", ex.getMessage());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DAOFuncionarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Funcionarios PesquisaWallpaper(Funcionarios funci) throws ClassNotFoundException, SQLException {

        conectar();

        ResultSet rs;
        Funcionarios fun = new Funcionarios();

        rs = comando.executeQuery("SELECT wallpaper_funci"
                + " FROM funcionarios"
                + " WHERE id_funci = '" + funci.getId_funcionario() + "'");

        if (rs.next()) {
            fun.setWallpaper_funci(rs.getBytes("wallpaper_funci"));
        }
        return fun;
    }

    public void novoLogin(Funcionarios funci) throws ClassNotFoundException, SQLException {

        conectar();

        try {

            PreparedStatement stmt = conexao.prepareStatement("UPDATE funcionarios SET usuario_funci = ?, senha_funci = ?"
                    + " WHERE usuario_funci = '" + funci.getConfirma_usuario() + "'"
                    + " AND senha_funci = '" + funci.getConfirma_senha() + "'");

            stmt.setString(1, funci.getUsuario());
            stmt.setString(2, funci.getSenha());

            stmt.execute();
            stmt.close();

            JOptionPane.showMessageDialog(null, "Login alterado com Sucesso !!");

        } catch (SQLException ex) {
            imprimeErro("Erro ao atualizar Login ! ERRO: ", ex.getMessage());
        }
    }

    public Funcionarios pesquisaUsuario(Funcionarios funci) {

        Funcionarios fun = new Funcionarios();
        ResultSet rs;

        try {
            conectar();

            rs = comando.executeQuery("SELECT id_funci, usuario_funci"
                    + " FROM funcionarios"
                    + " WHERE usuario_funci = '" + funci.getUsuario() + "'");

            if (rs.next()) {

                fun.setId_funcionario(rs.getInt("id_funci"));
                fun.setUsuario(rs.getString("usuario_funci"));

            } else {
                fun.setUsuario(null);
            }

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DAOFuncionarios.class.getName()).log(Level.SEVERE, null, ex);
        }

        return fun;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import conexao.Conexao;
import entidade.Cargos;
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
 * @author Lab01_Aluno
 */
public class DAOCargos {

    private final String URL = "jdbc:mysql://localhost:3306/academia", NOME = "root", SENHA = "";
    private Connection conexao;
    private Statement comando;

    public DAOCargos() throws ClassNotFoundException, SQLException {

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

    public void cadastrarCargo(Cargos cargo) {
        try {

            conectar();

            PreparedStatement stmt = conexao.prepareStatement("INSERT INTO cargos(nome_cargo, gerenciar_aluno, gerenciar_funci,"
                    + " gerenciar_cargo,"
                    + " efetuar_pag, consulta_mensal, gerenciar_permissoes, gerenciar_relatorio) VALUES(?, ?, ?, ?, ?, ?, ?, ?)");

            stmt.setString(1, cargo.getNome_cargo());
            stmt.setBoolean(2, true);
            stmt.setBoolean(3, true);
            stmt.setBoolean(4, true);
            stmt.setBoolean(5, true);
            stmt.setBoolean(6, true);
            stmt.setBoolean(7, true);
            stmt.setBoolean(8, true);

            stmt.execute();
            stmt.close();

            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
        } catch (SQLException ex) {
            imprimeErro("Erro ao inserir Cargo", ex.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DAOAlunos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarCargo(Cargos cargo) throws ClassNotFoundException, SQLException {

        conectar();

        try {

            PreparedStatement stmt = conexao.prepareStatement("UPDATE cargos"
                    + " SET nome_cargo = ?"
                    + " WHERE id_cargo = '" + cargo.getId_cargo() + "'");

            stmt.setString(1, cargo.getNome_cargo());

            stmt.execute();
            stmt.close();

            JOptionPane.showMessageDialog(null, "Atualizado com Sucesso !!");

        } catch (SQLException ex) {
            System.out.println("Erro ao atualizar Cargo! ERRO: " + ex.getMessage());
        }
    }

    public void apagarCargo(Cargos cargo) throws ClassNotFoundException, SQLException {

        conectar();

        try {
            comando.execute("DELETE FROM cargos WHERE id_cargo = '" + cargo.getId_cargo() + "'");

            JOptionPane.showMessageDialog(null, "Excluído com sucesso !!");

        } catch (SQLException ex) {
            imprimeErro("Erro ao apagar Aluno ! ERRO: ", ex.getMessage());
        }
    }

    public List<Cargos> PesquisaCargo(Cargos cargo) throws ClassNotFoundException, SQLException {

        conectar();

        List<Cargos> lista = new ArrayList<Cargos>();
        ResultSet rs;

        try {
            rs = comando.executeQuery("SELECT id_cargo, nome_cargo FROM cargos"
                    + " WHERE nome_cargo LIKE '" + cargo.getNome_cargo() + "%'");

            while (rs.next()) {
                Cargos car = new Cargos();

                car.setId_cargo(rs.getInt("id_cargo"));
                car.setNome_cargo(rs.getString("nome_cargo"));

                lista.add(car);
            }
        } catch (SQLException ex) {
            imprimeErro("Erro ao buscar alunos ! ERRO: ", ex.getMessage());
        }

        return lista;
    }

    public Cargos buscarCargo(Cargos cargo) throws SQLException, ClassNotFoundException {

        conectar();

        Cargos car = new Cargos();
        ResultSet rs;

        try {
            rs = comando.executeQuery("SELECT nome_cargo, gerenciar_aluno, gerenciar_funci, gerenciar_cargo,"
                    + " gerenciar_permissoes, gerenciar_relatorio, consulta_mensal, efetuar_pag"
                    + " FROM cargos"
                    + " WHERE id_cargo = '" + cargo.getId_cargo() + "'");

            while (rs.next()) {
                car.setNome_cargo(rs.getString("nome_cargo"));

                car.setGerenciar_aluno(rs.getBoolean("gerenciar_aluno"));

                car.setGerenciar_funci(rs.getBoolean("gerenciar_funci"));

                car.setGerenciar_cargo(rs.getBoolean("gerenciar_cargo"));

                car.setGerenciar_permissoes(rs.getBoolean("gerenciar_permissoes"));

                car.setGerenciar_relatorio(rs.getBoolean("gerenciar_relatorio"));

                car.setConsulta_mensal(rs.getBoolean("consulta_mensal"));

                car.setEfetuar_pag(rs.getBoolean("efetuar_pag"));
            }
        } catch (SQLException ex) {
            imprimeErro("Erro ao buscar cargo ! ERRO: ", ex.getMessage());
        }

        return car;
    }

    public List<Cargos> buscarTodosCargos() throws SQLException, ClassNotFoundException {

        conectar();

        List<Cargos> lista = new ArrayList<Cargos>();
        ResultSet rs;

        try {
            rs = comando.executeQuery("SELECT * FROM cargos");

            while (rs.next()) {

                Cargos car = new Cargos();
                car.setId_cargo(rs.getInt("id_cargo"));
                car.setNome_cargo(rs.getString("nome_cargo"));

                lista.add(car);
            }
        } catch (SQLException ex) {
            imprimeErro("Erro ao buscar cargo ! ERRO: ", ex.getMessage());
        }

        return lista;
    }

    public void atualizarPermissao(Cargos cargo) throws ClassNotFoundException, SQLException {

        conectar();

        try {

            PreparedStatement stmt = conexao.prepareStatement("UPDATE cargos"
                    + " SET gerenciar_aluno = ?, gerenciar_funci = ?, gerenciar_cargo = ?, gerenciar_permissoes = ?,"
                    + " gerenciar_relatorio = ?, consulta_mensal = ?, efetuar_pag = ?"
                    + " WHERE id_cargo = '" + cargo.getId_cargo() + "'");

            stmt.setBoolean(1, cargo.isGerenciar_aluno());

            stmt.setBoolean(2, cargo.isGerenciar_funci());

            stmt.setBoolean(3, cargo.isGerenciar_cargo());

            stmt.setBoolean(4, cargo.isGerenciar_permissoes());

            stmt.setBoolean(5, cargo.isGerenciar_relatorio());

            stmt.setBoolean(6, cargo.isConsulta_mensal());

            stmt.setBoolean(7, cargo.isEfetuar_pag());

            stmt.execute();
            stmt.close();

            JOptionPane.showMessageDialog(null, "Atualizado com Sucesso !!");

        } catch (SQLException ex) {
            System.out.println("Erro ao atualizar Cargo! " + ex.getMessage());
        }

    }

}

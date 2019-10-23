/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import conexao.Conexao;
import entidade.Alunos;
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
 * @author Jocélia
 */
public class DAOAlunos {

    private final String URL = "jdbc:mysql://localhost:3306/academia", NOME = "root", SENHA = "";
    private Connection conexao;
    private Statement comando;

    public DAOAlunos() throws ClassNotFoundException, SQLException {
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

    public void cadastrarAlunos(Alunos aluno) {
        try {

            conectar();

            PreparedStatement stmt = conexao.prepareStatement("INSERT INTO alunos"
                    + " (nome_aluno, data_nasci_aluno, rg_aluno, endereco_aluno, num_ende_aluno, bairro_aluno, telefone_aluno,"
                    + " celular_aluno, datainicio_aluno, datavencimento_aluno, foto_aluno)"
                    + " VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

            SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");

            stmt.setString(1, aluno.getNome_aluno());

            if (aluno.getDatanascimento_aluno() != null) {
                stmt.setString(2, formato.format(aluno.getDatanascimento_aluno()));
            } else {
                stmt.setString(2, null);
            }

            stmt.setString(3, aluno.getRg_aluno());

            stmt.setString(4, aluno.getEndereco_aluno());

            stmt.setInt(5, aluno.getNum_ende_aluno());

            stmt.setString(6, aluno.getBairro_aluno());

            stmt.setString(7, aluno.getTelefone_aluno());

            stmt.setString(8, aluno.getCelular_aluno());

            stmt.setString(9, formato.format(aluno.getDatainicio()));

            stmt.setString(10, formato.format(aluno.getDatavencimento()));

            if (aluno.getImagem_aluno() !=  null) {
                InputStream arquivo = new FileInputStream(new File(aluno.getImagem_aluno()));
                stmt.setBlob(11, arquivo);
            } else {
                stmt.setBlob(11, (Blob) null);
            }

            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");

        } catch (SQLException ex) {
            imprimeErro("Erro ao cadastrar Aluno ! ", ex.getMessage());
        } catch (FileNotFoundException | ClassNotFoundException ex) {
            Logger.getLogger(DAOAlunos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarAlunos(Alunos aluno) throws ClassNotFoundException, SQLException {

        conectar();

        try {

            PreparedStatement stmt = null;

            SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");

            if (aluno.getImagem_aluno() != null) {
                stmt = conexao.prepareStatement("UPDATE alunos"
                        + " SET nome_aluno = ?,  rg_aluno = ?, telefone_aluno = ?, celular_aluno = ?, endereco_aluno = ?,"
                        + " num_ende_aluno = ?, bairro_aluno = ?, datainicio_aluno = ?, datavencimento_aluno = ?, data_nasci_aluno = ?, foto_aluno = ?"
                        + " WHERE id_aluno = " + aluno.getId_aluno());

                stmt.setString(1, aluno.getNome_aluno());
                stmt.setString(2, aluno.getRg_aluno());
                stmt.setString(3, aluno.getTelefone_aluno());
                stmt.setString(4, aluno.getCelular_aluno());
                stmt.setString(5, aluno.getEndereco_aluno());
                stmt.setInt(6, aluno.getNum_ende_aluno());
                stmt.setString(7, aluno.getBairro_aluno());
                stmt.setString(8, formato.format(aluno.getDatainicio()));
                stmt.setString(9, formato.format(aluno.getDatavencimento()));

                if (aluno.getDatanascimento_aluno() != null) {
                    stmt.setString(10, formato.format(aluno.getDatanascimento_aluno()));
                } else {
                    stmt.setString(10, null);
                }

                InputStream arquivo = new FileInputStream(new File(aluno.getImagem_aluno()));
                stmt.setBlob(11, arquivo);

            } else {
                stmt = conexao.prepareStatement("UPDATE alunos"
                        + " SET nome_aluno = ?, rg_aluno = ?, telefone_aluno = ?, celular_aluno = ?, endereco_aluno = ?,"
                        + " num_ende_aluno = ?, bairro_aluno = ?, datainicio_aluno = ?, datavencimento_aluno = ?, data_nasci_aluno = ?"
                        + " WHERE id_aluno = " + aluno.getId_aluno());

                stmt.setString(1, aluno.getNome_aluno());
                stmt.setString(2, aluno.getRg_aluno());
                stmt.setString(3, aluno.getTelefone_aluno());
                stmt.setString(4, aluno.getCelular_aluno());
                stmt.setString(5, aluno.getEndereco_aluno());
                stmt.setInt(6, aluno.getNum_ende_aluno());
                stmt.setString(7, aluno.getBairro_aluno());
                stmt.setString(8, formato.format(aluno.getDatainicio()));
                stmt.setString(9, formato.format(aluno.getDatavencimento()));

                if (aluno.getDatanascimento_aluno() != null) {
                    stmt.setString(10, formato.format(aluno.getDatanascimento_aluno()));
                } else {
                    stmt.setString(10, null);
                }

            }

            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null, "Atualizado com Sucesso !!");

        } catch (SQLException ex) {
            imprimeErro("Erro ao atualizar Aluno ! ", ex.getMessage());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DAOAlunos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void apagarAlunos(Alunos aluno) throws ClassNotFoundException, SQLException {
        conectar();

        try {
            comando.execute("DELETE FROM alunos WHERE id_aluno = '" + aluno.getId_aluno() + "'");
            JOptionPane.showMessageDialog(null, "Excluído com sucesso !!");

        } catch (SQLException ex) {
            imprimeErro("Erro ao apagar Aluno ! ", ex.getMessage());
        }
    }

    public List<Alunos> PesquisaAlunos(Alunos aluno) throws ClassNotFoundException, SQLException {

        conectar();

        List<Alunos> lista = new ArrayList<Alunos>();
        ResultSet rs;

        try {
            rs = comando.executeQuery("SELECT id_aluno, nome_aluno, rg_aluno"
                    + " FROM alunos"
                    + " WHERE nome_aluno LIKE '" + aluno.getNome_aluno() + "%'");

            while (rs.next()) {
                Alunos alu = new Alunos();

                alu.setId_aluno(rs.getInt("id_aluno"));
                alu.setNome_aluno(rs.getString("nome_aluno"));
                alu.setRg_aluno(rs.getString("rg_aluno"));

                lista.add(alu);
            }
        } catch (SQLException ex) {
            imprimeErro("Erro ao buscar Aluno(s) !", ex.getMessage());
        }

        return lista;
    }

    public Alunos buscarAluno(Alunos aluno) throws ClassNotFoundException, SQLException, ParseException {

        conectar();

        Alunos alu = new Alunos();
        ResultSet rs;

        try {
            rs = comando.executeQuery("SELECT nome_aluno, data_nasci_aluno, rg_aluno, telefone_aluno, celular_aluno, endereco_aluno,"
                    + " num_ende_aluno, datainicio_aluno, bairro_aluno, foto_aluno, datavencimento_aluno"
                    + " FROM alunos"
                    + " WHERE id_aluno = " + aluno.getId_aluno());

            //pega todos os atributos da pessoa
            if (rs.next()) {
                alu.setNome_aluno(rs.getString("nome_aluno"));
                alu.setDatanascimento_aluno(rs.getDate("data_nasci_aluno"));
                alu.setRg_aluno(rs.getString("rg_aluno"));
                alu.setTelefone_aluno(rs.getString("telefone_aluno"));
                alu.setCelular_aluno(rs.getString("celular_aluno"));
                alu.setEndereco_aluno(rs.getString("endereco_aluno"));
                alu.setNum_ende_aluno(rs.getInt("num_ende_aluno"));
                alu.setDatainicio(rs.getDate("datainicio_aluno"));
                alu.setBairro_aluno(rs.getString("bairro_aluno"));
                alu.setFoto_aluno(rs.getBytes("foto_aluno"));
                alu.setDatavencimento(rs.getDate("datavencimento_aluno"));
            }

        } catch (SQLException e) {
            imprimeErro("Erro ao buscar Alunos ! ", e.getMessage());
        }

        return alu;
    }

    public Alunos buscarImagemAluno(Alunos aluno) throws ClassNotFoundException, SQLException {

        conectar();

        Alunos alu = new Alunos();

        ResultSet rs;

        try {
            rs = comando.executeQuery("SELECT foto_aluno FROM alunos WHERE id_aluno = " + aluno.getId_aluno());

            if (rs.next()) {
                alu.setFoto_aluno(rs.getBytes("foto_aluno"));
            }
        } catch (SQLException ex) {
            imprimeErro("Erro ao buscar Foto do aluno ! ERRO: ", ex.getMessage());
        }

        return alu;
    }

    public Alunos buscarIDAluno(Alunos aluno) throws ClassNotFoundException, SQLException {
        conectar();

        Alunos alu = new Alunos();
        ResultSet rs;
        try {
            rs = comando.executeQuery("SELECT id_aluno"
                    + " FROM alunos"
                    + " WHERE nome_aluno LIKE '" + aluno.getNome_aluno() + "%'"
                    + " AND rg_aluno = '" + aluno.getRg_aluno() + "'");

            if (rs.next()) {
                alu.setId_aluno(rs.getInt("id_aluno"));
            }
        } catch (SQLException ex) {
            imprimeErro("Erro ao buscar Aluno ! ", ex.getMessage());
        }

        return alu;
    }

}

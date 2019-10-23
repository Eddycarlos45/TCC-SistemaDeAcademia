/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import conexao.Conexao;
import entidade.Alunos;
import entidade.Atividades;
import entidade.Mensalidades;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author José Wilson, Pedro, Edson e Denis
 */
public class DAOMensalidades {

    public String URL = "jdbc:mysql://localhost:3306/academia", NOME = "root", SENHA = "";
    private Connection conexao;
    private Statement comando;

    public DAOMensalidades() throws SQLException, ClassNotFoundException {
        conexao = Conexao.conexao(URL, NOME, SENHA);
    }

    public void conectar() {
        try {
            conexao = Conexao.conexao(URL, NOME, SENHA);
            comando = conexao.createStatement();
            System.out.println("Conectado!");
        } catch (ClassNotFoundException ex) {
            imprimeErro("Erro ao carregar o Driver!", ex.getMessage());
        } catch (SQLException ex) {
            imprimeErro("Erro ao conectar!", ex.getMessage());
        }
    }

    public void fechar() {
        try {
            comando.close();
            conexao.close();
            System.out.println("Conexao Fechada!");
        } catch (SQLException ex) {
            imprimeErro("Erro ao fechar a conexão!", ex.getMessage());
        }
    }

    public void imprimeErro(String msg, String msgErro) {
        JOptionPane.showMessageDialog(null, msg, "Erro Crítico!", 0);
        System.err.println(msg);
        System.out.println(msgErro);
        System.exit(0);
    }

    public List<Alunos> pesquisarAlunos(Alunos aluno) {
        conectar();
        List<Alunos> resultado = new ArrayList<>();
        ResultSet rs;

        try {
            rs = comando.executeQuery("SELECT id_aluno, nome_aluno, rg_aluno "
                    + "FROM alunos "
                    + "WHERE nome_aluno LIKE '" + aluno.getNome_aluno() + "%'");

            while (rs.next()) {
                Alunos alu = new Alunos();

                alu.setId_aluno(rs.getInt("id_aluno"));
                alu.setNome_aluno(rs.getString("nome_aluno"));
                alu.setRg_aluno(rs.getString("rg_aluno"));

                resultado.add(alu);
            }
        } catch (SQLException ex) {
            imprimeErro("Erro ao buscar: " + aluno.getNome_aluno() + "\nERRO: ", ex.getMessage());
        }
        return resultado;
    }

    public List<Mensalidades> ListarStatus(Mensalidades mensal) throws ParseException {
        conectar();
        List<Mensalidades> resultado = new ArrayList<>();
        ResultSet rs;

        try {
            SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
            String data = formato.format(mensal.getData_vencimento());

            rs = comando.executeQuery("SELECT nome_aluno, status_mensal, data_vencimento FROM alunos, mensalidades"
                    + " WHERE mensalidades.id_aluno = alunos.id_aluno"
                    + " AND status_mensal = '" + mensal.getStatus_mensal() + "'"
                    + " AND data_vencimento <= '" + data + "'");

            while (rs.next()) {
                Mensalidades mensali = new Mensalidades();
                Alunos alu = new Alunos();

                alu.setNome_aluno(rs.getString("nome_aluno"));
                mensali.setAluno(alu);
                mensali.setStatus_mensal(rs.getString("status_mensal"));
                mensali.setData_vencimento(rs.getDate("data_vencimento"));

                resultado.add(mensali);
            }

        } catch (SQLException ex) {
            imprimeErro("Erro ao buscar: " + mensal.getId_mensalidade() + "\nERRO: ", ex.getMessage());
        }
        return resultado;
    }

    public List<Mensalidades> pesquisarMensalidades(Mensalidades mensal) {
        conectar();
        List<Mensalidades> resultado = new ArrayList<>();
        ResultSet rs;

        try {
            rs = comando.executeQuery("SELECT id_mensal, data_pagamento, data_vencimento, status_mensal"
                    + " FROM mensalidades"
                    + " WHERE id_aluno = '" + mensal.getAluno().getId_aluno() + "'");

            while (rs.next()) {
                Mensalidades mensali = new Mensalidades();
                mensali.setId_mensalidade(rs.getInt("id_mensal"));
                mensali.setData_pagamento(rs.getDate("data_pagamento"));
                mensali.setData_vencimento(rs.getDate("data_vencimento"));
                mensali.setStatus_mensal(rs.getString("status_mensal"));

                resultado.add(mensali);
            }

        } catch (SQLException ex) {
            imprimeErro("Erro ao buscar: " + mensal.getId_mensalidade(), ex.getMessage());
        }
        return resultado;
    }

    public List<Mensalidades> pesquisarMensalidades2(Mensalidades mensal) {
        conectar();
        List<Mensalidades> resultado = new ArrayList<>();
        ResultSet rs;

        try {
            rs = comando.executeQuery("SELECT id_mensal, data_pagamento, data_vencimento, status_mensal"
                    + " FROM mensalidades"
                    + " WHERE id_aluno = " + mensal.getAluno().getId_aluno()
                    + " AND status_mensal = '" + mensal.getStatus_mensal() + "'");

            while (rs.next()) {
                Mensalidades mensali = new Mensalidades();
                mensali.setId_mensalidade(rs.getInt("id_mensal"));
                mensali.setData_pagamento(rs.getDate("data_pagamento"));
                mensali.setData_vencimento(rs.getDate("data_vencimento"));
                mensali.setStatus_mensal(rs.getString("status_mensal"));

                resultado.add(mensali);
            }

        } catch (SQLException ex) {
            imprimeErro("Erro ao buscar: " + mensal.getId_mensalidade(), ex.getMessage());
        }
        return resultado;
    }

    public void cadastrarMensalidades(Mensalidades mensal) throws ClassNotFoundException, SQLException {
        conectar();

        try {
            SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");

            PreparedStatement stmt = conexao.prepareStatement("INSERT INTO mensalidades (id_aluno, data_vencimento, status_mensal) VALUES (?,?,?)");

            stmt.setInt(1, mensal.getAluno().getId_aluno());
            stmt.setString(2, formato.format(mensal.getData_vencimento()));
            stmt.setString(3, mensal.getStatus_mensal());

            stmt.execute();
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            fechar();
        }
    }

    public void efetuarPagamento(Mensalidades mensal) throws ClassNotFoundException, SQLException {

        conectar();

        try {
            SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");

            PreparedStatement stmt = conexao.prepareStatement("UPDATE mensalidades SET status_mensal = ?, data_pagamento = ? WHERE id_mensal = " + mensal.getId_mensalidade() + " AND id_aluno = " + mensal.getAluno().getId_aluno());

            stmt.setString(1, mensal.getStatus_mensal());
            stmt.setString(2, formato.format(mensal.getData_pagamento()));

            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null, "Pagamento efetuado!");

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            fechar();
        }
    }

    public List<Mensalidades> ListarStatus2(Mensalidades mensal) {
        
        conectar();
        List<Mensalidades> resultado = new ArrayList<>();
        ResultSet rs;

        try {
            SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
            String data = formato.format(mensal.getData_vencimento());

            rs = comando.executeQuery("SELECT nome_aluno, status_mensal, data_vencimento FROM alunos, mensalidades"
                    + " WHERE mensalidades.id_aluno = alunos.id_aluno"
                    + " AND data_vencimento <= '" + data + "'");

            while (rs.next()) {
                Mensalidades mensali = new Mensalidades();
                Alunos alu = new Alunos();

                alu.setNome_aluno(rs.getString("nome_aluno"));
                mensali.setAluno(alu);
                mensali.setStatus_mensal(rs.getString("status_mensal"));
                mensali.setData_vencimento(rs.getDate("data_vencimento"));

                resultado.add(mensali);
            }

        } catch (SQLException ex) {
            imprimeErro("Erro ao buscar: " + mensal.getId_mensalidade() + "\nERRO: ", ex.getMessage());
        }
        return resultado;
        
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

/**
 *
 * @author Jocélia
 */
public class Atividades {

    private int id_atividade;
    private String nome_atividade;
    private String tipo_atividade;
    private double valor_atividade;
    
    public int getId_atividade() {
        return id_atividade;
    }

    public void setId_atividade(int id_atividade) {
        this.id_atividade = id_atividade;
    }

    public String getNome_atividade() {
        return nome_atividade;
    }

    public void setNome_atividade(String nome_atividade) {
        this.nome_atividade = nome_atividade;
    }

    public String getTipo_atividade() {
        return tipo_atividade;
    }

    public void setTipo_atividade(String tipo_atividade) {
        this.tipo_atividade = tipo_atividade;
    }

    public double getValor_atividade() {
        return valor_atividade;
    }

    public void setValor_atividade(double valor_atividade) {
        this.valor_atividade = valor_atividade;
    }
    
}

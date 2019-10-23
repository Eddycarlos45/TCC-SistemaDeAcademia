/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

/**
 *
 * @author Lab01_Aluno
 */
public class Cargos {
    
    private int id_cargo;
    private String nome_cargo;
    
    private boolean gerenciar_aluno;
    
    private boolean gerenciar_funci;
    
    private boolean gerenciar_cargo;
    
    private boolean gerenciar_permissoes;
    
    private boolean gerenciar_relatorio;
    
    private boolean consulta_mensal;
    
    private boolean efetuar_pag;

    public int getId_cargo() {
        return id_cargo;
    }

    public void setId_cargo(int id_cargo) {
        this.id_cargo = id_cargo;
    }

    public String getNome_cargo() {
        return nome_cargo;
    }

    public void setNome_cargo(String nome_cargo) {
        this.nome_cargo = nome_cargo;
    }

    public boolean isGerenciar_aluno() {
        return gerenciar_aluno;
    }

    public void setGerenciar_aluno(boolean gerenciar_aluno) {
        this.gerenciar_aluno = gerenciar_aluno;
    }

    public boolean isGerenciar_funci() {
        return gerenciar_funci;
    }

    public void setGerenciar_funci(boolean gerenciar_funci) {
        this.gerenciar_funci = gerenciar_funci;
    }

    public boolean isGerenciar_cargo() {
        return gerenciar_cargo;
    }

    public void setGerenciar_cargo(boolean gerenciar_cargo) {
        this.gerenciar_cargo = gerenciar_cargo;
    }

    public boolean isGerenciar_permissoes() {
        return gerenciar_permissoes;
    }

    public void setGerenciar_permissoes(boolean gerenciar_permissoes) {
        this.gerenciar_permissoes = gerenciar_permissoes;
    }

    public boolean isGerenciar_relatorio() {
        return gerenciar_relatorio;
    }

    public void setGerenciar_relatorio(boolean gerenciar_relatorio) {
        this.gerenciar_relatorio = gerenciar_relatorio;
    }

    public boolean isConsulta_mensal() {
        return consulta_mensal;
    }

    public void setConsulta_mensal(boolean consulta_mensal) {
        this.consulta_mensal = consulta_mensal;
    }

    public boolean isEfetuar_pag() {
        return efetuar_pag;
    }

    public void setEfetuar_pag(boolean efetuar_pag) {
        this.efetuar_pag = efetuar_pag;
    }
    
}

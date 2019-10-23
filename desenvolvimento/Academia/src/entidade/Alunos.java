/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

import java.sql.Blob;
import java.util.Date;

/**
 *
 * @author Jocélia
 */
public class Alunos {
    
    private int id_aluno;    
    private String nome_aluno;
    private Date datanascimento_aluno;
    private String rg_aluno;
    private String telefone_aluno;
    private String celular_aluno;
    private String endereco_aluno;
    private int num_ende_aluno;
    private String bairro_aluno;
    private String cidade_aluno;
    private String imagem_aluno;
    private byte[] foto_aluno;
    private Blob foto_aluno_editar;
    private Date datainicio;
    private Date datavencimento;
            
    public int getId_aluno() {
        return id_aluno;
    }

    public void setId_aluno(int id_aluno) {
        this.id_aluno = id_aluno;
    }

    public String getNome_aluno() {
        return nome_aluno;
    }

    public void setNome_aluno(String nome_aluno) {
        this.nome_aluno = nome_aluno;
    }

    public Date getDatanascimento_aluno() {
        return datanascimento_aluno;
    }

    public void setDatanascimento_aluno(Date datanascimento_aluno) {
        this.datanascimento_aluno = datanascimento_aluno;
    }
    

    public String getEndereco_aluno() {
        return endereco_aluno;
    }

    public void setEndereco_aluno(String endereco_aluno) {
        this.endereco_aluno = endereco_aluno;
    }

    public int getNum_ende_aluno() {
        return num_ende_aluno;
    }

    public void setNum_ende_aluno(int num_ende_aluno) {
        this.num_ende_aluno = num_ende_aluno;
    }

    public String getBairro_aluno() {
        return bairro_aluno;
    }

    public void setBairro_aluno(String bairro_aluno) {
        this.bairro_aluno = bairro_aluno;
    }

    public String getCidade_aluno() {
        return cidade_aluno;
    }

    public void setCidade_aluno(String cidade_aluno) {
        this.cidade_aluno = cidade_aluno;
    }
    
    /**
     * @return the datainicio
     */
    public Date getDatainicio() {
        return datainicio;
    }

    /**
     * @param datainicio the datainicio to set
     */
    public void setDatainicio(Date datainicio) {
        this.datainicio = datainicio;
    }
    
    public String getImagem_aluno() {
        return imagem_aluno;
    }

    public void setImagem_aluno(String imagem_aluno) {
        this.imagem_aluno = imagem_aluno;
    }

    public byte[] getFoto_aluno() {
        return foto_aluno;
    }

    public void setFoto_aluno(byte[] foto_aluno) {
        this.foto_aluno = foto_aluno;
    }

    /**
     * @return the datavencimento
     */
    public Date getDatavencimento() {
        return datavencimento;
    }

    /**
     * @param datavencimento the datavencimento to set
     */
    public void setDatavencimento(Date datavencimento) {
        this.datavencimento = datavencimento;
    }

    public String getRg_aluno() {
        return rg_aluno;
    }

    public void setRg_aluno(String rg_aluno) {
        this.rg_aluno = rg_aluno;
    }

    public String getTelefone_aluno() {
        return telefone_aluno;
    }

    public void setTelefone_aluno(String telefone_aluno) {
        this.telefone_aluno = telefone_aluno;
    }

    public String getCelular_aluno() {
        return celular_aluno;
    }

    public void setCelular_aluno(String celular_aluno) {
        this.celular_aluno = celular_aluno;
    }

    public Blob getFoto_aluno_editar() {
        return foto_aluno_editar;
    }

    public void setFoto_aluno_editar(Blob foto_aluno_editar) {
        this.foto_aluno_editar = foto_aluno_editar;
    }
}

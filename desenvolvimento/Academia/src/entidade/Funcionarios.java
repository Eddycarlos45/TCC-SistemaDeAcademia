/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

import java.util.Date;

/**
 *
 * @author Lab01_Aluno
 */
public class Funcionarios {
    
    //DADOS PESSOAIS
    private int id_funcionario;
    private String nome;
    private String rg_funcionario;
    private Date data_nasc_funcionario;
    private String telefone;
    private String celular;
    private String imagem_funcionario;
    private byte[] foto_funcionario;
    
    //DADOS CARGO
    private Cargos cargo;
    
    //DADOS LOGIN
    private String usuario;
    private String senha;
    private String confirma_usuario;
    private String confirma_senha;
    private String caminho_wallpaper;
    private byte[] wallpaper_funci;
    
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the celular
     */
    public String getCelular() {
        return celular;
    }

    /**
     * @param celular the celular to set
     */
    public void setCelular(String celular) {
        this.celular = celular;
    }

    /**
     * @return the imagem_funcionario
     */
    public String getImagem_funcionario() {
        return imagem_funcionario;
    }

    /**
     * @param imagem_funcionario the imagem_aluno to set
     */
    public void setImagem_funcionario(String imagem_funcionario) {
        this.imagem_funcionario = imagem_funcionario;
    }

    /**
     * @return the foto_funcionario
     */
    public byte[] getFoto_funcionario() {
        return foto_funcionario;
    }

    /**
     * @param foto_funcionario the foto_funcionario to set
     */
    public void setFoto_funcionario(byte[] foto_funcionario) {
        this.foto_funcionario = foto_funcionario;
    }

    /**
     * @return the data_nasc_funcionario
     */
    public Date getData_nasc_funcionario() {
        return data_nasc_funcionario;
    }

    /**
     * @param data_nasc_funcionario the data_nasc_funcionario to set
     */
    public void setData_nasc_funcionario(Date data_nasc_funcionario) {
        this.data_nasc_funcionario = data_nasc_funcionario;
    }

    /**
     * @return the id_funcionario
     */
    public int getId_funcionario() {
        return id_funcionario;
    }

    /**
     * @param id_funcionario the id_funcionario to set
     */
    public void setId_funcionario(int id_funcionario) {
        this.id_funcionario = id_funcionario;
    }

    /**
     * @return the rg_funcionario
     */
    public String getRg_funcionario() {
        return rg_funcionario;
    }

    /**
     * @param rg_funcionario the rg_funcionario to set
     */
    public void setRg_funcionario(String rg_funcionario) {
        this.rg_funcionario = rg_funcionario;
    }

    public Cargos getCargo() {
        return cargo;
    }

    public void setCargo(Cargos cargo) {
        this.cargo = cargo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public byte[] getWallpaper_funci() {
        return wallpaper_funci;
    }

    public void setWallpaper_funci(byte[] wallpaper_funci) {
        this.wallpaper_funci = wallpaper_funci;
    }

    public String getCaminho_wallpaper() {
        return caminho_wallpaper;
    }

    public void setCaminho_wallpaper(String caminho_wallpaper) {
        this.caminho_wallpaper = caminho_wallpaper;
    }

    public String getConfirma_usuario() {
        return confirma_usuario;
    }

    public void setConfirma_usuario(String confirma_usuario) {
        this.confirma_usuario = confirma_usuario;
    }

    public String getConfirma_senha() {
        return confirma_senha;
    }

    public void setConfirma_senha(String confirma_senha) {
        this.confirma_senha = confirma_senha;
    }
}

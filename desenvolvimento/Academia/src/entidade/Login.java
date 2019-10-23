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
public class Login {

    private String usuario;
    private String senha;
    private Cargos cargo;
    private String caminho_imagem;
    private byte[] foto;
    private Funcionarios funcionario;
    private String confirma_login;
    private String confirma_senha;

    /**
     * @return the usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }

    public String getCaminho_imagem() {
        return caminho_imagem;
    }

    public void setCaminho_imagem(String caminho_imagem) {
        this.caminho_imagem = caminho_imagem;
    }

    public String getConfirma_login() {
        return confirma_login;
    }

    public void setConfirma_login(String confirma_login) {
        this.confirma_login = confirma_login;
    }

    public String getConfirma_senha() {
        return confirma_senha;
    }

    public void setConfirma_senha(String confirma_senha) {
        this.confirma_senha = confirma_senha;
    }

    /**
     * @return the funcionario
     */
    public Funcionarios getFuncionario() {
        return funcionario;
    }

    /**
     * @param funcionario the funcionario to set
     */
    public void setFuncionario(Funcionarios funcionario) {
        this.funcionario = funcionario;
    }

    public Cargos getCargo() {
        return cargo;
    }

    public void setCargo(Cargos cargo) {
        this.cargo = cargo;
    }
}

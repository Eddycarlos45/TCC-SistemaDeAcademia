/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

import java.util.Date;

/**
 *
 * @author Jocélia
 */
public class Mensalidades {

    private int id_mensalidade;
    private Alunos aluno;
    private Atividades atividade;
    private Date data_pagamento;
    private Date data_vencimento;
    private String status_mensal;

    public int getId_mensalidade() {
        return id_mensalidade;
    }

    public void setId_mensalidade(int id_mensalidade) {
        this.id_mensalidade = id_mensalidade;
    }

    public Alunos getAluno() {
        return aluno;
    }

    public void setAluno(Alunos aluno) {
        this.aluno = aluno;
    }

    public Atividades getAtividade() {
        return atividade;
    }

    public void setAtividade(Atividades atividade) {
        this.atividade = atividade;
    }

    public Date getData_pagamento() {
        return data_pagamento;
    }

    public void setData_pagamento(Date data_pagamento) {
        this.data_pagamento = data_pagamento;
    }

    public Date getData_vencimento() {
        return data_vencimento;
    }

    public void setData_vencimento(Date data_vencimento) {
        this.data_vencimento = data_vencimento;
    }

    public String getStatus_mensal() {
        return status_mensal;
    }

    public void setStatus_mensal(String status_mensal) {
        this.status_mensal = status_mensal;
    }
    
}

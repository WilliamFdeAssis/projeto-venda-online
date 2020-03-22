/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.vendaonline1.domain;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author william
 */
@Entity
@Table(name="tb_vendas")

public class Venda extends GenericDomain {
    
    
   @Temporal (value=TemporalType.TIMESTAMP)
   @Column(name =  "ven_horario", nullable = false)
    private Date horario;
    
    @Column(name = "ven_valorTotal", scale = 2 , precision = 7, nullable = false)
    private BigDecimal valorTotal;
    
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="tb_funcionarios_codigo", referencedColumnName="codigo", 
    nullable=false)
      private Funcionario funcionario;

    public Date getHorario() {
        return horario;
    }

    public void setHorario(Date horario) {
        this.horario = horario;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
    
    
}

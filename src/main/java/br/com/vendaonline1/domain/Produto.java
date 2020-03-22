/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.vendaonline1.domain;

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 *
 * @author william
 */
@Entity
@Table(name ="tb_produto" )
public class Produto extends GenericDomain {
    
@Column(name="pro_descricao", length=50, nullable=false )
private String descricao;


@DecimalMin(value = "0.00", message = "O valor não pode ser menor que 0")
@Column(name="pro_preco", nullable=false, scale=2, precision=7 )
private BigDecimal preco;

@NotNull(message = "Insira a Quantidade")
@Min(value = 0 , message = "O valor não pode ser menor que 0")
@Column(name="pro_quantidade",  nullable=false )
private Integer quantidade;

@ManyToOne(fetch = FetchType.EAGER)
@JoinColumn(name="tb_fornecedores_codigo", referencedColumnName="codigo", 
nullable=false)
private Fornecedor fornecedor;


    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }


    
}

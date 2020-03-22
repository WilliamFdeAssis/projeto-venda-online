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

/**
 *
 * @author william
 */
@Table(name = "tb_itens")
@Entity
public class Item extends GenericDomain {
    
    @Column(name = "ite_quantidade", nullable = false)
    private Integer quantidade;

    @Column(name = "ite_valor_parcial", nullable = false, scale = 2, precision = 7)
    private BigDecimal valor_parcial;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "tb_produto_codigo", referencedColumnName = "codigo",
            nullable = false)
    private Produto produto;

    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "tb_vendas_codigo", referencedColumnName = "codigo",
            nullable = false)
     private Venda venda;

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getValor_parcial() {
        return valor_parcial;
    }

    public void setValor_parcial(BigDecimal valor_parcial) {
        this.valor_parcial = valor_parcial;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }
    

}
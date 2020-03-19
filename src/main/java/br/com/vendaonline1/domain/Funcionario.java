/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.vendaonline1.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author william
 */
@Entity
@Table(name = "tb_funcionario")
public class Funcionario extends GenericDomain {
   
    @Column(name = "fun_nome", length = 50, nullable = false)
    private String nome;
    
    @Column(name = "fun_cpf", length = 50, nullable = false)
    private String cpf;
    
    private String senha;
    
    private String funcao;
    
}

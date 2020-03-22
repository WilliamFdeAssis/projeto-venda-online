/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.vendaonline1.domain;



/**
 *
 * @author william
 */
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tb_funcionarios")

public class Funcionario extends GenericDomain {


	
	@Column(name = "fun_nome", length = 50, nullable = false)
	private String nome;
 
	
	@Column(name = "fun_cpf", length = 14, nullable = false, unique = true)
	private String cpf;

	
	@Size(min = 5, max = 8, message = "Sua senha deve conter de 5 a 8 caracteres")
	@Column(name = "fun_senha", length = 50, nullable = false)
	private String senha;
    
	
	@Column(name = "fun_funcao", length = 50, nullable = false)
	private String funcao;

	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	

	
	}
	
	
	
	
	
	




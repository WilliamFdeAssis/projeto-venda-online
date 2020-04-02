/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.vendaonline1.bean;

import br.com.vendaonline1.dao.FornecedorDao;
import br.com.vendaonline1.domain.Fornecedor;
import br.com.vendasonline1.util.JSFUtil;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author william
 */
@ManagedBean(name = "MBFornecedor")
@ViewScoped
public class FornecedorBean {
    
    private Fornecedor fornecedor;
    
    public void salvar(){
        
        try{
            FornecedorDao fdao = new FornecedorDao();
             fdao.salvar(fornecedor);
             
        
        JSFUtil.adicionarMensagemSucesso("Salvo com sucesso");
        
        
             fornecedor = new Fornecedor();
        
        } catch(RuntimeException e){
            JSFUtil.adicionarMensagemErro("ex.getMessage()");
            e.printStackTrace();
        }
    }

    public Fornecedor getFornecedor() {
        if(fornecedor == null){
            fornecedor = new Fornecedor();
        }
        return fornecedor;
       
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }
    
}

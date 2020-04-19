/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.vendaonline1.bean;

import br.com.vendaonline1.dao.FornecedorDao;
import br.com.vendaonline1.domain.Fornecedor;
import br.com.vendasonline1.util.JSFUtil;
import java.util.ArrayList;
import javax.annotation.PostConstruct;
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
    
    private ArrayList<Fornecedor>lista;
    private ArrayList<Fornecedor>itensFiltrados;
    
    private  String acao;
    
    

    public void prepararPesquisa(){
        
         try{
        FornecedorDao fdao = new FornecedorDao();
        
          lista = (ArrayList<Fornecedor>) fdao.listar();
          
          
    } catch(RuntimeException e){
            JSFUtil.adicionarMensagemErro("ex.getMessage()");
            e.printStackTrace();
        }
        
        
    }
       
      public void carregarCadastro(){
          
          try{
           
         acao = JSFUtil.getParam("foracao");
        
         String valor = JSFUtil.getParam("forcod");
          if(valor != null){
              
              Long codigo = Long.parseLong(valor);
              
              FornecedorDao fdao = new FornecedorDao();
              
                fornecedor = fdao.buscar(codigo);
          }else{
              
            fornecedor = new Fornecedor();
        }
          }
          
          
     catch(RuntimeException e){
            JSFUtil.adicionarMensagemErro("ex.getMessage()");
            e.printStackTrace();
        }
        
          
          
      }

    public String getAcao() {
        return acao;
    }

    public void setAcao(String acao) {
        this.acao = acao;
    }
    
    public void novo(){
    fornecedor = new Fornecedor(); 
         
}
    
    public void salvar(){
        
        try{
            FornecedorDao fdao = new FornecedorDao();
             fdao.salvar(fornecedor);
             
        
        JSFUtil.adicionarMensagemSucesso("Salvo com sucesso");
        
        
             
        
        } catch(RuntimeException e){
            JSFUtil.adicionarMensagemErro("ex.getMessage()");
            e.printStackTrace();
        }
    }
    
    
     public void excluir(){
         
         try{
         FornecedorDao fdao = new FornecedorDao();
         
         fdao.excluir(fornecedor); 
         
         JSFUtil.adicionarMensagemSucesso("Fornecedor excluido com sucesso");
     
         }catch(RuntimeException e){
             
             JSFUtil.adicionarMensagemErro("Não foi possivel excluir o fornecedor"
                     + " que tenha um produto associado!");
             
             e.printStackTrace();
         }
         
         
     }
     
       public void editar(){
           
           try{
               
               FornecedorDao fdao = new FornecedorDao();
               
               fdao.editar(fornecedor);
               
               JSFUtil.adicionarMensagemSucesso("Fornecedor editado com sucesso");
               
           } catch(RuntimeException e){
               
               JSFUtil.adicionarMensagemErro("ex.getMessage()");
               e.printStackTrace();
               
               
           }
       }
      
    

    public Fornecedor getFornecedor() {
        
        return fornecedor;
       
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public ArrayList<Fornecedor> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Fornecedor> lista) {
        this.lista = lista;
    }

    public ArrayList<Fornecedor> getItensFiltrados() {
        return itensFiltrados;
    }

    public void setItensFiltrados(ArrayList<Fornecedor> itensFiltrados) {
        this.itensFiltrados = itensFiltrados;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.vendaonline1.dao;

import br.com.vendaonline1.domain.Fornecedor;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author william
 */
public class FornecedorDaoTest {
    


    @Test
    @Ignore
    public void salvar(){
        
        Fornecedor fornecedor = new Fornecedor();
        
        fornecedor.setDescricao("Roseli de Assis");
        
        FornecedorDao fdao = new FornecedorDao();
        
         fdao.salvar(fornecedor);
    }
       @Test
       @Ignore
     public void listar(){
         
         FornecedorDao fdao = new FornecedorDao();
         List<Fornecedor> resultado = fdao.listar();
         
         System.out.println("Total de registro encontrados " + resultado.size());
         
         for(Fornecedor fornecedor : resultado){
             System.out.println(fornecedor.getCodigo()+ "-"+ fornecedor.getDescricao());
         }
     }
      @Test
      @Ignore
     public void buscar(){
         Long codigo = 1l;
         
         FornecedorDao fdao = new FornecedorDao();
         
         Fornecedor fornecedor = fdao.buscar(codigo);
         
         if(fornecedor == null){
             System.out.println("Nenhum registro enconrado");
             
             
         } else{
             System.out.println("Registro encontrado : ");
             System.out.println(fornecedor.getCodigo() + " - " + fornecedor.getDescricao());
         }
     }
     @Test
     @Ignore
     public void excluir(){
         
         Long codigo = 2L;
         
         FornecedorDao fdao = new FornecedorDao();
         
         Fornecedor fornecedor = fdao.buscar(codigo);
         
         if(fornecedor == null){
             System.out.println("nenhum registro encontrado");
         }else{
             
             fdao.excluir(fornecedor);
             
            System.out.println("Registro removido : ");
            System.out.println(fornecedor.getCodigo() + " - " + fornecedor.getDescricao());
         }
                 
     }
     
     @Test
     @Ignore
     public void editar(){
         Long codigo = 1L;
         FornecedorDao fdao = new FornecedorDao();
         
         Fornecedor fornecedor = fdao.buscar(codigo);
         
         if(fornecedor == null){
             
             System.out.println("Nenhum registro encontrado");
         } else{
             System.out.println("Registro editado - Antes");
             System.out.println(fornecedor.getCodigo() + "-" + fornecedor.getDescricao());
             
             fornecedor.setDescricao("Descrição A");
             
             fdao.editar(fornecedor);
             
             System.out.println("Registro editado - Depois:");
             System.out.println(fornecedor.getCodigo() + "- " + fornecedor.getDescricao());
         }
     }
     
      
}

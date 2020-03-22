/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.vendaonline1.dao;

import br.com.vendaonline1.domain.Fornecedor;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author william
 */
public class FornecedorDaoTest {
    


    @Test
    public void salvar(){
        
        Fornecedor fornecedor = new Fornecedor();
        
        fornecedor.setDescricao("Roseli de Assis");
        
        FornecedorDao fdao = new FornecedorDao();
        
         fdao.salvar(fornecedor);
    }
    
}

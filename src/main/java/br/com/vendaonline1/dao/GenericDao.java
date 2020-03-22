/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.vendaonline1.dao;

import br.com.vendasonline1.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author william
 */
public class GenericDao<Entidade> {
    
    public void salvar(Entidade entidade){
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        Transaction transacao = null;
        
        try{
            transacao = sessao.beginTransaction();
            
            sessao.save(entidade);
            
            transacao.commit();
        } catch(RuntimeException erro){
            if(transacao != null){
                transacao.rollback();
            }
           
            throw erro;
            
        } finally{
            sessao.close();
        }
        
        
    }
    
}

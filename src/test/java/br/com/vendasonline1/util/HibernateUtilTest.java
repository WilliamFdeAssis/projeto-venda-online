/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.vendasonline1.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author william
 */
public class HibernateUtilTest {
    
    @Test
public void conectar(){
    
    Session sessao = HibernateUtil.getSessionFactory().openSession();
    
    sessao.close();
    
   HibernateUtil.fecharConexoes();
}
    
}
    
    
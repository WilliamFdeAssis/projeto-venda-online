/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.vendasonline1.util;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 *
 * @author william
 */
public class ContextListener implements  ServletContextListener{

    @Override
    public void contextInitialized(ServletContextEvent Arg0) {
        HibernateUtil.getSessionFactory().openSession();
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
      HibernateUtil.fecharConexoes();
    }
    
}

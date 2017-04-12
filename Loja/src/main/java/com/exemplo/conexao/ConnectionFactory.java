/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exemplo.conexao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Vickz
 */
public class ConnectionFactory {
    // entity manager factory é similar ao Connection 
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("victor");
    // em é similar ao PreparedStatement
    EntityManager em = emf.createEntityManager();
    
    public ConnectionFactory() {
    }
    
    public EntityManagerFactory createEmf(){
        return emf;
    }
    
    public EntityManager createEm(){
        return em;
    }
    
    public void close(){
        emf.close();
    }
}

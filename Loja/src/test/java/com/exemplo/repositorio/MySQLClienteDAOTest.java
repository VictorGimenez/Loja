/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exemplo.repositorio;

import com.exemplo.conexao.ConnectionFactory;
import com.exemplo.entity.Cliente;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Vickz
 */
public class MySQLClienteDAOTest {
    
    ConnectionFactory cf;
    MySQLClienteDAO mscdao;
    Cliente cli;
    
    @Before
    public void setUp() {
        cf = new ConnectionFactory();
        mscdao = new MySQLClienteDAO(cf);
        
    }

    /**
     * Test of inserir method, of class MySQLClienteDAO.
     */
    @Test
    public void testInserir() {
    }

    /**
     * Test of alterar method, of class MySQLClienteDAO.
     */
    @Test
    public void testAlterar() {
    }

    /**
     * Test of excluir method, of class MySQLClienteDAO.
     */
    @Test
    public void testExcluir() {
    }

    /**
     * Test of pesquisar method, of class MySQLClienteDAO.
     */
    @Test
    public void testPesquisar() {
    }

    /**
     * Test of listar method, of class MySQLClienteDAO.
     */
    @Test
    public void testListar() {
    }

    /**
     * Test of inserirLista method, of class MySQLClienteDAO.
     */
    @Test
    public void testInserirLista() {
    }
    
}

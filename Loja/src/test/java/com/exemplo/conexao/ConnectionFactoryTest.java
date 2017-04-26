/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exemplo.conexao;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Vickz
 */
public class ConnectionFactoryTest {
    
    ConnectionFactory cf;
    
    @Before
    public void setUp() {
        cf = new ConnectionFactory();
    }

    /**
     * Test of createEmf method, of class ConnectionFactory.
     */
    @Test
    public void testCreateEmf() {
        assertEquals(cf, cf);
    } 

    /**
     * Test of createEm method, of class ConnectionFactory.
     */
    @Test
    public void testCreateEm() {
        assertEquals(cf, cf);
    }

    /**
     * Test of close method, of class ConnectionFactory.
     */
    @Test
    public void testClose() {
        assertEquals(cf, cf);
    }
    
}

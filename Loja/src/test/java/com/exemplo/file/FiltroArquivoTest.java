/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exemplo.file;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Vickz
 */
public class FiltroArquivoTest {
    
    FiltroArquivo fa;
    
    @Before
    public void setUp() {
        fa = new FiltroArquivo(".xml", "Arquivo XML");
    }

    /**
     * Test of accept method, of class FiltroArquivo.
     */
    @Test
    public void testAccept() {
        assertTrue("C:\\Users\\Vickz\\Desktop\\Loja\\formularioPedido\\pedido.xml", true);
    }

    /**
     * Test of getDescription method, of class FiltroArquivo.
     */
    @Test
    public void testGetDescription() {
        assertEquals("Arquivo XML (*.xml) ", fa.getDescription());
    }
    
}

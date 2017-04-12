/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exemplo.dao;

import com.exemplo.controller.ClienteDAO;
import com.exemplo.controller.PedidoDAO;

/**
 *
 * @author Vickz
 */
public interface DAOManager {
    
    ClienteDAO getClienteDAO();
    
    PedidoDAO getPedidoDAO();
    
}

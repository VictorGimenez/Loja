/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exemplo.repositorio;

import com.exemplo.conexao.ConnectionFactory;
import com.exemplo.controller.ClienteDAO;
import com.exemplo.controller.PedidoDAO;
import com.exemplo.dao.DAOManager;
import java.sql.SQLException;

/**
 *
 * @author Vickz
 */
public class MySQLDAOManager implements DAOManager {

    private ConnectionFactory cf;
    private ClienteDAO clientes = null;
    private PedidoDAO pedidos = null;


    public MySQLDAOManager(ConnectionFactory cf) throws SQLException {
        this.cf = cf;
    }
    
    @Override
    public ClienteDAO getClienteDAO() {
        if (clientes == null) {
            clientes = new MySQLClienteDAO(cf);
        }
        return clientes;
    }

    @Override
    public PedidoDAO getPedidoDAO() {
        if (pedidos == null) {
            pedidos = new MySQLPedidoDAO(cf);
        }
        return pedidos;
    }

    
}

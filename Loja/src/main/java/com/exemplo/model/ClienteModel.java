/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exemplo.model;

import com.exemplo.controller.ClienteDAO;
import com.exemplo.exception.DAOException;
import com.exemplo.entity.Cliente;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ComboBoxModel;
import javax.swing.event.ListDataListener;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Vickz
 */
public class ClienteModel extends AbstractTableModel {
    
    private ClienteDAO clientes;
    private List<Cliente> listclientes;
    
    

    public ClienteModel(ClienteDAO clientes) throws DAOException {
        this.clientes = clientes;
    }
    
    public void atualizarModel() throws DAOException {
        listclientes = clientes.listar();
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "ID";
            default:
                return "[no]";
        }
    }

    @Override
    public int getRowCount() {
        return listclientes.size();
    }

    @Override
    public int getColumnCount() {
        return 1;
    }

    @Override
    public Object getValueAt(int line, int column) {
        Cliente cliente = listclientes.get(line);
        switch (column) {
            case 0:
                return cliente.getId();
            default:
                return "";
        }
    }

    
}

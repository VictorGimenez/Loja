/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exemplo.model;

import com.exemplo.conexao.ConnectionFactory;
import com.exemplo.controller.PedidoDAO;
import com.exemplo.exception.DAOException;
import com.exemplo.entity.Pedido;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Vickz
 */
public class PedidoModel extends AbstractTableModel {

    private PedidoDAO pedidos;
    private List<Pedido> listpedidos = new ArrayList<>();
    

    public PedidoModel(PedidoDAO pedidos) throws DAOException {
        this.pedidos = pedidos;
    }

    public void atualizarModel() throws DAOException {
        listpedidos = pedidos.listar();
    }
    

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "ID";
            case 1:
                return "Data de Cadastro";
            case 2:
                return "Nome do Produto";
            case 3:
                return "Num Controle";
            case 4:
                return "Quantidade";
            case 5:
                return "Valor Unitário";
            case 6:
                return "Cód Cliente";
            case 7:
                return "Valor Total";
            default:
                return "[no]";
        }
    }

    @Override
    public int getRowCount() {
        return listpedidos.size();
    }

    @Override
    public int getColumnCount() {
        return 8;
    }

    @Override
    public Object getValueAt(int line, int column) {
        Pedido pedido = listpedidos.get(line);
        switch (column) {
            case 0:
                return pedido.getId();
            case 1:
                return pedido.getDataCadastro();
            case 2:
                return pedido.getNomeProduto();
            case 3:
                return pedido.getNumControle();
            case 4:
                return pedido.getQuantidade();
            case 5:
                return pedido.getValorUnitario();
            case 6:
                return pedido.getCodCliente();
            case 7:
                return pedido.getValorTotal();
            default:
                return "";
        }
    }


}

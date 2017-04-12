/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exemplo.controller;

import com.exemplo.dao.DAO;
import com.exemplo.entity.Pedido;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Vickz
 */
public interface PedidoDAO extends DAO <Pedido, Long> {
    
    public Pedido pesquisarPorData(Long id, Date dataCadastro);
    public Double retornaSoma();
    public List<String> getNumControle();
    
}

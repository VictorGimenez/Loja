/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exemplo.dao;

import com.exemplo.entity.Pedido;
import java.util.List;

/**
 *
 * @author Vickz
 */
public interface DAO <T, K> {

    public void inserir(T o);
    
    public void alterar(T o);

    public void excluir(T o);

    public T pesquisar(K id);

    public List<T> listar();
    
}

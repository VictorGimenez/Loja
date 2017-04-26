/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exemplo.repositorio;

import com.exemplo.conexao.ConnectionFactory;
import com.exemplo.controller.ClienteDAO;
import com.exemplo.entity.Cliente;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author Vickz
 */
public class MySQLClienteDAO implements ClienteDAO {

    public ConnectionFactory cf = null;

    public MySQLClienteDAO(ConnectionFactory cf) {
        this.cf = cf;
    }

    @Override
    public void inserir(Cliente o) {
        cf.createEm().getTransaction().begin();
        //tanto persist quanto merge salvam o objeto no banco de dados 
        //em.persist(cliente);
        cf.createEm().merge(o);
        cf.createEm().getTransaction().commit();
    }

    @Override
    public void alterar(Cliente o) {
        cf.createEm().getTransaction().begin();
        Cliente cli = new Cliente();
        cli.getId();
        cf.createEm().merge(o);
        cf.createEm().getTransaction().commit();
    }

    @Override
    public void excluir(Cliente o) {
        cf.createEm().getTransaction().begin();
        cf.createEm().remove(o);
        cf.createEm().getTransaction().commit();
    }

    @Override
    public Cliente pesquisar(Long id) {
        cf.createEm().getTransaction().begin();
        Cliente cli = cf.createEm().find(Cliente.class, id);
        cf.createEm().getTransaction().commit();
        //erro ao deletar pois o factory já está fechado
        //emf.close();
        return cli;
    }

    @Override
    public List<Cliente> listar() {
        cf.createEm().getTransaction().begin();
        Query consulta = cf.createEm().createQuery("select cliente from Cliente cliente");
        List<Cliente> clientes = consulta.getResultList();
        cf.createEm().getTransaction().commit();
        return clientes;
    }

    public void inserirLista(Cliente o) {
        Boolean check = cf.createEm().createQuery("select 1 from Cliente cliente").setMaxResults(1).getResultList().isEmpty();
        if(check == true){
        cf.createEm().getTransaction().begin();
            for (int i = 0; i < 10; i++) {
                cf.createEm().merge(o);
                if (i % 20 == 0) {
                    cf.createEm().flush();
                    cf.createEm().clear();
                }
            }
            cf.createEm().getTransaction().commit();
            cf.close();
        } else {
            System.out.println("Tabela ja preenchida");
        }
    }

}

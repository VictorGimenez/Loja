/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exemplo.repositorio;

import com.exemplo.conexao.ConnectionFactory;
import com.exemplo.entity.Pedido;
import java.util.List;
import javax.persistence.Persistence;
import javax.persistence.Query;
import com.exemplo.controller.PedidoDAO;
import com.exemplo.controller.PedidoDAO;
import java.util.Date;
import javax.persistence.LockModeType;
import javax.persistence.TypedQuery;

/**
 *
 * @author Vickz
 */
public class MySQLPedidoDAO implements PedidoDAO {

    //null pointer exception pois esse campo estava inicializado como null
    public ConnectionFactory cf;

    
    public MySQLPedidoDAO(ConnectionFactory cf) {
        this.cf = cf;
    }

    
    @Override
    public void inserir(Pedido o) {
        cf.createEm().getTransaction().begin();
        //tanto persist quanto merge salvam o objeto no banco de dados 
        //em.persist(cliente);
        cf.createEm().merge(o);
        cf.createEm().getTransaction().commit();
    }

    @Override
    public void alterar(Pedido o) {
        cf.createEm().getTransaction().begin();
        Pedido pedido = new Pedido();
        pedido.getId();
        cf.createEm().merge(o);
        cf.createEm().getTransaction().commit();
        cf.close();
    }

    @Override
    public void excluir(Pedido o) {
        cf.createEm().getTransaction().begin();
        cf.createEm().remove(o);
        cf.createEm().getTransaction().commit();
        cf.close();
    }

    @Override
    public Pedido pesquisar(Long id) {
        cf.createEm().getTransaction().begin();
        //erro abaixo
        Pedido pedido = cf.createEm().find(Pedido.class, id);
        cf.createEm().getTransaction().commit();
        //erro ao deletar pois o factory já está fechado
        //emf.close();
        return pedido;
    }
    
    @Override
    public List<Pedido> listar() {
        cf = new ConnectionFactory();
        cf.createEm().getTransaction().begin();
        //pedido = *, Pedido = nome da tabela
        Query consulta = cf.createEm().createQuery("select pedido from Pedido pedido");
        List<Pedido> pedidos = consulta.getResultList();
        cf.createEm().getTransaction().commit();
        cf.close();
        return pedidos;
    }

    @Override
    public Pedido pesquisarPorData(Long id, Date dataCadastro) {
       TypedQuery<Pedido> query = cf.createEm().createQuery("id = :id and registerDate = :date", Pedido.class);
       query.setParameter("id", id);
       query.setParameter("date", dataCadastro);
       Pedido pedido = (Pedido) query.getResultList();
       return pedido;
    }

    public List<String> getNumControle(){
       cf = new ConnectionFactory();
       cf.createEm().getTransaction().begin();
       Query consulta = cf.createEm().createQuery("select numControle from Pedido p");
       List <String> pedidos = consulta.getResultList();
       cf.createEm().getTransaction().commit();
       cf.close();
       return pedidos;
    }
    
    @Override
    public Double retornaSoma(){
       cf.createEm().getTransaction().begin();
       Query q = cf.createEm().createQuery("select sum(valorTotal) from Pedido");
       Double soma = (Double) q.getSingleResult();
       cf.createEm().getTransaction().commit();
       return soma;
    }

    public Long getPedidos(){
       cf.createEm().getTransaction().begin();
       Query q = cf.createEm().createQuery("select count(*) from Pedido");
       Long cont = (Long) q.getSingleResult();
       cf.createEm().getTransaction().commit();
       return cont;
    }
    
    
}

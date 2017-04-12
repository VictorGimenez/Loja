/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exemplo.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Vickz
 */

@XmlRootElement(name="PedidoList")
@XmlAccessorType(XmlAccessType.FIELD)
public class PedidoList {
    
    @XmlElementWrapper(name="pedidos")
    @XmlElement(name="pedidos")
    private List<Pedido> pedidos = new ArrayList<>();

    public PedidoList() {
    }

    /**
     * @return the pedidos
     */
    public List<Pedido> getPedidos() {
        return pedidos;
    }

    /**
     * @param pedidos the pedidos to set
     */
    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + Objects.hashCode(this.pedidos);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PedidoList other = (PedidoList) obj;
        if (!Objects.equals(this.pedidos, other.pedidos)) {
            return false;
        }
        return true;
    }
    
    

    @Override
    public String toString() {
        return "PedidoList{" + "pedidos=" + pedidos + '}';
    }
    
    
    
}

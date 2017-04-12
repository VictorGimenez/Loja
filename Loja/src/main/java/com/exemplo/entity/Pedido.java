package com.exemplo.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "pedido")
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
@Table(name = "pedido")
public class Pedido implements Serializable {
    
    @XmlElement(name="id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @XmlElement(name="dataCadastro")
    @Column
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataCadastro;
    
    @XmlElement(name="nomeProduto")
    @Column
    private String nomeProduto;
    
    @XmlElement(name="numControle")
    @Column
    private int numControle;
    
    @XmlElement(name="quantidade")
    @Column
    private int quantidade;
    
    @XmlElement(name="valorUnitario")
    @Column(precision=15, scale=7)
    private float valorUnitario;
    
    @XmlElement(name="codCliente")
    @Column
    private Integer codCliente;
    
    @XmlElement(name="valorTotal")
    @Column(precision=15, scale=7)
    private float valorTotal;
    
    @XmlElement(name="total")
    @Column(precision=2, scale=2)
    private Double total;

    
    public Pedido() {
    }
    
    
    public Pedido(int numControle, Date dataCadastro, String nomeProduto, float valorUnitario, float valorTotal, int quantidade, int codCliente, Double total){
        this.numControle = numControle;
        this.dataCadastro = dataCadastro;
        this.nomeProduto = nomeProduto;
        this.valorUnitario = valorUnitario;
        this.valorTotal = valorTotal;
        this.quantidade = quantidade;
        this.codCliente = codCliente;
        this.total = total;
    }

    
    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the numControle
     */
    public int getNumControle() {
        return numControle;
    }

    /**
     * @param numControle the numControle to set
     */
    public void setNumControle(int numControle) {
        this.numControle = numControle;
    }

    /**
     * @return the dataCadastro
     */
    public Date getDataCadastro() {
        return dataCadastro;
    }

    /**
     * @param dataCadastro the dataCadastro to set
     */
    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    /**
     * @return the nomeProduto
     */
    public String getNomeProduto() {
        return nomeProduto;
    }

    /**
     * @param nomeProduto the nomeProduto to set
     */
    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    /**
     * @return the valor
     */
    public float getValorUnitario() {
        return valorUnitario;
    }

    /**
     * @param valorUnitario
     */
    public void setValorUnitario(float valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    /**
     * @return the quantidade
     */
    public int getQuantidade() {
        return quantidade;
    }

    /**
     * @param quantidade the quantidade to set
     */
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
   
    /**
     * @return the valorTotal
     */
    public float getValorTotal() {
        return valorTotal;
    }

    /**
     * @param valorTotal the valorTotal to set
     */
    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    /**
     * @return the codCliente
     */
    public Integer getCodCliente() {
        return codCliente;
    }

    /**
     * @param codCliente the codCliente to set
     */
    public void setCodCliente(Integer codCliente) {
        this.codCliente = codCliente;
    }
    
    
    
    @Override
    public String toString() {
        return "Pedido \n" + "\nid=" + id + "\n dataCadastro=" + dataCadastro + "\n nomeProduto=" + nomeProduto + "\n numControle=" + numControle + "\n quantidade=" + quantidade + "\n valorUnitario=" + valorUnitario + "\n codCliente=" + codCliente + "\n valorTotal=" + valorTotal + "\n total=" + getTotal() + '\n';
    }

    /**
     * @return the total
     */
    public Double getTotal() {
        return total;
    }


    public void setTotal(Double total) {
        this.total = total;
    }

    
         
    
}

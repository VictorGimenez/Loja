/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exemplo.view;

import com.exemplo.conexao.ConnectionFactory;
import com.exemplo.exception.DAOException;
import com.exemplo.dao.DAOManager;
import com.exemplo.file.FiltroArquivo;
import com.exemplo.entity.Cliente;
import com.exemplo.entity.Pedido;
import com.exemplo.repositorio.MySQLPedidoDAO;
import com.exemplo.repositorio.MySQLClienteDAO;
import com.exemplo.model.PedidoModel;
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author Vickz
 */
public class ViewPedidos extends javax.swing.JInternalFrame {

    private DAOManager manager;
    private PedidoModel model;
    private MySQLPedidoDAO mspdao;
    private Pedido ped;
    private String xmlFile = "";
    private boolean editavel;

    /**
     * @return the ped
     */
    public Pedido getPed() {
        return ped;
    }

    /**
     * @param ped the ped to set
     */
    public void setPed(Pedido ped) {
        this.ped = ped;
    }

    /**
     * @return the editavel
     */
    public boolean isEditavel() {
        return editavel;
    }

    public ViewPedidos(DAOManager manager) throws DAOException {
        initComponents();
        atualizarTabela(manager);
        habilitarTextFieldEBotoes();
        List<Cliente> clientes = new ArrayList<Cliente>();
        clientes = manager.getClienteDAO().listar();
        cbCodCliente.setModel(new DefaultComboBoxModel(clientes.toArray()));
        desabilitarTextFieldEBotoes();
    }

    public MySQLPedidoDAO getMspdao() {
        return mspdao;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        entityManager0 = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("victor").createEntityManager();
        clienteQuery = java.beans.Beans.isDesignTime() ? null : entityManager0.createQuery("SELECT c FROM Cliente c");
        clienteList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : clienteQuery.getResultList();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfValor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        spQuantidade = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cbCodCliente = new javax.swing.JComboBox<>();
        tfProduto = new javax.swing.JTextField();
        tfNumControle = new javax.swing.JTextField();
        tfDataCad = new javax.swing.JFormattedTextField();
        tfPedido = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        btProcurar = new javax.swing.JButton();
        btImportar = new javax.swing.JButton();
        btInserir = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        tfTotal = new javax.swing.JFormattedTextField();

        setClosable(true);
        setTitle("Cadastro de Pedidos");

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setText("Pedido OS:");

        jLabel2.setText("Nome do Produto:");

        jLabel3.setText("Valor Unitario:");

        jLabel4.setText("Quantidade:");

        jLabel5.setText("Código Cliente: ");

        jLabel9.setText("Data de Cadastro:");

        jLabel10.setText("Número de Controle:");

        org.jdesktop.swingbinding.JComboBoxBinding jComboBoxBinding = org.jdesktop.swingbinding.SwingBindings.createJComboBoxBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, clienteList, cbCodCliente);
        bindingGroup.addBinding(jComboBoxBinding);

        tfDataCad.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));

        tfPedido.setEditable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfNumControle))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tfProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(40, 40, 40)
                                        .addComponent(jLabel3))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addGap(48, 48, 48)
                                        .addComponent(jLabel4)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(spQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfValor, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(tfDataCad)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbCodCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(tfDataCad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(tfPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(tfValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tfProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel4)
                    .addComponent(spQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNumControle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbCodCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(113, 113, 113))
        );

        table.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table);

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btProcurar.setText("Abrir XML");
        btProcurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btProcurarActionPerformed(evt);
            }
        });

        btImportar.setText("Importar XML");
        btImportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btImportarActionPerformed(evt);
            }
        });

        btInserir.setText("Submeter Campos");
        btInserir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btInserirMouseEntered(evt);
            }
        });
        btInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInserirActionPerformed(evt);
            }
        });

        btExcluir.setText("Excluir Pedido");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(btProcurar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btImportar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btInserir)
                .addGap(18, 18, 18)
                .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btProcurar)
                    .addComponent(btImportar)
                    .addComponent(btInserir)
                    .addComponent(btExcluir)
                    .addComponent(btCancelar))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel6.setText("Valor Total do Pedido:");

        tfTotal.setEditable(false);
        tfTotal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getCurrencyInstance())));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tfTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        int index = table.getSelectedRow();
        PedidoModel pm = (PedidoModel) table.getModel();
        habilitarRemoverESubmeter();

        String id = pm.getValueAt(index, 0).toString();
        String dataCadastro = pm.getValueAt(index, 1).toString();
        String nomeProduto = pm.getValueAt(index, 2).toString();
        String numControle = pm.getValueAt(index, 3).toString();
        String quantidade = pm.getValueAt(index, 4).toString();
        String valorUnitario = pm.getValueAt(index, 5).toString();
        String codCliente = pm.getValueAt(index, 6).toString();

        Object q = Integer.parseInt(quantidade);

        if (pm.getValueAt(index, 0) == null) {
            tfPedido.setText("");
        } else if (pm.getValueAt(index, 1) == null) {
            tfDataCad.setText("");
        } else if (pm.getValueAt(index, 3) == null) {
            tfNumControle.setText("");
        } else if (pm.getValueAt(index, 4) == null) {
            spQuantidade.setValue(0);
        } else if (pm.getValueAt(index, 5) == null) {
            tfValor.setText("");
        } else {
            tfPedido.setText(id);
            tfDataCad.setText(dataCadastro);
            tfProduto.setText(nomeProduto);
            tfNumControle.setText(numControle);
            spQuantidade.setValue(q);
            tfValor.setText(valorUnitario);
            cbCodCliente.setSelectedItem(codCliente);
        }
    }//GEN-LAST:event_tableMouseClicked

    private void btProcurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btProcurarActionPerformed
        try {
            JFileChooser jFileChooser = new JFileChooser("C:\\Users\\Vickz\\Desktop\\Loja\\formularioPedido\\pedido.xml");
            jFileChooser.setDialogTitle("Abrir xml");
            jFileChooser.setFileFilter(new FiltroArquivo(".xml", "Arquivo XML"));
            int result = jFileChooser.showSaveDialog(this);
            if (result == JFileChooser.APPROVE_OPTION) {
                xmlFile = jFileChooser.getSelectedFile().getAbsolutePath();
            }
            botoesAtivados();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Não foi possível abrir o arquivo", "Falha ao carregar", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btProcurarActionPerformed

    private void btImportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btImportarActionPerformed
        try {
            habilitarTextFieldEBotoes();
            JAXBContext context = JAXBContext.newInstance(Pedido.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            Pedido pedido = (Pedido) unmarshaller.unmarshal(new File(xmlFile));
            DateFormat df = new SimpleDateFormat("dd/MM/yyyy");

            Date dataCadastro = pedido.getDataCadastro();
            String s = df.format(dataCadastro);
            String nomeProduto = pedido.getNomeProduto();
            int numControle = pedido.getNumControle();
            int quantidade = pedido.getQuantidade();
            float valorUnitario = pedido.getValorUnitario();

            tfNumControle.setText(String.valueOf(numControle));
            spQuantidade.setValue(quantidade);
            tfValor.setText(String.valueOf(valorUnitario));
            tfDataCad.setText(String.valueOf(s));
            tfProduto.setText(String.valueOf(nomeProduto));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Não foi possível importar o arquivo", "Falha ao importar", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btImportarActionPerformed

    private void btInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInserirActionPerformed
        ConnectionFactory cf = new ConnectionFactory();
        MySQLPedidoDAO mspdao = new MySQLPedidoDAO(cf);
        Pedido ped = new Pedido();
        Long cont = mspdao.getPedidos();
        Long limite = 10L;

        if (tfDataCad.getText().length() == 0 && tfNumControle.getText().length() == 0 && tfValor.getText().length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Favor Preencher Os Campos", "Inserção Não Efetuada", JOptionPane.INFORMATION_MESSAGE);
        } else if (ped.getId() == null) {
            if (Objects.equals(cont, limite)) {
                JOptionPane.showMessageDialog(rootPane, "Limite de registros excedido", "Cadastro de Pedidos", JOptionPane.INFORMATION_MESSAGE);
                limparCampos();
            } else {
                try {
                    inserirDados(ped);
                    mspdao.inserir(ped);
                    JOptionPane.showMessageDialog(rootPane, "Pedido Cadastrado com Sucesso", "Cadastro de Pedidos", JOptionPane.INFORMATION_MESSAGE);
                    btImportarActionPerformed(evt);
                    desabilitarTextFieldEBotoes();
                    atualizarTabela(manager);
                    limparCampos();
                } catch (DAOException ex) {
                    Logger.getLogger(ViewPedidos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_btInserirActionPerformed

    private void btInserirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btInserirMouseEntered
        ConnectionFactory cf = new ConnectionFactory();
        mspdao = new MySQLPedidoDAO(cf);
        List<String> pedido = mspdao.getNumControle();

        for (int i = 0; i < pedido.size(); i++) {
            String valor = String.valueOf(pedido.get(i));
            if (valor.equals(tfNumControle.getText().trim())) {
                JOptionPane.showMessageDialog(rootPane, "Numero de Controle já cadastrado", "Consultar Pedidos", JOptionPane.INFORMATION_MESSAGE);
                tfNumControle.requestFocus();
            }
        }
    }//GEN-LAST:event_btInserirMouseEntered

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        limparCampos();
        desabilitarTextFieldEBotoes();
    }//GEN-LAST:event_btCancelarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        ConnectionFactory cf = new ConnectionFactory();
        MySQLPedidoDAO mspdao = new MySQLPedidoDAO(cf);
        Pedido ped = null;

        if (JOptionPane.showConfirmDialog(rootPane, "Tem certeza que deseja excluir?", "Excluir", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
            if (tfPedido.getText().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Campo vazio, é necessário fazer a pesquisa", "Excluir", JOptionPane.INFORMATION_MESSAGE);
            } else {
                try {
                    ped = mspdao.pesquisar(Long.parseLong(tfPedido.getText()));
                    mspdao.excluir(ped);
                    JOptionPane.showMessageDialog(rootPane, "Pedido excluido com sucesso", "Excluir", JOptionPane.INFORMATION_MESSAGE);
                    atualizarTabela(manager);
                    limparCampos();
                } catch (DAOException ex) {
                    Logger.getLogger(ViewPedidos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_btExcluirActionPerformed

    public void atualizarTabela(DAOManager manager) throws DAOException {
        ConnectionFactory cf = new ConnectionFactory();
        MySQLPedidoDAO mspdao = new MySQLPedidoDAO(cf);
        Long ped = mspdao.gerarProximaId();
        tfPedido.setText(String.valueOf(ped));
        Double soma = mspdao.retornaSoma();
        tfTotal.setText(String.valueOf(soma));
        isFormularioInicializado();
        this.manager = manager;
        this.model = new PedidoModel(manager.getPedidoDAO());
        this.model.atualizarModel();
        this.table.setModel(model);
    }

    public void inserirDados(Pedido ped) {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        ConnectionFactory cf = new ConnectionFactory();
        mspdao = new MySQLPedidoDAO(cf);
        System.out.println(dateFormat.format(date));

        if (tfDataCad.getText().length() == 0) {
            ped.setDataCadastro(date);
        } else {
            //linha que está dando erro
            ped.setDataCadastro(new java.sql.Date(((java.util.Date) tfDataCad.getValue()).getTime()));
        }

        ped.setNomeProduto(tfProduto.getText());

        ped.setValorUnitario(Float.parseFloat(tfValor.getText()));

        ped.setNumControle(Integer.parseInt(tfNumControle.getText()));

        if (spQuantidade.getValue().equals(0)) {
            ped.setQuantidade(1);
        } else {
            ped.setQuantidade((int) spQuantidade.getValue());
        }

        // Descontos
        int quantidade = ped.getQuantidade();
        float valorUnitario = ped.getValorUnitario();
        float valorTotal = quantidade * valorUnitario;
        float valorComDesconto = (float) (valorTotal * 0.95);
        float valorComDesconto1 = (float) (valorTotal * 0.9);

        if (((Number) spQuantidade.getValue()).intValue() > 5 && ((Number) spQuantidade.getValue()).intValue() < 10) {
            ped.setValorTotal(valorComDesconto);
        } else if (((Number) spQuantidade.getValue()).intValue() > 10) {
            ped.setValorTotal(valorComDesconto1);
        } else {
            ped.setValorTotal(valorTotal);
        }
        Integer cb = Integer.parseInt(cbCodCliente.getSelectedItem().toString());
        ped.setCodCliente(cb);

        Double soma = mspdao.retornaSoma();
        ped.setTotal(soma);

    }

    public void limparCampos() {
        tfProduto.setText("");
        tfDataCad.setText("");
        tfNumControle.setText("");
        tfPedido.setText("");
        tfValor.setText("");
    }

    public void desabilitarBotoes() {
        btInserir.setEnabled(false);
        btExcluir.setEnabled(false);
        btCancelar.setEnabled(false);
    }

    public void habilitarRemoverESubmeter() {
        btCancelar.setEnabled(true);
        btExcluir.setEnabled(true);
        btImportar.setEnabled(true);
        btInserir.setEnabled(false);
        btProcurar.setEnabled(true);
    }

    public void desabilitarTextFieldEBotoes() {
        tfDataCad.setEnabled(false);
        spQuantidade.setEnabled(false);
        tfProduto.setEnabled(false);
        cbCodCliente.setEnabled(false);
        cbCodCliente.setSelectedItem("");
        tfNumControle.setEnabled(false);
        tfPedido.setEnabled(false);
        tfValor.setEnabled(false);
        btInserir.setEnabled(false);
        btExcluir.setEnabled(false);
        btCancelar.setEnabled(true);
    }

    public void habilitarTextFieldEBotoes() {
        tfDataCad.setEnabled(true);
        spQuantidade.setEnabled(true);
        spQuantidade.getValue();
        tfProduto.setEnabled(true);
        tfNumControle.setEnabled(true);
        tfPedido.setEnabled(true);
        cbCodCliente.setEnabled(true);
        cbCodCliente.getSelectedItem();
        tfPedido.setEditable(false);
        tfValor.setEnabled(true);
        btInserir.setEnabled(true);
        tfDataCad.requestFocus();
    }

    public void setEditable(boolean editavel) {
        this.editavel = editavel;
        tfPedido.setEditable(false);
        tfDataCad.setEnabled(editavel);
        tfProduto.setEditable(editavel);
        tfNumControle.setEditable(editavel);
        tfValor.setEditable(editavel);
    }

    public void habilitarApenasOSeData() {
        tfPedido.setEnabled(true);
        tfDataCad.setEnabled(true);
        tfProduto.setEnabled(false);
        tfNumControle.setEnabled(false);
        tfValor.setEnabled(false);
        spQuantidade.setEnabled(false);
    }

    private void botoesAtivados() {
        btCancelar.setEnabled(true);
    }

    private void isFormularioInicializado() throws DAOException {
        ConnectionFactory cf = new ConnectionFactory();
        MySQLClienteDAO mscdao = new MySQLClienteDAO(cf);
        Cliente cli = new Cliente();
        cli.setCodCliente(1);
        cli.setCodCliente(2);
        cli.setCodCliente(3);
        cli.setCodCliente(4);
        cli.setCodCliente(5);
        cli.setCodCliente(6);
        cli.setCodCliente(7);
        cli.setCodCliente(8);
        cli.setCodCliente(9);
        cli.setCodCliente(10);
        mscdao.inserirLista(cli);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btImportar;
    private javax.swing.JButton btInserir;
    private javax.swing.JButton btProcurar;
    private javax.swing.JComboBox<String> cbCodCliente;
    private java.util.List<com.exemplo.entity.Cliente> clienteList;
    private javax.persistence.Query clienteQuery;
    private javax.persistence.EntityManager entityManager0;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner spQuantidade;
    private javax.swing.JTable table;
    private javax.swing.JFormattedTextField tfDataCad;
    private javax.swing.JTextField tfNumControle;
    private javax.swing.JTextField tfPedido;
    private javax.swing.JTextField tfProduto;
    private javax.swing.JFormattedTextField tfTotal;
    private javax.swing.JTextField tfValor;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

}

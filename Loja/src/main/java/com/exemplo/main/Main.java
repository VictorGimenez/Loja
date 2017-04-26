/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exemplo.main;

import com.exemplo.conexao.ConnectionFactory;
import com.exemplo.entity.Cliente;
import com.exemplo.entity.Pedido;
import com.exemplo.file.FiltroArquivo;
import com.exemplo.repositorio.MySQLClienteDAO;
import com.exemplo.repositorio.MySQLPedidoDAO;
import com.exemplo.view.ViewMenu;
import java.text.ParseException;
import javax.xml.bind.JAXBException;

/**
 *
 * @author Vickz
 */
public class Main {

    public static void main(String[] args) throws JAXBException, ParseException {

         ViewMenu vm = new ViewMenu();
         vm.setVisible(true);
         
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exemplo.file;

import java.io.File;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author Vickz
 */
public class FiltroArquivo extends FileFilter{

    private final String extensao;
    private final String descricao;

    
    public FiltroArquivo(String extensao, String descricao) {
        this.extensao = extensao;
        this.descricao = descricao;
    }
    

    @Override
    public boolean accept(File file) {
        if(file.isDirectory()){
            return true;
        }
        return file.getName().endsWith(extensao);
    }

    @Override
    public String getDescription() {
        return descricao + String.format(" (*%s) ", extensao);
    }
    
}

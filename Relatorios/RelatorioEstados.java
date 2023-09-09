/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Relatorios;

import java.sql.ResultSet;
import java.util.HashMap;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author alexa
 */


public class RelatorioEstados {
    
    public static void gerarRelatorio(String caminho, ResultSet rs){
    try{
         //recebe um resultSet vindo do banco de dados
        JRResultSetDataSource jrRS=
                new JRResultSetDataSource(rs);
        
        //imprime o relatório
        JasperPrint jasperPrint =
                JasperFillManager.fillReport(caminho, new HashMap(), jrRS);
        //componente para visualizar o relatório
        
        JasperViewer.viewReport(jasperPrint, false);
        
    
    }catch (Exception erro){
         erro.printStackTrace();
         JOptionPane.showMessageDialog(null, "Relatório não foi gerado");
    }
    
    }
    
    
}
    


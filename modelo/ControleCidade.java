
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package modelo;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import utilitarios.conectarbanco;

/**
 *
 * @author alexa
 */
        /*
public class ControleCidade {
   conectarbanco connCidade = new conectarbanco();
    
    public void InserirCidade(modeloCidades mod) {
       
        try{
            connCidade.getConexao();
            PreparedStatement pst = connCidade.getConexao().prepareStatement("insert into cidade(nome_cidade)values(?)");
            pst.setString(1,mod.getNome());
           // pst.setInt(2, mod.getCod_estado());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Dados armazenados com sucesso!");
        }catch (SQLException ex){
                JOptionPane.showMessageDialog(null, "Erro na inserção de Dados! \n Erro: "+ ex);
            }
        }
        
    }

*/
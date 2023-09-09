/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package utilitarios;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLDataException;
import java.sql.SQLException;
import java.sql.ResultSet;


public class conectarbanco {
    
   public Statement stm;
   public Connection conn;
    public ResultSet rs;
   
        
    public static java.sql.Connection getConexao() throws SQLException{
        conectarbanco connecta = new conectarbanco();
       try{
        //definição do driver de conexão
        Class.forName("com.mysql.cj.jdbc.Driver");
        //definição dos  parametros de conexão
         return DriverManager.getConnection("jdbc:mysql://localhost/controle_estoque?useTimezone=true&serverTimezone=UTC", "root", "conputador321");
    }catch (ClassNotFoundException e){
        throw new SQLDataException(e.getMessage()); 
      }
    }

   
    /*
    public conectarbanco() throws SQLException {
       String string = null;
       this.stm = (Statement) rs;
        this.rs = stm.executeQuery(string);
       
    }
*/
    
    
    public void executaSQL(String sql) throws SQLException{
        try{
            stm = getConexao().createStatement(rs.TYPE_SCROLL_INSENSITIVE,rs.CONCUR_READ_ONLY);
            rs = stm.executeQuery(sql);       
        }catch (SQLException ex){
            
        }
     
      
    }
    
    
       public static void main(String[] args) {
        try{
           getConexao();
           System.out.println("Conexão realizada com sucesso.");
        }catch (SQLException e){
            System.out.println("Conexão não realizada, verificar log.");
            e.printStackTrace();
        }    
    }

    public PreparedStatement PreparedStatement(String sql) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

    
       
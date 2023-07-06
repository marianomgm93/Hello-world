package Tienda.Persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class DAO {
    protected Connection con=null;
    protected ResultSet resultado=null;
    protected Statement stmnt=null;
    
    private final String USER="root";
    private final String PASSWORD="root";
    private final String DATABASE="tienda";
    private final String DRIVER="com.mysql.cj.jdbc.Driver";
    
    protected void connect() throws ClassNotFoundException, SQLException{
        try {
            Class.forName(DRIVER);
            String URLDB="jdbc:mysql://localhost:3306/"+DATABASE+"?zeroDateTimeBehavior=CONVERT_TO_NULL";
            con=DriverManager.getConnection(URLDB,USER,PASSWORD);
        } catch (ClassNotFoundException | SQLException e ) {
            System.out.println("NO SE PUDO CONECTAR A LA BASE DE DATOS");
            throw e;
        }
        
    }
    
    protected void disconnect() throws Exception{
        try {
            if (resultado!=null) {
                resultado.close();
            }
            if (stmnt!=null) {
                stmnt.close();
            }
            if(con!=null){
                con.close();
            }
        } catch (Exception e) {
            throw e;
        }
    }
    
    protected void insModDel(String sql) throws ClassNotFoundException, SQLException, Exception{
        try {
            connect();
            stmnt=con.createStatement();
            stmnt.execute(sql);
            
        } catch (ClassNotFoundException | SQLException e) {
            throw e;
        }
        finally{
            disconnect();
        }
    }
    protected void consultar(String sql) throws Exception{
        try {
            connect();
            stmnt=con.createStatement();
            resultado=stmnt.executeQuery(sql);
            
        } catch (Exception e) {
            throw e;
        }
    }
}

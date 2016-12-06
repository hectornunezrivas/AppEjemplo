package Control;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Hector
 */
public class DbConnection {
    public Connection connect = null;
    public String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    public String ruta = "jdbc:sqlserver://HNR:1433;databasename=dbCarsMaintenance;user=hnr;password=chivas";
    
    public boolean connectDb(){
        try{
            Class.forName(driver);
            connect = DriverManager.getConnection(ruta);
            return true;
        } catch(Exception ex) {
            System.out.println("Error: En conexion a la base de datos " + ex.getMessage());
        }
        return false;
    }
}

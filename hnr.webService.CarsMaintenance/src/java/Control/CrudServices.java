package Control;

import Data.GsServices;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Hector
 */
public class CrudServices extends DbConnection{
    CallableStatement ins = null;
    CallableStatement sel = null;

    public boolean Insert(GsServices service) {
        try {
            if (connectDb()) {
                ins = connect.prepareCall("spInsertService ?, ?, ?, ?");
                ins.setInt(1, service.getIntKilometers());
                ins.setString(2, service.getStrService());
                ins.setDouble(3, service.getDblCost());
                ins.setInt(4, service.getIntVehicleId());

                ins.execute();
                ins.close();

                return true;
            }
        } catch (Exception ex) {
            service.setMensaje("Error: Sintaxis ctrlLogin para insertar " + ex.getStackTrace());
        }
        return false;
    }

    private Connection conn;
    String cadena;
    
    public boolean SelectByUser(GsServices service) {  
        if (connectDb()) {
            String query = "{call spSelectCosts(?)}";
            ResultSet rs;
            
            try {
                CallableStatement st = connect.prepareCall(query);
//                st.setString(1, email);
//                st.setString(2, password);
                st.execute();
                rs = st.getResultSet();

                while (rs.next()) {
//                    email = rs.getString(1).toString();
//                    password = rs.getString(2).toString();
                    
                    return true;
                }

            } catch (SQLException ex) {
                service.setMensaje("Error: Sintaxis ctrlPersona para consultar" + ex);
                return false;
            }
        }
        return false;
    }
}

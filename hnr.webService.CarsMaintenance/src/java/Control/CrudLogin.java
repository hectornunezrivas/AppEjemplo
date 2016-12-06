package Control;

import Data.GsLogin;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Hector
 */
public class CrudLogin extends DbConnection{
    CallableStatement ins = null;
    CallableStatement sel = null;

    public boolean Insert(GsLogin login) {
        try {
            if (connectDb()) {
                ins = connect.prepareCall("spInsertLogin ?, ?, ?, ?");
                ins.setString(1, login.getStrName());
                ins.setString(2, login.getStrLastname());
                ins.setString(3, login.getStrEmail());
                ins.setString(4, login.getStrPassword());

                ins.execute();
                ins.close();

                return true;
            }
        } catch (Exception ex) {
            login.setMensaje("Error: Sintaxis ctrlLogin para insertar " + ex.getStackTrace());
        }
        return false;
    }

    private Connection conn;
    String cadena;
    
    public boolean SelectByUser(GsLogin login) {  
        if (connectDb()) {
            String query = "{call spSelectLogin(?, ?)}";
            ResultSet rs;

            String email = login.getStrEmail();
            String password = login.getStrPassword();
            
            try {
                CallableStatement st = connect.prepareCall(query);
                st.setString(1, email);
                st.setString(2, password);
                st.execute();
                rs = st.getResultSet();

                while (rs.next()) {
                    email = rs.getString(1).toString();
                    password = rs.getString(2).toString();
                    
                    return true;
                }

            } catch (SQLException ex) {
                login.setMensaje("Error: Sintaxis ctrlPersona para consultar" + ex);
                return false;
            }
        }
        return false;
    }
    
    public boolean SelectByEmail(GsLogin login) {  
        if (connectDb()) {
            String query = "{call spSelectEmailLogin(?)}";
            ResultSet rs;

            String email = login.getStrEmail();
            
            try {
                CallableStatement st = connect.prepareCall(query);
                st.setString(1, email);
                st.execute();
                rs = st.getResultSet();

                while (rs.next()) {
                    email = rs.getString(1).toString();
                    return true;
                }

            } catch (SQLException ex) {
                login.setMensaje("Error: Sintaxis ctrlPersona para consultar" + ex);
                return false;
            }
        }
        return false;
    }
}

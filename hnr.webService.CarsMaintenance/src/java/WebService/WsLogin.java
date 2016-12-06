package WebService;
import Control.CtrlLogin;
import Data.GsLogin;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Hector
 */
@WebService(serviceName = "WsLogin")
public class WsLogin {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "wsInsert")
    public String wsInsert(@WebParam(name = "name") String name, @WebParam(name = "lastname") String lastname, @WebParam(name = "email") String email, @WebParam(name = "password") String password) {
        GsLogin login = new GsLogin();
        CtrlLogin ctrl = new CtrlLogin();

        try {
            login.setStrName(name);
            login.setStrLastname(lastname);
            login.setStrEmail(email);
            login.setStrPassword(password);
        } catch (Exception ex) {
            login.setMensaje("Error: WebService Login insertar " + ex.getMessage());
        }

        return ctrl.ctrlInsert(login);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "wsSelect")
    public boolean wsSelect(@WebParam(name = "email") String email, @WebParam(name = "password") String password) {
        GsLogin login = new GsLogin();
        CtrlLogin ctrl = new CtrlLogin();

        try {
            login.setStrEmail(email);
            login.setStrPassword(password);
        } catch (Exception ex) {
            login.setMensaje("Error: WebService Login insertar " + ex.getMessage());
        }

        return ctrl.ctrlSelect(login);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "wsSelectEmail")
    public boolean wsSelectEmail(@WebParam(name = "email") String email) {
        GsLogin login = new GsLogin();
        CtrlLogin ctrl = new CtrlLogin();

        try {
            login.setStrEmail(email);
        } catch (Exception ex) {
            login.setMensaje("Error: WebService Login insertar " + ex.getMessage());
        }

        return ctrl.CtrlSelectEmail(login);
    }
    
}

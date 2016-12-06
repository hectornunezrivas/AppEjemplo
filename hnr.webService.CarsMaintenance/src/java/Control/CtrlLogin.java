package Control;

import Data.GsLogin;

/**
 *
 * @author Hector
 */
public class CtrlLogin extends CrudLogin{
     
    public String ctrlInsert(GsLogin login) {
        if(Insert(login)){
            login.setMensaje("Registro Satisfactorio!");
        } else {
            login.setMensaje("Registro NO Satisfactorio!");
        }
        return login.getMensaje();
    }
    
    public boolean ctrlSelect(GsLogin login) {
        return SelectByUser(login);
    }
    
    public boolean CtrlSelectEmail(GsLogin login) {
        return SelectByEmail(login);
    }
}


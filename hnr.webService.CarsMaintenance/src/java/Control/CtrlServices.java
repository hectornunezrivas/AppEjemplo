package Control;

import Data.GsServices;

/**
 *
 * @author Hector
 */
public class CtrlServices extends CrudServices{
     
    public String ctrlInsert(GsServices service) {
        if(Insert(service)){
            service.setMensaje("Registro Satisfactorio!");
        } else {
            service.setMensaje("Registro NO Satisfactorio!");
        }
        return service.getMensaje();
    }
    
    public boolean ctrlSelect(GsServices service) {
        return SelectServices(service);
    }

    private boolean SelectServices(GsServices service) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

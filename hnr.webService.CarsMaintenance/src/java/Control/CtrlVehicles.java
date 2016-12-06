package Control;

import Data.GsVehicles;

/**
 *
 * @author Hector
 */
public class CtrlVehicles extends CrudVehicles {
     
    public String ctrlInsert(GsVehicles vehicle) {
        if(Insert(vehicle)){
            vehicle.setMensaje("Registro Satisfactorio!");
        } else {
            vehicle.setMensaje("Registro NO Satisfactorio!");
        }
        return vehicle.getMensaje();
    }
    
    public boolean ctrlSelect(GsVehicles vehicle) {
        return SelectVehicle(vehicle);
    }

    private boolean Insert(GsVehicles vehicle) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private boolean SelectVehicle(GsVehicles vehicle) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WebService;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Hector
 */
@WebService(serviceName = "WsServices")
public class WsServices {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Insert")
    public String Insert(@WebParam(name = "km") String km, @WebParam(name = "servicio") String servicio, @WebParam(name = "costo") String costo, @WebParam(name = "vehiculo") String vehiculo) {
        //TODO write your implementation code here:
        return null;
    }
}

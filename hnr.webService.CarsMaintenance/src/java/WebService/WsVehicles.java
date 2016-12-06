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
@WebService(serviceName = "WsVehicles")
public class WsVehicles {

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
    public String Insert(@WebParam(name = "marca") String marca, @WebParam(name = "modelo") String modelo, @WebParam(name = "anio") String anio, @WebParam(name = "placas") String placas) {
        //TODO write your implementation code here:
        return null;
    }
}

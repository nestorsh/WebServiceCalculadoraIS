/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack1;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

/**
 *
 * @author entrar
 */
@WebService(serviceName = "Calculadora")
@Stateless()
public class Calculadora {

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
    @WebMethod(operationName = "add")
    public int add(@WebParam(name = "n1") int n1, @WebParam(name = "n2") int n2) {
        int total=n1+n2;
        return total;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "subtraction")
    public int subtraction(@WebParam(name = "n1") int n1, @WebParam(name = "n2") int n2) {
        int total=n1-n2;
        return total;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "multiplication")
    public int multiplication(@WebParam(name = "n1") int n1, @WebParam(name = "n2") int n2) {
        int total=n1*n2;
        return total;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "division")
    public int division(@WebParam(name = "n1") int n1, @WebParam(name = "n2") int n2) {
        int total=n1/n2;
        return total;
    }
}

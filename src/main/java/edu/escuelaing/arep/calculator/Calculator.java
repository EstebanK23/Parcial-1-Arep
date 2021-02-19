package edu.escuelaing.arep.calculator;

import com.google.gson.Gson;
/**
 *
 * @author esteb
 */
public class Calculator {

    public Calculator(){}

    public static String Conver(Double number){
        Gson archivo = new Gson();
        String result = "{\"result\":"+number+"}";
        return archivo.toJson(result);
    }
    
    public static String Trigonometricas(Double number, String funcion){
        Double result =0.0;
        if (funcion.equals("tan")){
            result = Math.tan(number);
        }
        if (funcion.equals("cos")){
            result = Math.cos(number);
        }
        if (funcion.equals("sin")){
            result = Math.sin(number);
        }
        return Conver(result);
    }

}

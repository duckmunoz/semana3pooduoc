package util;

/**
 * Excepción personalizada para Rut Inválidos
 */

public class RutInvalidoException  extends Exception{

    public RutInvalidoException(String message){
        super(message);
    }
}

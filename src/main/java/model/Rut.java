package model;

/**
 * Representa un RUT chileno. Contiene validación simple.
 */

import util.RutInvalidoException;

public class Rut {

    //Numero del RUT en formato String
    private String numero;

    /**
     * Constructor que recibe el RUT y valida su formato.
     * @param numeroRUT el RUT ingresado.
     */

    public Rut(String numeroRUT) throws RutInvalidoException {
        if (!numeroRUT.matches("[0-9]+-[0-9kK]")) {
            throw new RutInvalidoException("Formato de Rut incorrecto");
        }
        this.numero = numeroRUT;
    }

    /**
     * Retorna el número de RUT
     */

    public String getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return numero;
    }
}

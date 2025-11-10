package model;

import util.RutInvalidoException;

public class Rut {
    private String numero;

    public Rut(String numeroRUT) throws RutInvalidoException {
        if (!numeroRUT.matches("[0-9]+-[0-9kK]")) {
            throw new RutInvalidoException("Formato de Rut incorrecto");
        }
        this.numero = numeroRUT;
    }

    public String getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return numero;
    }
}

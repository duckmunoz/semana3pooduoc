package model;

/**
 * Representacion de una persona.
 */

public class Persona {

    private String nombre;

    private String apellido;

    private Rut rut;

    private Direccion direccion;

    /**
     * Constructor de la persona.
     * @param nombre
     * @param apellido
     * @param rut
     * @param direccion
     */

    public Persona(
            String nombre,
            String apellido,
            Rut rut,
            Direccion direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.rut = rut;
        this.direccion = direccion;
    }

    /**
     * Muestra los datos de la persona.
     */

    public void mostrarDatos(){
        System.out.println(this.nombre);
        System.out.println(this.apellido);
        System.out.println(this.rut);
        System.out.println(this.direccion);
    }

    /**
     * Asigna un rut a la persona.
     * @param rut
     */

    public void asignarRut(Rut rut){
    this.rut = rut;
}
    @Override
    public String toString() {
        return "[" +
                "Nombre='" + nombre + '\'' +
                ", Apellido='" + apellido + '\'' +
                ", Rut= " + rut +
                ", " + direccion +
                ']';
    }


}

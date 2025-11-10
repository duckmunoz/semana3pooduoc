package model;

/**
 * Representacion de la direccion de una persona.
 */

public class Direccion {

    private String calle;

    private String comuna;

    private String region;

    /**
     * Constructor de la direccion.
     * @param calle
     * @param comuna
     * @param region
     */

    public Direccion(
            String calle,
            String comuna,
            String region) {
            this.calle = calle;
            this.comuna = comuna;
            this.region = region;
    }

    /**
     * Getters y setters de la direccion.
     */

    public String getCalle() {
        return calle;
    }
    public String getComuna() {
        return comuna;
    }
    public String getRegion() {
        return region;
    }
    public void setCalle(String calle) {
        this.calle = calle;
    }
    public void setComuna(String comuna) {
        this.comuna = comuna;
    }
    public void setRegion(String region) {
        this.region = region;
    }
    public void mostrarDatos(){
        System.out.println(this.calle);
        System.out.println(this.comuna);
        System.out.println(this.region);
        System.out.println();
    }


    /**
     * Permite imprimir la direccion en formato String.
     * @return
     */

    @Override
    public String toString() {
        return "Direccion [" + "Calle= " + calle + ", Ciudad= " + comuna + ", Region= " + region + ']';
    }

}

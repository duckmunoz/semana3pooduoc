package model;

public class Direccion {

    private String calle;

    private String comuna;

    private String region;

    public Direccion(
            String calle,
            String comuna,
            String region) {
            this.calle = calle;
            this.comuna = comuna;
            this.region = region;
    }
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


    @Override
    public String toString() {
        return "Direccion [" + "Calle= " + calle + ", Ciudad= " + comuna + ", Region= " + region + ']';
    }

}

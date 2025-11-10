package app;

import model.Direccion;
import model.Persona;
import model.Rut;
import util.RutInvalidoException;

public class Main {
    public static void main(String[] args){

        System.out.println("Iniciando programa...");
        System.out.println("Desglozando información...");

        try{
            //Crear direccion
            Direccion dirEmpleado1 = new Direccion("Lipton 33","Las condes", "Metropolitana");
            Direccion dirEmpleado2 = new Direccion("Los manzanos 22","Huechuraba", "Metropolitana");
            Direccion dirEmpleado3 = new Direccion("Calle 11","Recoleta", "Metropolitana");

            //Crear RUT valido
            Rut rut1 = new Rut("12345678-k");
            Rut rut2 = new Rut("23432412-1");
            Rut rut3 = new Rut("15343234-K");


            //Crear empleado/s e integrar datos
            Persona p1 = new Persona("Juan", "Perez", rut1, dirEmpleado1);
            Persona p2 = new Persona("Maria", "Garcia", rut2, dirEmpleado2);
            Persona p3 = new Persona("Pedro", "Lopez", rut3, dirEmpleado3);
            Persona[] empleados = {p1, p2, p3};

            //Mostrar datos de empleado/s
            System.out.println("Datos de empleados");
            for (Persona p : empleados){
                System.out.println(p.toString());
            }

        } catch (RutInvalidoException e){
            System.out.println("Error al cargar los cliente: " +e.getMessage());
        }


    }
}

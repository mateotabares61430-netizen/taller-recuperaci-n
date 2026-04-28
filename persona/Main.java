package persona;

public class Main {

public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Sara Chávez", 19, "001");
        Profesor profesor = new Profesor("Eduardo Villegas", 35, 4000000);

        estudiante.MostrarInformacion();
        System.out.println();
        profesor.MostrarInformacion();
        System.out.println();
        
    }        
    
}

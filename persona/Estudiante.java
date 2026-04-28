package persona;

class Estudiante extends Persona {

    private String codigo;

    public Estudiante(String nombre, int edad, String codigo) {
        super(nombre, edad);
        this.codigo = codigo;        

    }
 
    @Override
    public void MostrarInformacion(){
        super.MostrarInformacion();
        System.out.println("codigo de estudiante: " + codigo);

    }
    
    
}

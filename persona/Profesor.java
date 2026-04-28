package persona;

class Profesor extends Persona {

    private double salario;

    public Profesor(String nombre, int edad, double salario) {
        super(nombre, edad);
        this.salario = salario;

    }

    @Override
    public void MostrarInformacion(){
        super.MostrarInformacion();
        System.out.println("salario del profesor: " + salario);

    }
    
}

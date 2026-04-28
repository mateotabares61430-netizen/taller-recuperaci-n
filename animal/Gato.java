package animal;

class Gato extends Animal {

    public Gato(String nombre, int edad) {
    super(nombre,edad);    
    }

    @Override
    public void hacerSonido() {
        System.out.println("Información del gato/a: " + "nombre: " + getNombre() + " edad: " + getEdad());
        System.out.println("Miau");
    }          
}

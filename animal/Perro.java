package animal;

class Perro extends Animal {

    public Perro(String nombre, int edad) {
    super(nombre, edad);    
    }

    @Override
    public void hacerSonido() {
        System.out.println("Información del perro/a: " + "nombre: " + getNombre() + " edad: " + getEdad());
        System.out.println("Guau");
    }    
}

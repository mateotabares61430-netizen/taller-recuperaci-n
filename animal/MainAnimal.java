package animal;

public class MainAnimal {

public static void main(String[] args) {
    Gato gato1 = new Gato("Felix", 5);
    gato1.hacerSonido();

    Gato gato2 = new Gato("Chirrisplin", 7);
    gato2.hacerSonido();

    Perro perro1 = new Perro("Rufo", 4);
    perro1.hacerSonido();

    Perro perro2 = new Perro("Gorda", 3);
    perro2.hacerSonido();

    }
    
}

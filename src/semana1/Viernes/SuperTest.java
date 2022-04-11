package semana1.Viernes;

class Animal{
    // Caso 1
    String color = "Blanco";

    // Caso 2
    void eat(){
        System.out.println("Esta comiendo");
    }
    // Caso 3
    Animal(){
        System.out.println("Se crea un animal");
    }
}

class Gato extends Animal {
    // Caso 1
    String color = "Cafe";
    void printColor(){
        System.out.println("Color de la clase gato: "+color);
        System.out.println("Color de la clase animal: "+super.color);
    }

    // Caso 2
    void eat(){
        System.out.println("Come atun");
    }

    void dormir(){
        System.out.println("Ya se durmio");
    }

    void call(){
        super.eat();
        dormir();
    }

    Gato(){
        super();
        System.out.println("Se ha creado un gato");
    }
}

public class SuperTest {
    public static void main(String[] args) {
        // Caso 1
        new Gato().printColor(); // "objeto anonimo" porque no tiene un nombre ni un tipo

        // Caso 2
        new Gato().call();

        // Caso 3
        new Gato();
    }
}

package semana1.Viernes;

class Animal2{
    void eat(){
        System.out.println("Esta comiendo...");
    }
}

class Dog extends Animal {
    @Override
    void eat() {
        System.out.println("Comiendo croquetas");
    }
}

class Cachorro extends Animal {
    @Override
    void eat() {
        System.out.println("Esta tomando agua");
    }
}

public class Polimorfismo2 {
    public static void main(String[] args) {
        Animal Poly;
        Poly = new Animal();
        Poly.eat();
        Poly = new Dog();
        Poly.eat();
        Poly = new Cachorro();
        Poly.eat();
    }
}

package semana1.Viernes;

//Ejemplo de ligadura dinámica
class Car2 {
    void run(){
        System.out.println("running...");
    }
}

public class Polimorfismo extends Car2 {
    @Override
    void run() {
        System.out.println("running safely with 60 mi/hr");
    }

    public static void main(String[] args) {
        Car2 car2 = new Polimorfismo(); // de clase auto pero imprime polimorfismo
        car2.run();
    }
}

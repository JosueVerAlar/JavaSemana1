package semana1.Viernes;

public class ClassicCar {
    public static void main(String[] args) {
        show();
    }

    /*
    public static void show(){
        Car c new Car(); <-- si este constructor por omisión no está definido previamente lo sobreescribe aquí
    }
    y como no lo inicializamos o no le pasamos parámetros que previamente si
    escribimos, da error por no reconocer un constructor vacío.
    */

    public static void show(){
        Car c = new Car("Azul", 6);
        System.out.println(c.getColor());
        System.out.println(c.getVelocidad());
    }
}

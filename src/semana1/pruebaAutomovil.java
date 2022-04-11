package semana1;

public class pruebaAutomovil {
    public static void main(String[] args) {
        def();
    }

    public static void def() {
        Automovil autoDeportivo = new Automovil();
        Automovil autoClasico = new Automovil("Blanco");

        autoDeportivo.setColor("Azul");
        autoDeportivo.setCilindrada(6);
        autoDeportivo.setEjesTransmision(2);
        autoDeportivo.setCapacidadMaletero(12.5);

        String msg = "Soy un automóvil con estas características: ";
        msg += "\nColor: "+autoDeportivo.getColor();
        msg += "\nCilindrada: "+autoDeportivo.getCilindrada()+" cilindros";
        msg += "\nEjes de transmisión: "+autoDeportivo.getEjesTransmision();
        msg += "\nCapacidad del maletero: "+autoDeportivo.getCapacidadMaletero()+" lts";

        System.out.print(msg);
        System.out.print("\nAuto clasico color: "+autoClasico.color);
    }
}

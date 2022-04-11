package semana1;

public class Automovil {
    Automovil(){
    }
    public Automovil (String color){
        this.color = color;
    }

    // Caracteristicas, Campos o Propiedades del objeto
    public int cilindrada, ejesTransmision;
    public double capacidadMaletero;
    public String color;

        // Metodos
    public int getCilindrada(){  return cilindrada;  }
    public int getEjesTransmision(){  return ejesTransmision;  }
    public double getCapacidadMaletero(){  return capacidadMaletero;  }
    public String getColor(){  return color;}

    public boolean setCilindrada(int cilindrada){
        if (cilindrada > 0){
            this.cilindrada = cilindrada;
            return true;
        } else
            return false;
    }

    public boolean setEjesTransmision(int ejesTransmision){
        if (ejesTransmision > 0 ){
            this.ejesTransmision = ejesTransmision;
            return true;
        } else
            return false;
    }

    public boolean setCapacidadMaletero(double capacidadMaletero){
        if (capacidadMaletero > 0){
            this.capacidadMaletero = capacidadMaletero;
            return true;
        } else
            return false;
    }

    public boolean setColor(String color){
        if (!color.isEmpty()){
            this.color = color;
        return true;
        } else
            return false;
    }

    // Hasta aqui se considera una clase pura o "POO"

    // Metodos de control
    public String printState(){
        return  "Cilindrada: "+cilindrada+"\n"+
                "Ejes de transmision: "+ejesTransmision+"\n"+
                "Capacidad de maletero: "+capacidadMaletero+"\n"+
                "Color: "+color+"\n";
    }
}

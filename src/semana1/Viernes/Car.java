package semana1.Viernes;


/*
OVERLOAD: Sobrecarga
    Cuando un metodo tiene el mismo nombre pero diferente lista de parámetros
    Se puede definir en una sola clase
OVERRIDE: Redefine
    Tipo de retorno idéntico pero diferente valor.
    Se define desde 2 o más clases
    "super"
OVERWRITE: Sobreescribe
*/

//Ejemplo de OverLoad; cuando un constructor tiene diferentes casos para funcionar
public class Car {
    private int velocidad;
    private String color, marca;

    public Car(){    } //constructor basico

    public Car(String color){  this.color = color;  }

    public Car(String color, int velocidad){ //<- otro tipo de constructor (TERCERO)
        this.velocidad = velocidad;
        this.color = color;
    }

    public Car(String color, String marca, int velocidad) { // constructor diferente del "TERCERO"
        this.velocidad = velocidad;
        this.color = color;
        this.marca = marca;
    }

    public int getVelocidad(){  return velocidad;  }
    public String getColor(){  return color;  }
    public String getMarca(){  return marca;  }
}

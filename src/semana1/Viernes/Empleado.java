package semana1.Viernes;

 class Persona{
    int id;
    String nombre;

    Persona (int id, String nombre){
        this.id = id;
        this.nombre = nombre;
    }
}

public class Empleado extends Persona {
     double salario;

     Empleado(int id, String nombre, double salario){
         super(id, nombre); // para no usar "this"
         this.salario = salario;
     }
     void display(){
         System.out.println(id+" "+nombre+" "+salario);
     }
}

class TestPersonaEmpleado{
    public static void main(String[] args) {
        Empleado e = new Empleado(1, "David",4550.32);
        e.display();
    }
}
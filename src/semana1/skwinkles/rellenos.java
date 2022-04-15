package semana1.skwinkles;

public class rellenos extends clasico {
    String relleno;

    rellenos(String classic, String relleno) {
        super(classic);
        this.relleno = relleno;
    }
    void displayed(){
        System.out.println(classic+"\ncon "+relleno);
    }
}

class rell {
    public static void main(String[] args) {
        rellenos r = new rellenos("Dulce enchilado en tiras","Relleno de tamarindo");
        r.displayed();
    }
}


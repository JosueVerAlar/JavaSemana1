package semana1.skwinkles;

public class salsagheti extends clasico {
    String tiras = "muy delgadas";
    String sobre = "Sobre de salsa sabor tamarindo";

    salsagheti(String classic, String tiras, String sobre) {
        super(classic);
        this.tiras = tiras;
        this.sobre = sobre;
    }
    void displaying() {
        System.out.println(classic+" "+tiras+"\ny con un "+sobre);
    }
}

class gheti{
    public static void main(String[] args) {
        salsagheti g = new salsagheti("Dulce enchilado en tiras", "muy delgadas","Sobre de salsa sabor tamarindo");
        g.displaying();
    }
}
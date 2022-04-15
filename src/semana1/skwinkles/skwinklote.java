package semana1.skwinkles;

public class skwinklote extends rellenos {
    String size;

    skwinklote(String classic, String relleno, String size) {
        super(classic, relleno);
        this.size = size;
    }
    void disp() {
        System.out.println(classic + "\ncon " + relleno + "\npero " + size);
    }
}

class skwink {
    public static void main(String[] args) {
        skwinklote s = new skwinklote("Dulce enchilado en tiras","Relleno de tamarindo","en mayor tamano");
        s.disp();
    }
}
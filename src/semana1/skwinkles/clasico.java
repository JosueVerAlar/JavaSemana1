package semana1.skwinkles;

public class clasico {
    String classic;

    clasico(String classic) {
        this.classic = classic;
    }
    void display(){
        System.out.println(classic);
    }
}

class skwinkle {
    public static void main(String[] args) {
        clasico skwin = new clasico("Dulce enchilado en tiras");
        skwin.display();
    }
}

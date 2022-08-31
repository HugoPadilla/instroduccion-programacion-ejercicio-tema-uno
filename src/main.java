public class main {
    public static void main(String[] args) {
        suma(2, 3, 4);

        Coche myCoche = new Coche();
        myCoche.incrementarPuertas(1);
        System.out.println(myCoche.cantidadPuertas);
    }

    public static void suma(int num1, int num2, int num3) {
        int result =  num1 + num2 + num3;
    }
}

class Coche {

    int cantidadPuertas = 4;

    public void incrementarPuertas(int increment) {
        this.cantidadPuertas = this.cantidadPuertas + increment;
    }
}
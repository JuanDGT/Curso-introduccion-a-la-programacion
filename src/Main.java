public class Main {
    public static void main(String[] args) {
        suma(10,2,3);
        Coche miCoche = new Coche();
        miCoche.sumarPuertas();
        System.out.println("El numero de puertas del carro es: " + miCoche.numeroDePuertas);
    }

    public static void suma (int a, int b, int c){
        int r = a + b + c;
        System.out.println(r);
    }
}
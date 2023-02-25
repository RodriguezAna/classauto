

// ejercicio suma con tres parametros
public class Main {
    public static void main(String[] args) {
        int resultado;
        resultado = suma( 10, 12,23);
        System.out.println(resultado);
    }

    public static int suma (int a,int b,int c) {
        return a+b+c;
    }



}


//ejercicio coche

public class Main {
    public static void main(String[] args) {
        coche micoche = new coche();
        micoche.sumarpuertas();
        micoche.sumarpuertas();
        System.out.println(micoche.puertas);

    }
}

    class coche {
        public int puertas = 2;

        public void sumarpuertas() {
            this.puertas++;
        }
    }

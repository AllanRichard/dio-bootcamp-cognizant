package br.com.dio;

public class Main {

    public static void main(String[] args) {
	    double quadrado = Quadrilatero.area(5);
        double retangulo = Quadrilatero.area(10,10);
        double trapezio = Quadrilatero.area(10,3,5);
        double losango = Quadrilatero.area(5f, 2f);

        System.out.println("Area do quadrado " + quadrado);
        System.out.println("Area do retangulo " + retangulo);
        System.out.println("Area do trapezio " + trapezio);
        System.out.println("Area do losango " + losango);
    }
}

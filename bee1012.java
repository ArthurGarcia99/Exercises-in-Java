import java.util.Scanner;

public class bee1012 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        double AreaT = (A * C)/2;
        double AreaC = 3.14159 * Math.pow(C, 2);
        double AreaTr = ((A + B) * C)/2;
        double AreaQ = B * B;
        double AreaR = A * B;

        System.out.printf("TRIANGULO: %.3f%n", AreaT);
        System.out.printf("CIRCULO: %.3f%n", AreaC);
        System.out.printf("TRAPEZIO: %.3f%n", AreaTr);
        System.out.printf("QUADRADO: %.3f%n", AreaQ);
        System.out.printf("RETANGULO: %.3f%n", AreaR);
    }

}
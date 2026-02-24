import java.util.Scanner;

public class bee1010 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cod1 = sc.nextInt();
        int pec1 = sc.nextInt();
        double val1 = sc.nextDouble();

        int cod2 = sc.nextInt();
        int pec2 = sc.nextInt();
        double val2 = sc.nextDouble();

        double resultado = (pec1 * val1 + pec2 * val2);

        System.out.printf("VALOR A PAGAR: R$ %.2f%n",resultado);
    }

}
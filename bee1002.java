import java.util.Scanner;

public class bee1002 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double n = 3.14159;
        double raio = sc.nextDouble();

        double multiplicacao = raio * raio;
        double area = n * multiplicacao;

        System.out.printf("A=%.4f%n",area);

        sc.close();
    }

}
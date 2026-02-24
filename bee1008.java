import java.util.Scanner;

public class bee1008 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        double C = sc.nextDouble();

        double salario = B * C;

        System.out.println("NUMBER = " + A);
        System.out.printf("SALARY = U$ %.2f%n",salario);

    }

}
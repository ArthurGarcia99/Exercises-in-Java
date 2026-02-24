import java.util.Scanner;

public class bee1036 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        if(A == 0){
            System.out.println("Impossivel calcular");
            return;
        }

        double delta;

        delta = (Math.pow(B, 2)) - (4 * A * C);

        if(delta < 0){
            System.out.println("Impossivel calcular");
            return;
        }

        double r1, r2;

        r1 = ((-B) + Math.sqrt(delta))/(2 * A);
        r2 = ((-B) - Math.sqrt(delta))/(2 * A);

        System.out.printf("R1 = %.5f%n", r1);
        System.out.printf("R2 = %.5f%n", r2);

        sc.close();
    }
}
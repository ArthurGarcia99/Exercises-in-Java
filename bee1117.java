import java.util.Scanner;

public class bee1117 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble();
        double soma = 0;

        while(x < 0 || x > 10){
            System.out.println("nota invalida");
            x = sc.nextDouble();
        }
        soma+= x;

        double y = sc.nextDouble();

        while(y < 0 || y > 10){
            System.out.println("nota invalida");
            y = sc.nextDouble();
        }
        soma+= y;

        double media = soma/2.0;

        System.out.printf("media = %.2f%n",media);

    }
}

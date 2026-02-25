import java.util.Scanner;

public class bee1118 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n1 = 1;
        double soma = 0;
        double media = 0;

        while(n1 != 2){
            double nota1 = sc.nextDouble();
            while(nota1 < 0 || nota1 > 10){
                System.out.println("nota invalida");
                nota1 = sc.nextDouble();
            }
            soma+= nota1;

            double nota2 = sc.nextDouble();
            while(nota2 < 0 || nota2 > 10){
                System.out.println("nota invalida");
                nota2 = sc.nextDouble();
            }
            soma+= nota2;

            media = soma/2.0;

            System.out.printf("media = %.2f%n", media);

            soma = 0;
            media = 0;
            do {
                System.out.println("novo calculo (1-sim 2-nao)");
                n1 = sc.nextInt();
            } while (n1 != 1 && n1 != 2);
        }

    }
}
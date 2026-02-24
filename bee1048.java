import java.util.Scanner;

public class bee1048 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salario = sc.nextDouble();
        double reajuste = 0, novosalario = 0;
        int percentual = 0;

        if(salario <= 400.00){
            reajuste = salario * 0.15;
            novosalario = salario + reajuste;
            percentual = 15;
        }else if(salario > 400.00 && salario <= 800.00){
            reajuste = salario * 0.12;
            novosalario = salario + reajuste;
            percentual = 12;
        }else if(salario > 800.00 && salario <= 1200.00){
            reajuste = salario * 0.10;
            novosalario = salario + reajuste;
            percentual = 10;
        }else if(salario > 1200.00 && salario <= 2000.00){
            reajuste = salario * 0.07;
            novosalario = salario + reajuste;
            percentual = 7;
        }else if(salario > 2000.00){
            reajuste = salario * 0.04;
            novosalario = salario + reajuste;
            percentual = 4;
        }

        System.out.printf("Novo salario: %.2f%n", novosalario);
        System.out.printf("Reajuste ganho: %.2f%n", reajuste);
        System.out.println("Em percentual: " + percentual + " %");

        sc.close();
    }
}
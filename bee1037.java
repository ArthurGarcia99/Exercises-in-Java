import java.util.Scanner;

public class bee1037 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double numero = sc.nextDouble();

        if(numero >= 0 && numero <= 25.00){
            System.out.println("Intervalo [0,25]");
        }else if(numero > 25.00 && numero <= 50.00){
            System.out.println("Intervalo (25,50]");
        }else if(numero > 50.00 && numero <= 75.00){
            System.out.println("Intervalo (50,75]");
        }else if(numero > 75.00 && numero <= 100.00){
            System.out.println("Intervalo (75,100]");
        }else{
            System.out.println("Fora de intervalo");
        }

        sc.close();
    }
}
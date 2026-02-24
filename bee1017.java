import java.util.Scanner;

public class bee1017 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tempo = sc.nextInt();
        double velocidade = sc.nextInt();

        double litros = (velocidade/12) * tempo;

        System.out.printf("%.3f%n",litros);
    }

}
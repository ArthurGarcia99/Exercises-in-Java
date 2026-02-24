import java.util.Scanner;

public class bee1021 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double N = sc.nextDouble();

        int valor = (int) Math.round(N * 100);

        int cem = valor / 10000;
        valor %= 10000;

        int cinquenta = valor / 5000;
        valor %= 5000;

        int vinte = valor / 2000;
        valor %= 2000;

        int dez = valor / 1000;
        valor %= 1000;

        int cinco = valor / 500;
        valor %= 500;

        int dois = valor / 200;
        valor %= 200;

        int um = valor / 100;
        valor %= 100;

        int centavo50 = valor / 50;
        valor %= 50;

        int centavo25 = valor / 25;
        valor %= 25;

        int centavo10 = valor / 10;
        valor %= 10;

        int centavo5 = valor / 5;
        valor %= 5;

        int centavo1 = valor;

        System.out.println("NOTAS:");
        System.out.println(cem + " nota(s) de R$ 100.00");
        System.out.println(cinquenta + " nota(s) de R$ 50.00");
        System.out.println(vinte + " nota(s) de R$ 20.00");
        System.out.println(dez + " nota(s) de R$ 10.00");
        System.out.println(cinco + " nota(s) de R$ 5.00");
        System.out.println(dois + " nota(s) de R$ 2.00");

        System.out.println("MOEDAS:");
        System.out.println(um + " moeda(s) de R$ 1.00");
        System.out.println(centavo50 + " moeda(s) de R$ 0.50");
        System.out.println(centavo25 + " moeda(s) de R$ 0.25");
        System.out.println(centavo10 + " moeda(s) de R$ 0.10");
        System.out.println(centavo5 + " moeda(s) de R$ 0.05");
        System.out.println(centavo1 + " moeda(s) de R$ 0.01");

        sc.close();
    }
}
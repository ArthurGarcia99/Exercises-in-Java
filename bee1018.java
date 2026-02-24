import java.util.Scanner;

public class bee1018 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int cem = N / 100;
        int resto = N % 100;

        int cinquenta = resto / 50;
        int resto2 = resto % 50;

        int vinte = resto2 / 20;
        int resto3 = resto2 % 20;

        int dez = resto3 / 10;
        int resto4 = resto3 % 10;

        int cinco = resto4 / 5;
        int resto5 = resto4 % 5;

        int dois = resto5 / 2;
        int resto6 = resto5 % 2;

        int um = resto6;

        System.out.println(N);
        System.out.println(cem + " nota(s) de R$ 100,00");
        System.out.println(cinquenta + " nota(s) de R$ 50,00");
        System.out.println(vinte + " nota(s) de R$ 20,00");
        System.out.println(dez + " nota(s) de R$ 10,00");
        System.out.println(cinco + " nota(s) de R$ 5,00");
        System.out.println(dois + " nota(s) de R$ 2,00");
        System.out.println(um + " nota(s) de R$ 1,00");
    }

}
import java.util.Scanner;

public class bee1061 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int d1 = sc.nextInt();
        int h1 = sc.nextInt();
        s = sc.next();
        int m1 = sc.nextInt();
        s = sc.next();
        int s1 = sc.nextInt();
        s = sc.next();
        int d2 = sc.nextInt();
        int h2 = sc.nextInt();
        s = sc.next();
        int m2 = sc.nextInt();
        s = sc.next();
        int s2 = sc.nextInt();

        int inicio = d1 * 24 * 60 * 60 + h1 * 60 * 60 + m1 * 60 + s1;
        int fim = d2 * 24 * 60 * 60 + h2 * 60 * 60 + m2 * 60 + s2;
        int duracao = fim - inicio;

        int dias = duracao /(24 * 60 * 60);
        int resto = duracao % (24 * 60 * 60);

        int horas = resto /(60 * 60);
        resto %= (60 * 60);

        int minutos = resto / 60;
        int segundos = resto % 60;

        System.out.println(dias + " dia(s)");
        System.out.println(horas + " hora(s)");
        System.out.println(minutos + " minuto(s)");
        System.out.println(segundos + " segundo(s)");


        sc.close();
    }
}
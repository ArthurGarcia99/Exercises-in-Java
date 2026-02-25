import java.util.Scanner;

public class bee1154 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int idade = sc.nextInt();
        int soma = 0;
        int quantidade = 0;

        while(idade > 0){
            soma+= idade;
            quantidade++;
            idade = sc.nextInt();
        }

        double media = 0;

        media = (double)soma/quantidade;

        System.out.printf("%.2f%n",media);
    }
}

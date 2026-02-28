import java.util.Scanner;

public class bee1080 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int maior = 0;
        int posicao = 0;

        for(int i = 0; i < 100; i++){
            int numero = sc.nextInt();
            if(numero > maior){
                maior = numero;
                posicao = i + 1;
            }
        }

        System.out.println(maior);
        System.out.println(posicao);

    }
}

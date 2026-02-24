import java.util.Scanner;

public class bee1046 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int inicio = sc.nextInt();
        int fim = sc.nextInt();
        int duracao;

        if (inicio == fim){
            duracao = 24;
        }else if(inicio > fim){
            fim += 24;
            duracao = fim - inicio;
        }else{
            fim += 24;
            inicio += 24;
            duracao = fim - inicio;
        }

        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

        sc.close();
    }
}
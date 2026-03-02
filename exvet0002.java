import java.util.Scanner;

public class exvet0002 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int[] vetor = new int[n1];
        int pares = 0;

        for(int i = 0; i < n1; i++){
            vetor[i] = sc.nextInt();
            if(vetor[i] % 2 == 0){
                System.out.print(vetor[i] + " ");
                pares++;
            }
        }
        System.out.println();
        System.out.println(pares);

    }
}

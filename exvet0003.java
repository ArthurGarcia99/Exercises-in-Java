import java.util.Scanner;

public class exvet0003 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int[] vet1 = new int[n1];
        int[] vet2 = new int[n1];
        int[] vet3 = new int[n1];

        for(int i = 0; i < n1; i++){
            vet1[i] = sc.nextInt();
        }

        for(int i = 0; i < n1; i++){
            vet2[i] = sc.nextInt();
        }

        for(int i = 0; i < n1; i++){
            vet3[i] = vet1[i] + vet2[i];
            System.out.print(vet3[i] + " ");
        }

    }
}

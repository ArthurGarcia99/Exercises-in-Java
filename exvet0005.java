import java.util.Scanner;

public class exvet0005 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int[] vet = new int[n1];
        int somapares = 0;
        int quantidade = 0;

        for(int i = 0; i < n1; i++){
            vet[i] = sc.nextInt();
            if(vet[i] % 2 == 0){
                somapares+= vet[i];
                quantidade++;
            }
        }

        System.out.println(somapares/quantidade);

    }
}

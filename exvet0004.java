import java.util.Scanner;

public class exvet0004 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        double[] vet = new double[n1];
        double soma = 0.0;

        for(int i = 0; i < n1; i++){
            vet[i] = sc.nextDouble();
            soma+= vet[i];
        }
        System.out.println(soma/n1);

        for(int i = 0; i < n1; i++){
            if(vet[i] < (soma/n1)){
                System.out.println(vet[i]);
            }
        }

    }
}

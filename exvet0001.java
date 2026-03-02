import java.util.Scanner;

public class exvet0001 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        double[] vetor = new double[n1];
        double maior = 0.0;
        int indice = 0;

        for(int i = 0; i < n1; i++){
            vetor[i] = sc.nextDouble();
            if(vetor[i] > maior){
                maior = vetor[i];
                indice = i;
            }
        }

        System.out.printf("%.1f%n", maior);
        System.out.println(indice);
    }
}

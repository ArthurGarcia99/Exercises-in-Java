import java.util.Scanner;

public class exvet0007 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        String[] nomes = new String[n1];
        double[] notas1 = new double[n1];
        double[] notas2 = new double[n1];


        for(int i = 0; i < n1; i++){
            nomes[i] = sc.next();
            notas1[i] = sc.nextDouble();
            notas2[i] = sc.nextDouble();
        }
        System.out.println("Alunos aprovados:");
        for(int i = 0; i < n1; i++){
            if((notas1[i] + notas2[i])/2 >= 6){
                System.out.println(nomes[i]);
            }
        }
    }
}

import java.util.Scanner;

public class exvet0006 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        String[] nomes = new String[n1];
        int[] idades = new int[n1];
        int maisvelho = 0;
        String nomeV = "";

        for(int i = 0; i < n1; i++){
            nomes[i] = sc.next();
            idades[i] = sc.nextInt();
            if(idades[i] > maisvelho){
                maisvelho = idades[i];
                nomeV = nomes[i];
            }
        }

        System.out.println("Pessoa mais velha: " + nomeV);

    }
}

import java.util.Scanner;

public class exvet0008 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        double[] alturas = new double[n1];
        char[] sexo = new char[n1];
        double somaalturaM = 0.0;
        int contagem = 0;
        int numeroH = 0;

        for(int i = 0; i < n1; i++){
            alturas[i] = sc.nextDouble();
            sexo[i] = sc.next().charAt(0);
            if(sexo[i] == 'F'){
                somaalturaM+= alturas[i];
                contagem++;
            }else{
                numeroH++;
            }
        }
        double maioraltura = 0.0;
        double menoraltura = alturas[0];

        for(int i = 0; i < n1; i++){
            if(alturas[i] < menoraltura){
                menoraltura = alturas[i];
            }
            if(alturas[i] > maioraltura){
                maioraltura = alturas[i];
            }
        }

        System.out.printf("Menor altura = %.2f%n", menoraltura);
        System.out.printf("Maior altura = %.2f%n", maioraltura);
        System.out.printf("Media das alturas das mulheres = %.2f%n", somaalturaM/contagem);
        System.out.println("Numero de homens = " + numeroH);



    }
}

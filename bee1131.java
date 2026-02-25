import java.util.Scanner;

public class bee1131 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n1 = 1;
        int vitoriasI = 0;
        int vitoriasG = 0;
        int empates = 0;
        int quantidade = 0;

        while(n1 != 2){
            int interG = sc.nextInt();
            int gremioG = sc.nextInt();

            if(interG > gremioG){
                vitoriasI++;
            }else if(gremioG > interG){
                vitoriasG++;
            }else if(gremioG == interG){
                empates++;
            }
            quantidade++;

            do{
                System.out.println("Novo grenal (1-sim 2-nao)");
                n1 = sc.nextInt();
            }while(n1 != 1 && n1 != 2);
        }

        System.out.println(quantidade + " grenais");
        System.out.println("Inter:" + vitoriasI);
        System.out.println("Gremio:" + vitoriasG);
        System.out.println("Empates:" + empates);
        if(vitoriasI > vitoriasG){
            System.out.println("Inter venceu mais");
        }else{
            System.out.println("Gremio venceu mais");
        }
    }
}

import java.util.Scanner;

public class bee1094 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int Totalcobaias = 0;
        int Qcoelhos = 0;
        int Qratos = 0;
        int Qsapos = 0;

        for(int i = 0; i < x; i++){
            int Qcobaias = sc.nextInt();
            char Tcobaias = sc.next().charAt(0);
            Totalcobaias += Qcobaias;
            if(Tcobaias == 'C'){
                Qcoelhos+= Qcobaias;
            }else if(Tcobaias == 'R'){
                Qratos+= Qcobaias;
            }else if(Tcobaias == 'S'){
                Qsapos+= Qcobaias;
            }
        }

        double Pcoelhos = ((double)Qcoelhos/Totalcobaias) * 100;
        double Pratos = ((double)Qratos/Totalcobaias) * 100;
        double Psapos = ((double)Qsapos/Totalcobaias) * 100;

        System.out.println("Total: " + Totalcobaias + " cobaias");
        System.out.println("Total de coelhos: " + Qcoelhos);
        System.out.println("Total de ratos: " + Qratos);
        System.out.println("Total de sapos: " + Qsapos);
        System.out.printf("Percentual de coelhos: %.2f %%%n", Pcoelhos);
        System.out.printf("Percentual de ratos: %.2f %%%n", Pratos);
        System.out.printf("Percentual de sapos: %.2f %%%n", Psapos);

    }
}

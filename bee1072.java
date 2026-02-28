import java.util.Scanner;

public class bee1072 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int dentro = 0;
        int fora = 0;

        for(int i = 0; i < x; i++){
            int numero = sc.nextInt();
            if(numero >= 10 && numero <= 20){
                dentro++;
            }else{
                fora++;
            }
        }

        System.out.println(dentro + " in");
        System.out.println(fora + " out");

    }
}

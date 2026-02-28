import java.util.Scanner;

public class bee1074 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        for(int i = 0; i < x; i++){
            int numero = sc.nextInt();
            if(numero % 2 == 0 && numero > 0){
                System.out.println("EVEN POSITIVE");
            }else if(numero % 2 == 0 && numero < 0){
                System.out.println("EVEN NEGATIVE");
            }else if(numero % 2 != 0 && numero > 0){
                System.out.println("ODD POSITIVE");
            }else if(numero % 2 != 0 && numero < 0){
                System.out.println("ODD NEGATIVE");
            }else{
                System.out.println("NULL");
            }
        }
    }
}

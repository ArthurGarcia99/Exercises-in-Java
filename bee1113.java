import java.util.Scanner;

public class bee1113 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        while(n1 != n2){
            if(n1 > n2){
                System.out.println("Decrescente");
            }else{
                System.out.println("Crescente");
            }
            n1 = sc.nextInt();
            n2 = sc.nextInt();
        }

    }
}

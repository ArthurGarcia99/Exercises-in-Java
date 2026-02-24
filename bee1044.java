import java.util.Scanner;

public class bee1044 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        if(n2 > n1){
            if(n2 % n1 == 0){
                System.out.println("Sao Multiplos");
            }else{
                System.out.println("Nao sao Multiplos");
            }
        }else if (n1 > n2){
            if(n1 % n2 == 0){
                System.out.println("Sao Multiplos");
            }else{
                System.out.println("Nao sao Multiplos");
            }
        }else if(n1 == n2){
            System.out.println("Sao Multiplos");
        }



        sc.close();
    }
}
import java.util.Scanner;

public class bee1116 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        for(int i = 0; i < x; i++){
            double n1 = sc.nextDouble();
            double n2 = sc.nextDouble();
            if(n2 == 0){
                System.out.println("divisao impossivel");

            }else {
                double divisao = n1 / n2;
                System.out.printf("%.1f%n", divisao);
            }
        }
    }
}

import java.util.Scanner;

public class bee1153 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int soma = 1;

        for(int i = n1; i > 0; i--){
            soma*= i;
        }

        System.out.println(soma);
    }
}

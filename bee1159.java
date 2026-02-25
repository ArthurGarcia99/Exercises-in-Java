import java.util.Scanner;

public class bee1159 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int soma = 0;

        while(x != 0){
            if(x % 2 == 0){
                soma += x + (x + 2) + (x + 4) + (x + 6) + (x + 8);
            }else{
                soma += (x + 1) + (x + 3) + (x + 5) + (x + 7) + (x + 9);
            }
            System.out.println(soma);
            x = sc.nextInt();
            soma = 0;
        }

    }
}
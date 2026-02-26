import java.util.Scanner;

public class bee1071 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int soma = 0;

        if(n1 > n2){
            for(int i = n1 - 1; i > n2; i--){
                if(i % 2 != 0){
                    soma+= i;
                }
            }
        }else{
            for(int i = n2 - 1; i > n1; i--){
                if(i % 2 != 0){
                    soma+= i;
                }
            }
        }

        System.out.println(soma);

    }
}

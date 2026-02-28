import java.util.Scanner;

public class bee1132 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int soma = 0;

        if(n1 < n2){
            for(int i = n1; i <= n2; i++){
                if(i % 13 != 0){
                    soma+= i;
                }
            }
        }else{
            for(int i = n2; i <= n1; i++){
                if(i % 13 != 0){
                    soma+= i;
                }
            }
        }

        System.out.println(soma);

    }
}

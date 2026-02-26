import java.util.Scanner;

public class bee1078 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();

        for(int i = 1; i <= 10; i++ ){
            System.out.println(i + " x " + numero + " = " + i * numero);
        }
    }
}

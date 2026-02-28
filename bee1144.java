import java.util.Scanner;

public class bee1144 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int n1 = 1;

        for(int i = 0; i < x; i++){
            System.out.println(n1 + " " + n1 * n1 + " " + n1 * n1 * n1);
            System.out.println(n1 + " " + ((n1 * n1) + 1) + " " + ((n1 * n1 * n1) + 1));
            n1++;
        }

    }
}

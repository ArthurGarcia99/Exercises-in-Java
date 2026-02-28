import java.util.Scanner;

public class bee1142 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int n1 = 1;
        int n2 = 2;
        int n3 = 3;

        for(int i = 0; i < x; i++){
            System.out.println(n1 + " " + n2 + " " + n3 + " PUM");
            n1+= 4;
            n2+= 4;
            n3+= 4;
        }


    }
}

import java.util.Scanner;

public class bee1045 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float n1 = sc.nextFloat();
        float n2 = sc.nextFloat();
        float n3 = sc.nextFloat();

        if(n1 >= n2 + n3 || n2 >= n1 + n3 || n3 >= n1 + n2){
            System.out.println("NAO FORMA TRIANGULO");
        }else if(n1 * n1 == (n2 * n2) + (n3 * n3) || n2 * n2 == (n1 * n1) + (n3 * n3) || n3 * n3 == (n1 * n1) + (n2 * n2)){
            System.out.println("TRIANGULO RETANGULO");
            if(n1 == n2 || n1 == n3 || n2 == n3){
                System.out.println("TRIANGULO ISOSCELES");
            }
        }else if(n1 * n1 > (n2 * n2) + (n3 * n3) || n2 * n2 > (n1 * n1) + (n3 * n3) || n3 * n3 > (n1 * n1) + (n2 * n2)){
            System.out.println("TRIANGULO OBTUSANGULO");
            if(n1 == n2 || n1 == n3 || n2 == n3){
                System.out.println("TRIANGULO ISOSCELES");
            }
        }else if(n1 * n1 < (n2 * n2) + (n3 * n3) || n2 * n2 < (n1 * n1) + (n3 * n3) || n3 * n3 < (n1 * n1) + (n2 * n2)){
            System.out.println("TRIANGULO ACUTANGULO");
            if(n1 == n2 && n2 == n3){
                System.out.println("TRIANGULO EQUILATERO");
            }else if(n1 == n2 || n1 == n3 || n2 == n3){
                System.out.println("TRIANGULO ISOSCELES");
            }
        }


        sc.close();
    }
}
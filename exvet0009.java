import java.util.Scanner;

public class exvet0009 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        String[] produtos = new String[n1];
        double[] precosC = new double[n1];
        double[] precosV = new double[n1];
        double somacompra = 0.0;
        double somavenda = 0.0;
        int lucroabaixo10 = 0;
        int lucroentre10e20 = 0;
        int lucroacima20 = 0;

        for(int i = 0; i < n1; i++){
            produtos[i] = sc.next();
            precosC[i] = sc.nextDouble();
            precosV[i] = sc.nextDouble();
            somacompra+= precosC[i];
            somavenda+= precosV[i];
            if((precosV[i] - precosC[i])/precosC[i] * 100 < 10){
                lucroabaixo10++;
            }else if((precosV[i] - precosC[i])/precosC[i] * 100 >= 10 && (precosV[i] - precosC[i])/precosC[i] * 100 <= 20){
                lucroentre10e20++;
            }else if((precosV[i] - precosC[i])/precosC[i] * 100 > 20){
                lucroacima20++;
            }
        }

        System.out.println("Lucro abaixo de 10%: " + lucroabaixo10);
        System.out.println("Lucro entre 10% e 20%: " + lucroentre10e20);
        System.out.println("Lucro acima de 20%: " + lucroacima20);
        System.out.printf("Valor total de compra: %.2f%n", somacompra);
        System.out.printf("Valor total de venda: %.2f%n", somavenda);
        System.out.printf("Lucro total: %.2f%n", somavenda - somacompra);

    }
}

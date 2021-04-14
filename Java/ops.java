import java.util.Scanner;
import java.text.DecimalFormat;

public class ops {
    public static void main(String[] args) throws Exception{
        Scanner teclado = new Scanner (System.in);
        DecimalFormat numero = new DecimalFormat("0.00");

        int N = teclado.nextInt();
        int H = teclado.nextInt();
        double S = teclado.nextDouble();

        double Salary = S * H; 

        System.out.println("NUMBER = " + N );
        System.out.println("SALARY = U$ " + numero.format(Salary));
        teclado.close();



    }

}    
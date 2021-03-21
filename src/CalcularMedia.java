import java.util.Scanner;
import java.text.DecimalFormat;

public class CalcularMedia {
    public static void main(String[] args) throws Exception{
        Scanner teclado = new Scanner (System.in);
        DecimalFormat numero = new DecimalFormat("0.00");

        double A = teclado.nextDouble();
        double B = teclado.nextDouble();
        double C = teclado.nextDouble();

        double Total = ((A + B + C) / 3);

        System.out.println ("TOTAL =" + numero.format(Total));
        teclado.close();


    }
}
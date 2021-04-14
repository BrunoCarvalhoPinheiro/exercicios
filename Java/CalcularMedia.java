import java.io.PrintStream;
import java.util.Scanner;
import java.text.DecimalFormat;

public class CalcularMedia {
    public static void main(String[] args) throws Exception{
        PrintStream show = System.out;
        Scanner teclado = new Scanner (System.in);
        DecimalFormat numero = new DecimalFormat("0.00");

        show.println("informe a primeira nota:");
        double A = teclado.nextDouble();
        
        show.println("informe a segunda nota:");
        double B = teclado.nextDouble();
        
        show.println("informe a terceira nota:");
        double C = teclado.nextDouble();

        double Total = ((A + B + C) / 3);

        System.out.println ("TOTAL =" + numero.format(Total));
        teclado.close();


    }
}
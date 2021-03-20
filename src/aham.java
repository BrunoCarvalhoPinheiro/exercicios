import java.util.Scanner;
import java.text.DecimalFormat;
   
public class aham {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner (System.in);
        DecimalFormat numero = new DecimalFormat("0.00000");

        double A = teclado.nextDouble();

        double B = teclado.nextDouble();

        double Media = ((A * 3.5) + (B * 7.5)) / 11;

        System.out.println("MEDIA = " + numero.format(Media));
        teclado.close();

    }

}
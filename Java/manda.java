import java.util.Scanner;
import java.text.DecimalFormat;

public class manda {
    public static void main(String[] args) throws Exception{
        Scanner teclado = new Scanner (System.in);
        DecimalFormat numero = new DecimalFormat("0.00");

        String NomeDoVendedor = teclado.next();

        double SalarioFixo = teclado.nextDouble();
        double TotalDeVendas = teclado.nextDouble();
        double Salario = SalarioFixo + (TotalDeVendas * 0.15);

        System.out.println ("TOTAL = R$ " + numero.format(Salario));
        teclado.close();

    }
}    
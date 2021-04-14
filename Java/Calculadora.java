import java.io.PrintStream;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Calculadora {
        public static void main(String[] args) throws Exception{
            PrintStream show = System.out;
            Scanner teclado = new Scanner (System.in);
            DecimalFormat numero = new DecimalFormat("0.00000");   

            show.println("informe o primeiro número:");
            double n1 = teclado.nextDouble();
            show.println("informe a operação:");
            double operacao = teclado.nextDouble();    
            show.println("informe o segundo número:");
            double n2 = teclado.nextDouble(); 
            double resultado = 0

            if(operacao == '+'):
                resultado = n1 + n2;
            elif(operacao == '-'):
                resultado = n1 - n2;
            elif(operacao == '*'):
                resultado = n1 * n2;
            elif(operacao == '/'):
                resultado = n1 / n2;
            else:
                show.println("Operação inválida");

            System.out.println ("Resultado =" + numero.format(Total));
            teclado.close(); 

        }
}
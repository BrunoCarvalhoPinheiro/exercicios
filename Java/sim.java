import java.util.Scanner;

public class sim {
    public static void main(String[] args) throws Exception{
        Scanner teclado = new Scanner (System.in);

        int A = teclado.nextInt();
        int B = teclado.nextInt();
        int C = teclado.nextInt();
        int D = teclado.nextInt();

        int Diferenca = (A * B - C * D);

        System.out.println("DIFERENCA = " +Diferenca);
        teclado.close();

    }

}    
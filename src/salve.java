import java.util.Scanner;

public class salve {
    public static void main(String[] args) throws Exception{
        Scanner teclado = new Scanner (System.in);

        int A = teclado.nextInt();
        
        int B = teclado.nextInt();

        int Prod = A * B; 

        System.out.println ("PROD = " +Prod );
        teclado.close();
        
    }
}
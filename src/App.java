import java.util.Scanner;
   
public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner (System.in);

        double N = 3.14159;

        double Raio = teclado.nextDouble();
            
        double Area = N * Raio * Raio;

        System.out.println("N * Raio = " +Area);

        teclado.close();
    


    }
    
}

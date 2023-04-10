import java.util.Scanner;

public class App {
   
    public static void main(String[] args) throws Exception {
          //Entrada do numero 
        Scanner teclado = new Scanner(System.in); {
            System.out.println("Digite um número: ");
            int numero = teclado.nextInt();
            teclado.close();
            //Processamento: Não tem
            //Saída: O número informado foi [número]
            System.out.println("O número informado foi [" + numero +"]");
        }
    }
}

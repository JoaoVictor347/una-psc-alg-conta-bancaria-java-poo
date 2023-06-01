
import java.util.Scanner;
public class DepositarValor {


    // Instancia objetos
    Scanner scanner = new Scanner(System.in);
    Conta conta = new Conta();

    
    // Realiza funções

    public void depositar(double saldoConta){

        System.out.println("Por favor, insira o valor que deseja depositar: ");
         conta.setValorDeposito(scanner.nextDouble());

         if (conta.getValorDeposito() < 0){
            System.out.println("\nVocê não pode depositar um valor negativo.");
            System.out.println("Tente novamente. ");                      
         } else {

            saldoConta = (saldoConta + conta.getValorDeposito());
            System.out.println("Valor de R$ "+ conta.getValorDeposito() + " depositado com sucesso.");
            System.out.println("valor disponível de R$ "+ saldoConta + ".");
          }

          scanner.close();

    }
     
}
    


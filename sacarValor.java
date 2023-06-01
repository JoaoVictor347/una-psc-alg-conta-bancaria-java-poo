import java.util.Scanner;
public class sacarValor {

    Scanner scanner = new Scanner(System.in);
    Conta conta = new Conta();

    public void saque(double saldoConta){

        

        System.out.println("Por favor, insira o valor que deseja retirar: ");
        conta.setValorSaque(scanner.nextDouble());

        if (conta.getValorSaque() > 5000){
            System.out.println("Valor do saque acima do permitido");
        } 

        if (conta.getValorSaque() > saldoConta){
            System.out.println("Saldo insuficiente.");
        } else {
            saldoConta = (saldoConta - conta.getValorSaque());

            System.out.println("Saque de R$ " + conta.getValorSaque()+ " realizado com sucesso.");           
        }
    }
    
}

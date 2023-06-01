import java.util.Random;
import java.util.Date;

public class ExtratoUsuario {

    Conta conta = new Conta();
    Random gerador = new Random();
    Date data = new Date();

    public void extrato(String nome, int conta, double saldo){

        int numeroExtrato = (1 + gerador.nextInt(99999));
    
        System.out.println("##########################################");
        System.out.println("\n\t DEMONSTRATIVO DE OPERAÇÃO");
        System.out.println("Extrato N. " + numeroExtrato );
        System.out.println("\nNome: " + nome);
        System.out.println("Número da conta: " + conta);
        System.out.println("Saldo disponível: " + saldo);

        System.out.println("\n"+data);
        System.out.println("##########################################");

    }    
}
import java.util.Scanner;
import java.util.Random;

public class InicioAplicacao {

    public static void main(String[] args) {

        //Instancia objetos

        Scanner scanner = new Scanner(System.in);
        Random gerador = new Random();
        DepositarValor deposito = new DepositarValor();
        sacarValor saque = new sacarValor();        
        Conta conta = new Conta();
        ExtratoUsuario extrato = new ExtratoUsuario();
        

        // Declara variaveis

        int acaoUsuario;

        // Coleta informações do usuario 

        System.out.println("Cadastrando novo cliente. ");
        System.out.println("Por favor insira seu nome: ");
        conta.setNomePessoa(scanner.nextLine());


        System.out.println("Por favor, insira o valor inicial para deposito: ");
        conta.setSaldoConta(scanner.nextDouble());

        conta.setNumeroConta(1 + gerador.nextInt(9999)) ;

        System.out.println("Conta bancária criada com sucesso.");

        // Ação escolhida pelo usuário.

       System.out.println("\nA seguir, escolha alguma das alternativas:");

       System.out.println("1 - Depositar valor: ");

       System.out.println("2 - Sacar valor: ");

       System.out.println("3 - Extrato: ");
       acaoUsuario = scanner.nextInt();
       

       switch (acaoUsuario){

            case 1:

                deposito.depositar(conta.getSaldoConta());

            break;

            case 2:

                saque.saque(conta.getSaldoConta());

            break;

            case 3:

           
            extrato.extrato(conta.getNomePessoa(), conta.getNumeroConta(), conta.getSaldoConta());

            break;

       }
       scanner.close();

       
    }

}
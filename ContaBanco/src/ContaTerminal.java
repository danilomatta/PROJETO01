import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       int numero;
       String agencia;
       String nomeCliente;
       double saldo;
       Scanner scanner = new Scanner(System.in);

       System.out.println("Por Favor, informe seu nome!");
       nomeCliente = scanner.nextLine();

       System.out.println("Por Favor, digite o número da Agência!");
       agencia = scanner.nextLine();

       System.out.println("Por Favor, digite o número da conta!");
       numero = scanner.nextInt();

       System.out.println("Por Favor, insira o valor a ser depositado: ");
       saldo = scanner.nextDouble();

       System.out.println("Olá "+ nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta "+
       numero + " e seu saldo de R$"+ saldo + " já está disponível para saque");


    }
}

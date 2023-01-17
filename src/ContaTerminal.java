import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner teclado  = new Scanner(System.in);

        int numero;
        String Agencia, NomeCliente;
        Double Saldo;

        System.out.println("Insira o número da Conta: ");
        numero = teclado.nextInt();

        System.out.println("Insira o número da Agência: ");
        Agencia = teclado.next();

        System.out.println("Insira o Nome do Cliente: ");
        NomeCliente = teclado.next();

        System.out.println("Insira o Saldo: ");
        Saldo = teclado.nextDouble();

        System.out.println("Olá "+ NomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é "+ Agencia +", conta "+ numero +", e seu saldo "+ Saldo +" já está disponível para saque.");
    }
}
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        int numeroConta;
        System.out.println("Digite o número da sua conta: ");
        numeroConta = scanner.nextInt();
        scanner.nextLine();

        String agencia;
        System.out.println("Digite o número da sua agencia: ");
        agencia = scanner.nextLine();

        String nomeCliente;
        System.out.println("Digite seu nome completo: ");
        nomeCliente = scanner.nextLine();

        double saldo;
        System.out.println("Digite seu saldo: ");
        saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque");

        scanner.close();
    }
}
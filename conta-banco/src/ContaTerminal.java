import java.math.BigDecimal;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da conta");
        Integer conta = scanner.nextInt();
        System.out.println("\n Por favor, digite o número da Agência!");
        String agencia = scanner.next();
        System.out.println("\n Por favor, digite o seu nome!");
        String nome = scanner.next();
        System.out.println("\n Por favor, digite o seu saldo");
        BigDecimal saldo = scanner.nextBigDecimal();

        scanner.close();

        System.out.println("\n Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia
                + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}

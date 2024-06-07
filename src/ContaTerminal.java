import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("Por favor, digite o nome do Cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o número da Agência: ");
        String nomeAgencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta: ");
        int numAgencia = scanner.nextInt();

        System.out.println("Por favor, digite o saldo da Conta: ");
        double saldoConta =  scanner.nextDouble();

        String mensagem = "Olá ".concat(nomeCliente)
                          .concat(", obrigado por criar uma conta em nosso banco, sua agência é ")
                          .concat(nomeAgencia)
                          .concat(", conta ")
                          .concat(String.valueOf(numAgencia))
                          .concat(" e seu saldo ")
                          .concat(String.format("%.2f", saldoConta))
                          .concat(" já está disponível para saque.");

        System.out.println(mensagem);


    }
}

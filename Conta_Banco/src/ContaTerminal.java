
import java.util.Locale;
import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu número:");
        int numero = scanner.nextInt();

        System.out.println("Digite sua agência bancária: ");
        String agencia = scanner.next();

        System.out.println("Digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Caso tenha, digite seu segundo nome (caso contrário apenas aperte a tecla ENTER):");
        String sobrenome = scanner.next();

        System.out.println("Digite seu saldo: ");
        float saldo = scanner.nextFloat();


        // Imprimindo os dados
        System.out.println("Parabéns, você criou uma conta no banco!!!");
        System.out.println("Olá, " + nome + " " +sobrenome + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo R$ " + saldo + " já está disponível para saque.");


    }
}

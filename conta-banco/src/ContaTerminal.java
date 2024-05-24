import java.util.Locale;
import java.util.Scanner;
/**
* <h1>ContaTerminal</h1>
* A ContaTerminal coleta as informações do cliente, como, nome e sobrenome, número da Conta  
* <p>
* e Agência e saldo, e mostra no terminal.
* <p>
* <b>Note:</b> Leia atentamente a documentação desta classes
* para desfrutar dos recursos oferecidos pelo autor
*
* @author  Hendriu Nepuz
* @version 1.0
* @since   24/05/2025
*/
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //Todo: Conhecer e importar a classe scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //Exibir as mensagens para o nosso usuário e coletar via scanner
        System.out.println("Por favor, digite o número da Conta");
        int numeroConta = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agência");
        int numeroAgencia = scanner.nextInt();

        System.out.println("Por favor, digite seu primeiro nome");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, digite seu sobrenome");
        String sobrenomeCliente = scanner.next();

        System.out.println("Por favor, digite o saldo da sua conta");
        float saldoConta = scanner.nextFloat();

        scanner.close();

        //Exibir a mensagem final da conta criada
        System.out.println("Olá, " + nomeCliente + " " + sobrenomeCliente + ", obrigado por criar uma conta no nosso banco.");
        System.out.println("Sua Agência é " + numeroAgencia + ", sua conta é " + numeroConta + ".");
        System.out.println("Seu saldo de " + saldoConta + " já está disponível para saque.");
        

    }
}

import java.util.Scanner; 

public class ContaTerminal {
    public static void main(String[] args){
        
        try (Scanner scanner = new Scanner (System.in)) {

            System.out.println("Por favor, digite seu nome inteiro: ");
            String nome = scanner.nextLine();

            System.out.println("Por favor, digite o numero da conta: ");
            int conta = scanner.nextInt();

            System.out.println("Por favor, prossiga inserindo o numero da agencia: ");
            String agencia = scanner.next();

            System.out.println("Por ultimo, por favor, insira seu saldo: ");
            Double saldo = scanner.nextDouble();

            System.out.println ("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é: " + agencia + ", conta: " + conta + " e seu saldo de: " + saldo + " já esta disponível para saque.");
            
        }  
    }
}

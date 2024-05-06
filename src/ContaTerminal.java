import java.util.Scanner;
public class ContaTerminal {
    
    public static void main(String[] args) throws Exception {
        int numero;
        String agencia;
        String nomeCliente;
        float saldo;

        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, digite o número da Conta!");
        numero = sc.nextInt();
        System.out.println("Por favor, digite o número da Agência!");
        agencia = sc.next();
        System.out.println("Por favor, digite o seu nome");
        nomeCliente = sc.next();
        System.out.println("Por favor, digite o saldo da conta");
        saldo = sc.nextFloat();

        System.out.println("Olá "+ nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta "+ numero +" e seu saldo"+ saldo+" já está disponível para saque");
        sc.close();
    }
}

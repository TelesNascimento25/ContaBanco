import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

       System.out.println("Por favor poderia digitar o seu código de cliente?");
       int numero= scanner.nextInt();
       
       System.out.println("Poderia digite o número da sua Agência por favor?");
       String agencia = scanner.next();
       
       System.out.println("Por gentileza, qual seu nome?");
       String nomeCliente = scanner.next();

       System.out.println("Por favor, qual seria o seu saldo?");
       double saldo = scanner.nextDouble();

       System.out.println(" Ola, " + nomeCliente + " obrigado por criar uma conta em nosso banco Will vou virar programador , sua agencia é: " + agencia + " sua conta é: " + numero + " e seu saldo " + saldo + " já está disponível para saque ");

       scanner.close();


    }
}
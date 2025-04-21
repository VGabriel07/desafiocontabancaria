import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nome = "Alfredo Gama";
        String tipoDaConta = "Corrente";
        double saldoConta = 2550.50;

        System.out.println("==-----------------------==\n");
        System.out.println("Nome do cliente: " + nome);
        System.out.println("Tipo da conta: " + tipoDaConta);
        System.out.println("Saldo atual: " + saldoConta);
        System.out.println("\n==-----------------------==");

        String menu = """
                
                1- Consultar saldo
                2- Receber valor
                3- Fazer transferencia
                4- Sair
                
                Digite a opção desejada:""";

        int opcao = 0;
        Scanner leituraMenu = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leituraMenu.nextInt();

            if (opcao == 1) {
                System.out.println("Seu saldo atual é: " + saldoConta);
            } else if (opcao == 2) {
                System.out.println("Valor recebido: ");
                double valor = leituraMenu.nextDouble();
                saldoConta += valor;
                System.out.println("Para consultar seu saldo atualizado digite '1'");
            } else if (opcao == 3) {
                System.out.println("Valor a transferir: ");
                double valor = leituraMenu.nextDouble();
                if (valor > saldoConta) {
                    System.out.println("Saldo insuficiente");
                } else {
                    saldoConta -= valor;
                    System.out.println("Para consultar seu saldo atualizado digite '1'");
                }
            } else if (opcao != 4) {
                System.out.println("Opção inválida!");
            }
        }
    }
}

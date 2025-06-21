import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nomeCliente = "Carlos";
        String tipoConta = "Corrente";
        double saldo = 2500;

        String dadosCliente = """
                *************************************************
                
                Dados iniciais do cliente:
                
                Nome:                     %s
                Tipo conta:               %s
                Saldo inicial:            %.2f
                
                *************************************************
                
                """.formatted(nomeCliente, tipoConta, saldo);
        System.out.println(dadosCliente);

        int opcao = 0;
        String opercoes = """
                
                Operações
                
                1- Consultar saldo
                2- Receber valor
                3- Transferir valor
                4- Sair
                
                Digite a opção desejada:
                """;
        while (opcao != 4) {
            System.out.println(opercoes);
            opcao = scanner.nextInt();
            
            if (opcao == 1) {
                System.out.println("O saldo atual é de R$ " + saldo);
            } else if (opcao == 2) {
                System.out.println("Informe o valor a receber");
                double recebido = scanner.nextDouble();
                if (recebido >= 0) {
                    saldo += recebido;
                    System.out.println("Saldo atualizado R$ " + saldo);
                } else {
                    System.out.println("Coloque algum valor válido");
                }
            } else if (opcao == 3) {
                System.out.println("Informe o valor a ser transferido");
                double transferido = scanner.nextDouble();
                if (transferido > saldo) {
                    System.out.println("Não há saldo para realizar transferência");
                } else {
                    if (transferido >= 0) {
                        saldo -= transferido;
                        String saldoTransferencia = """
                            Transferência realizada com sucesso
                            Seu novo saldo é R$ %.2f
                            """.formatted(saldo);
                        System.out.println(saldoTransferencia);
                    } else {
                        System.out.println("Coloque algum valor válido");
                    }
                }
            } else if (opcao == 4) {
                System.out.println("Agradeço a preferência");
            } else {
                System.out.println("Operação inválida, por favor escolha uma");
            }
        }
    }
}

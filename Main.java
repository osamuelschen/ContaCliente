import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // cria o leitor
        System.out.println("DADOS PESSOAIS E BANCÁRIOS:");
        System.out.println("-------------------------------");

        
        Cliente cliente1 = new Cliente();
        System.out.println("Nome:");
        cliente1.setNome(sc.nextLine());
        System.out.println("CPF:");
        cliente1.setCpf(sc.nextLine());
        Conta conta1 = new Conta(cliente1, 10000);

        System.out.println("-------------------------------");

        System.out.println("Origem: " + conta1.getCliente().getNome());
        System.out.println("CPF: " + conta1.getCliente().getCpf());
        System.out.println("Saldo inicial: " + conta1.getSaldo());

        System.out.println("-------------------------------");

        Cliente cliente2 = new Cliente();
        System.out.println("Nome:");
        cliente2.setNome(sc.nextLine());
        System.out.println("CPF:");
        cliente2.setCpf(sc.nextLine());
        Conta conta2 = new Conta(cliente2, 8500);

        System.out.println("-------------------------------");
        
        System.out.println("Destino: " + conta2.getCliente().getNome());
        System.out.println("CPF: " + conta2.getCliente().getCpf());
        System.out.println("Saldo inicial: " + conta2.getSaldo());

        System.out.println("-------------------------------");
        System.out.println("TRANSFERÊNCIAS:");
        System.out.println("-------------------------------");

        TransferirDinheiro t = new TransferirDinheiro(conta1, conta2);

        while(true) {
            System.out.println("Deseja fazer uma transferência?\n1-Sim\n2-Nao");
            int opcao = sc.nextInt();

            if(opcao==2) {
                System.out.println("Encerrando operações...");
                break;
            }else if(opcao==1) {
                System.out.println("Digite o valor da transferência:");
                t.setValor(sc.nextDouble());
                t.transferir();
                System.out.println("-------------------------------");
                System.out.println("Saldo final do(a) " + conta1.getCliente().getNome() + ": " + conta1.getSaldo());
                System.out.println("Saldo final do(a) " + conta2.getCliente().getNome() + ": " + conta2.getSaldo());
                System.out.println("-------------------------------");
            } else {
                System.out.println("Opção inválida! Digite 1 para sim ou 0 para não.");
            }
        }
        System.out.println("Ate a proxima!!");


        sc.close();
    }
}

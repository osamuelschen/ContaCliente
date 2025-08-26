public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Samuel", "04429789922");
        Conta conta1 = new Conta(cliente1, 10000);
        Cliente cliente2 = new Cliente("Josiani", "02245629100");
        Conta conta2 = new Conta(cliente2, 400);
        
        System.out.println("Origem: " + conta1.getCliente().getNome());
        System.out.println("CPF: " + conta1.getCliente().getCpf());
        System.out.println("Saldo inicial: " + conta1.getSaldo());

        System.out.println("-------------------------------");

        System.out.println("Destino: " + conta2.getCliente().getNome());
        System.out.println("CPF: " + conta2.getCliente().getCpf());
        System.out.println("Saldo inicial: " + conta2.getSaldo());

        TransferirDinheiro t1 = new TransferirDinheiro(conta1, conta2, 300);

        System.out.println("-------------------------------");

        t1.transferir();

        System.out.println("Saldo final do(a) " + conta1.getCliente().getNome() + ": " + conta1.getSaldo());
        System.out.println("Saldo final do(a) " + conta2.getCliente().getNome() + ": " + conta2.getSaldo());

        TransferirDinheiro t2 = new TransferirDinheiro(conta1, conta2, 600);

        System.out.println("-------------------------------");

        t2.transferir();

        System.out.println("Saldo final do(a) " + conta1.getCliente().getNome() + ": " + conta1.getSaldo());
        System.out.println("Saldo final do(a) " + conta2.getCliente().getNome() + ": " + conta2.getSaldo());

        // System.out.println("Valor a ser transferido: " + );
    }
}

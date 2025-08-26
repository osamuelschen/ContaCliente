public class TransferirDinheiro {
    private Conta contaOrigem;
    private Conta contaDestino;
    private double valor;

    public TransferirDinheiro(Conta contaOrigem, Conta contaDestino, double valor) {
        this.contaOrigem = contaOrigem;
        this.contaDestino = contaDestino;
        this.valor = valor;
    }
    public void transferir() {
        if (valor > 0 && this.contaOrigem.enviar(valor)) {
            this.contaDestino.receber(valor);
            System.out.println("Transferência de R$" + valor + " realizada com sucesso!");
        } else {
            System.out.println("Transferência inválida!");
        }
    } 
    public Conta getContaOrigem() {
        return this.contaOrigem;
    }
    public Conta getContaDestino() {
        return this.contaDestino;
    }
    public double getValor() {
        return this.valor;
    }
}

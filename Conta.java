public class Conta {
    private double saldo;
    private Cliente cliente;

    public Conta(Cliente cliente, double saldo) {
        this.cliente = cliente;
        this.saldo = saldo;
    }
    public Cliente getCliente() {
        return this.cliente;
    }
    public double getSaldo() {
        return this.saldo;
    }
    public void receber(double valor) {
        if (valor > 0) {
            this.saldo += valor;
        }
    }
    public boolean enviar(double valor) {
        if (valor > 0 && this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }
}

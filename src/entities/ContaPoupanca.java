package entities;

public class ContaPoupanca extends Conta {
    private double taxaJuros;

    public ContaPoupanca(Cliente cliente, double taxaJuros) {
        super(cliente);
        this.taxaJuros = taxaJuros;
    }

    @Override
    public void sacar(double valor) {
        if (valor <= getSaldo()) {
            setSaldo(getSaldo() - valor);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    @Override
    public void depositar(double valor) {
        setSaldo(getSaldo() + valor);
    }

    public void aplicarJuros() {
        setSaldo(getSaldo() + (getSaldo() * taxaJuros));
    }
}
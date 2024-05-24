package entities;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public abstract class Conta {

    private static final int AGENCIA_PADRAO = 1901;
    private static int SEQUENCIAL = 1;

    private int numeroAgencia;
    private double saldo;
    private Cliente cliente;

    public Conta(Cliente cliente) {
        this.numeroAgencia = AGENCIA_PADRAO;
        this.saldo = 0.0;
        this.cliente = cliente;
    }

    public abstract void sacar(double valor);

    public abstract void depositar(double valor);

    public void imprimirExtrato() {
        System.out.println("Cliente: " + cliente);
        System.out.println("Número da conta: " + numeroAgencia);
        System.out.println("Saldo: " + String.format("%.2f", saldo));
    }
}




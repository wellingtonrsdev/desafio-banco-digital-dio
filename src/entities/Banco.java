package entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.management.ConstructorParameters;
import java.util.List;


@Data
@Getter
@Setter
public class Banco {

    private String nome;
    private List<Conta> contas;

    public void realizarOperacoes() {
        Cliente cliente1 = new Cliente("João Silva", "123.456.789-00", "Rua A, 123");
        Cliente cliente2 = new Cliente("Maria Oliveira", "987.654.321-00", "Rua B, 456");

        Conta contaCorrente = new ContaCorrente(cliente1);
        ContaPoupanca contaPoupanca = new ContaPoupanca(cliente2, 0.01);

        contaCorrente.depositar(500);
        contaCorrente.sacar(200);

        contaPoupanca.depositar(1000);
        contaPoupanca.aplicarJuros();
        contaPoupanca.sacar(500);

        imprimirExtrato(contaCorrente);
        System.out.println();
        imprimirExtrato(contaPoupanca);
    }

    public void imprimirExtrato(Conta conta) {
        conta.imprimirExtrato();
    }


}

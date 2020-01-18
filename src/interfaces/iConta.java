package interfaces;

import entity.Cliente;
import entity.Conta;
import exception.SaldoInsuficienteException;

public interface iConta {
    void sacar(double valor) throws SaldoInsuficienteException;
    void depositar(double valor);
    void aplicarTaxa(double valor, Cliente EnumCliente );
    void percentualRendimento(double valor);
}

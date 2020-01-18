
package entity;

import java.util.List;
import interfaces.iConta;
import exception.SaldoInsuficienteException;

public abstract class Conta implements iConta{
    private int numero;
    protected double saldo;
    private String tipoConta;

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }
    
   
    
    @Override
    public String toString() {
        return "Numero: " +numero + "  -  R$ " + saldo + "  - "+tipoConta;
    }
    
    @Override
    public void sacar(double valor) throws SaldoInsuficienteException{
        if(valor<=saldo){
           saldo-=valor;
        
        } else{
            throw new SaldoInsuficienteException();
        }
    }
    
    @Override
    public void depositar(double valor){
        saldo+=valor;
        
    }
    
    @Override
    public void aplicarTaxa(double valor, Cliente EnumCliente ){
        
        if(EnumCliente.equals("Especial")){
            saldo -= saldo*3/100;
        }
        else if(EnumCliente.equals("Universitário")){
            saldo -= saldo*1/100;
        }
        else{
            saldo -= saldo*5/100;
        }
    }
    
     @Override
    public void percentualRendimento(double valor){
        saldo += saldo * valor/100;
    }
    
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

 

   
    
}

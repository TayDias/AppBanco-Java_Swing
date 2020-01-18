package entity;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private EnumCliente tipoCliente;
    private String CPF;
    private List<Conta> listacontas;
    protected SeguroDeVida seguroDeVida;

    public Cliente(double valor){
       //seguroDeVida = (SeguroDeVida)"Sem seguro";     // *ligar classe
    }
  
     public double saldoTotal () {
        double total = 0;

        for (Conta conta : listacontas) {
            total += conta.getSaldo();

        }
        return total;
    }
    
    public SeguroDeVida getSeguroDeVida() {
        return seguroDeVida;
    }

    public void setSeguroDeVida(SeguroDeVida seguroDeVida) {
        this.seguroDeVida = seguroDeVida;
    }
   
    @Override
    public String toString() {
        return nome + " ("+tipoCliente+") - "+CPF+" - "+seguroDeVida;
       
    }
    
    public Cliente(){
        listacontas = new ArrayList<Conta>();
    }

      
    public void adicionarConta(Conta conta) {
        listacontas.add(conta);
    }
    
     public List<Conta> getListarContas() {
        return listacontas;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public EnumCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(EnumCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }


}

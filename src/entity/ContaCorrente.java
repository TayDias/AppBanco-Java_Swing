
package entity;

import entity.SeguroDeVida;

public class ContaCorrente extends Conta{
    private double taxaMautencao;
    
    
    public double getTaxaMautencao() {
        return taxaMautencao;
    }

    public void setTaxaMautencao(double taxaMautencao) {
        this.taxaMautencao = taxaMautencao;
    }

    
     public double calcularTributo(double valor){
        //if(valor>0){
           //saldo= valor - valor*0.02;
        
       // } else{
           saldo= valor - valor*0.005;
        //}
        return saldo;
        
    }

}

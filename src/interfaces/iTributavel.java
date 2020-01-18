package interfaces;

import entity.Cliente;
import entity.SeguroDeVida;

public interface iTributavel {
    double calcularTributo(double valor, SeguroDeVida seguro);
    
}

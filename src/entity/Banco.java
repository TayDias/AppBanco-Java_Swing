
package entity;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    
     private List<Cliente> listaClientes;
     
      public Banco(){
       
        listaClientes = new ArrayList<Cliente>();        
    }

    public List<Cliente> getListaclientes() {
        return listaClientes;
    }
    
     //Cliente
     public void excluirCliente(Cliente cliente) {
        listaClientes.remove(cliente);
    }
     
   
    public List<Cliente> buscarPorNome(String nome) {
        List<Cliente> clientesEncontrados = new ArrayList<Cliente>();
        for (Cliente cliente : listaClientes) {
            if(cliente.getNome().startsWith(nome)) {
                clientesEncontrados.add(cliente);
            }
        }
        return clientesEncontrados;
    }

    public void adicionarCliente(Cliente objCliente) {
        listaClientes.add(objCliente);   
    }

      
}

import java.util.ArrayList;

public class Clinica {
     String proprietario;
    ArrayList<Cliente> listaDeClientes = new ArrayList<>();


    Clinica(String proprietario){
        this.proprietario = proprietario;
    }

    public void adicionarCliente(Cliente cliente){
        listaDeClientes.add(cliente);

    }

    public String getProprietario() {
        return proprietario;
    }

    public ArrayList<Cliente> getListaDeClientes() {
        return listaDeClientes;
    }

    public void categorizarClientes(){
        for (Cliente cliente:listaDeClientes
             ) {
            String categoria = cliente.calcularIMC();
            System.out.println(categoria);

        }
    }

    public void tratamento(Cliente cliente){
        System.out.println("Antes: " + cliente.getPeso());
        cliente.setPeso(cliente.getPeso() - 5);
        System.out.println("Depois: " + cliente.getPeso());
    }

    public void tratamento2(Cliente cliente, Double pesoReduzido){
        System.out.println("Antes: " + cliente.getPeso());
        cliente.setPeso(cliente.getPeso() - pesoReduzido);
        System.out.println("Depois: " + cliente.getPeso());
    }

}

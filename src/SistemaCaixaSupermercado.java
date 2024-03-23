import java.util.HashMap;

public class SistemaCaixaSupermercado {

   private HashMap<String, Cliente> tabelaHash = new HashMap<>();

   Cliente clienteAux = new Cliente("nome", "cpf", "email","celular");

   public SistemaCaixaSupermercado() {
   }

   public void cadastrarCliente(Cliente clienteAux) {
      this.tabelaHash.put(clienteAux.getCpf(), clienteAux);
   }

   public Cliente buscarCliente(String cpf) {
      return (Cliente)this.tabelaHash.get(cpf);
   }

 


   
}

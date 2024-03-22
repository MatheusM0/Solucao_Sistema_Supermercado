public class Main {
    public static void main(String[] args) throws Exception {
        
        SistemaCaixaSupermercado sistema = new SistemaCaixaSupermercado();

        // Exemplo de cadastro de cliente
        Cliente cliente1 = new Cliente("João", "123.456.789-00","joao.fulano@gmail.com");
        sistema.cadastrarCliente(cliente1);

        // Exemplo de busca de cliente pelo CPF
        String cpfBusca = "123.456.789-00";
        Cliente clienteEncontrado = sistema.buscarCliente(cpfBusca);
        if (clienteEncontrado != null) {
            System.out.println("-------------------------------"+"\n"+"Cliente encontrado: " + "\n" + clienteEncontrado + "\n" + "-------------------------------");
        } else {
            System.out.println("-------------------------------"+"\n"+"Cliente não encontrado."+"\n"+"-------------------------------");
        }

    }

  

}

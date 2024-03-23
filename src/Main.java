public class Main {
    public static void main(String[] args) throws Exception {
        
        SistemaCaixaSupermercado sistema = new SistemaCaixaSupermercado();

        // Exemplo de cadastro de cliente
        Cliente cliente1 = new Cliente("João", "123.456.789-00","joao.fulano@gmail.com","88 91234-5678");
        sistema.cadastrarCliente(cliente1);
        Cliente cliente2 = new Cliente("Marcos", "321.589.444-01", "marcos@hotmail.com", "21 7844-2321");
        sistema.cadastrarCliente(cliente2);
        Cliente cliente3 = new Cliente("Matheus", "456.284.025-66", "matheus@unifor.br", "85 98123-4412");
        sistema.cadastrarCliente(cliente3);


        // Exemplo de busca de cliente pelo CPF
        String cpfBusca = "321.589.444-01";
        Cliente clienteEncontrado = sistema.buscarCliente(cpfBusca);
        if (clienteEncontrado != null) {
            System.out.println("-------------------------------"+"\n"+"Cliente encontrado: " + "\n" + clienteEncontrado + "\n" + "-------------------------------");
        } else {
            System.out.println("-------------------------------"+"\n"+"Cliente não encontrado."+"\n"+"-------------------------------");
        }
    }
}

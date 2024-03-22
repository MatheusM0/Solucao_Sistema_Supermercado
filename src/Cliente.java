public class Cliente {

    private String nome;
    private String cpf;
    private String email;

        
    public Cliente(String nome, String cpf, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }
        
    public String getNome() {
        return this.nome;
    }
    
    public String getCpf() {
        return this.cpf;
    }

    public String getEmail() {
        return this.email;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\n" + "CPF: " + cpf + "\n"+ "E-mail: " + email;
    }

    
}
    

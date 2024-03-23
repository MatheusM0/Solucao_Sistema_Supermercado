public class Cliente {

    private String nome;
    private String cpf;
    private String email;
    private String celular;

        
    public Cliente(String nome, String cpf, String email, String celular) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.celular = celular;
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

    public String getCelular() {
        return this.celular;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\n" + "CPF: " + cpf + "\n"+ "E-mail: " + email + "\n" + "Celular: " + celular;
    }

    
}
    


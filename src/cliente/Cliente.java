
package cliente;

import java.time.LocalDate;

public class Cliente {
    
    private String nConta;
    private String senha;
    private String nome, cpf;
    private LocalDate nascimento;

    public Cliente() {
        this.nConta = "";
        this.senha = "";
        this.nome = "";
        this.cpf = "";
        LocalDate localDate = LocalDate.now();
        this.nascimento = localDate;
        
    }
    
    public Cliente(String nConta, String senha, String nome, String cpf, LocalDate nascimento) {
        this.nConta = nConta;
        this.senha = senha;
        this.nome = nome;
        this.cpf = cpf;
        this.nascimento = nascimento;
    }

    public String getnConta() {
        return nConta;
    }

    public void setnConta(String nConta) {
        this.nConta = nConta;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nConta=" + nConta + ", senha=" + senha + ", nome=" + nome + ", cpf=" + cpf + ", nascimento=" + nascimento + '}';
    }

    
    
}

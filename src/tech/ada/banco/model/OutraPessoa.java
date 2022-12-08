package tech.ada.banco.model;

public class OutraPessoa {
    private String nome;
    private String telefone;
    private String cpf;
    private String dataNascimento;

    public OutraPessoa(String nome, String cpf, String dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return "OutraPessoa{" +
                "nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                ", cpf='" + cpf + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                '}';
    }

    public String toStringg() {
        return "Nome: " + nome + "\n" +
                "Telefone: " + telefone + "\n" +
                "CPF: " + cpf + "\n" +
                "Data Nascimento: " + dataNascimento;
    }
}

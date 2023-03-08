package br.com.fiap.wholecake.model;

import java.time.LocalDate;
import java.util.StringJoiner;

public class Usuario {

    private int id;
    private String nome;
    private String username;
    private String senha;
    private LocalDate dataNascimento;

    public Usuario() {
    }

    public Usuario(int id, String nome, String username, String senha, LocalDate dataNascimento) {
        this.id = id;
        this.nome = nome;
        this.username = username;
        this.senha = senha;
        this.dataNascimento = dataNascimento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Usuario.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("nome='" + nome + "'")
                .add("username='" + username + "'")
                .add("senha='" + senha + "'")
                .add("dataNascimento=" + dataNascimento)
                .toString();
    }
}

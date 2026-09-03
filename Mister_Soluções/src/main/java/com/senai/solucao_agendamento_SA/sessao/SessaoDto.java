package com.senai.solucao_agendamento_SA.sessao;

public class SessaoDto {
    private Long id;
    private String nome;
    private String email;
    private String matricula;

    public SessaoDto() {}

    public SessaoDto(Long id, String nome, String email, String matricula) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.matricula = matricula;
    }

    public Long getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public String getEmail() {
        return email;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}

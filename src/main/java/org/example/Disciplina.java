package org.example;

public class Disciplina {

    private String codigo;
    private String nome;
    private String cargaHoraria;
    private Pessoa.Professor professor;

    // Ajustamos no Construtor
    public Disciplina(String codigo, String nome, String cargaHoraria, Pessoa.Professor professor) {
        this.codigo = codigo;
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.professor = professor;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(String cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    // Ajustamos no Getter
    public Pessoa.Professor getProfessor() {
        return professor;
    }

    // Ajustamos no Setter
    public void setProfessor(Pessoa.Professor professor) {
        this.professor = professor;
    }
}
package org.example;

public class Curso {
    private String codigo;
    private String nome;
    private String cargaHoraria;

    public Curso(String cargaHoraria, String nome, String codigo) {
        this.cargaHoraria = cargaHoraria;
        this.nome = nome;
        this.codigo = codigo;
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
}

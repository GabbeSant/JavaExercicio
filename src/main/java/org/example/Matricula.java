package org.example;

public class Matricula {

    private String codigo;
    private Pessoa.Aluno aluno;
    private Disciplina disciplina;
    private Double nota1;
    private Double nota2;

    public Matricula(String codigo, Pessoa.Aluno aluno, Disciplina disciplina, Double nota1, Double nota2) {
        this.codigo = codigo;
        this.aluno = aluno;
        this.disciplina = disciplina;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Double getNota1() {
        return nota1;
    }

    public void setNota1(Double nota1) {
        this.nota1 = nota1;
    }

    public Double getNota2() {
        return nota2;
    }

    public void setNota2(Double nota2) {
        this.nota2 = nota2;
    }

    // --- CORREÇÃO AQUI: Pessoa.Aluno ---
    public Pessoa.Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Pessoa.Aluno aluno) {
        this.aluno = aluno;
    }

    // --- Adicionado: Get e Set de Disciplina ---
    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public double calcularMedia() {
        return (this.nota1 + this.nota2) / 2;
    }

    public void exibirSituacaoAcademica() {
        var media = this.calcularMedia();

        System.out.printf("Média Final: %.2f - ", media);

        if (media >= 7) {
            System.out.println("Aprovado");
        } else if (media >= 5) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }
    }
}
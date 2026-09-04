package org.example;

public class Pessoa {


    private String nome;
    private String cpf;
    private String email;
    public Pessoa(String nome, String cpf, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public void exibirDados(){
        System.out.printf("Nome: %s \n CPF: %s \n Email: %s", nome, cpf, email);
    }

    public static class Aluno extends Pessoa {


        private String matricula;
        private Curso curso;

        public Aluno(String nome, String cpf, String email, String matricula, Curso curso) {
            super(nome, cpf, email);
            this.matricula = matricula;
            this.curso = curso;
        }
        public String getMatricula() { return matricula; }
        public void setMatricula(String matricula) { this.matricula = matricula; }
        public Curso getCurso() { return curso; }
        public void setCurso(Curso curso) { this.curso = curso; }

        @Override
        public void exibirDados(){
            super.exibirDados();

            System.out.printf("\n Matrícula: %s \n Curso: %s \n", matricula, curso);
        }
    }

    public static class Professor extends Pessoa {

        private Double salario;
        private String especialidade;

        public Professor(String nome, String cpf, String email, Double salario, String especialidade) {
            super(nome, cpf, email);
            this.salario = salario;
            this.especialidade = especialidade;
        }
        public Double getSalario() { return salario; }
        public void setSalario(Double salario) { this.salario = salario; }
        public String getEspecialidade() { return especialidade; }
        public void setEspecialidade(String especialidade) { this.especialidade = especialidade; }

        @Override
        public void exibirDados(){
            super.exibirDados();

            System.out.printf("\n Especialidade: %s \n Salário: R$ %.2f \n", especialidade, salario);
        }
    }
}
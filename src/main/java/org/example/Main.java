package org.example;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList; // Apaguei aquela importação estranha que estava aqui!

public class Main {

    public static void main(String[] args) {

        // --- 1. CRIANDO OS OBJETOS ---
        Curso curso = new Curso("2000 horas", "Análise de Sistemas (ADS)", "CURSO-01");

        Pessoa.Professor professor1 = new Pessoa.Professor("Rafael Bento", "123456789", "rafael@teste.com", 20000.0, "Backend");
        Pessoa.Professor professor2 = new Pessoa.Professor("Nisflei Silve", "123456799", "nis@teste.com", 10000.0, "DevOPS");

        Disciplina disciplina1 = new Disciplina("1", "Engenharia de Software", "100h", professor1);
        Disciplina disciplina2 = new Disciplina("2", "DevOPS", "100h", professor2);
        Disciplina disciplina3 = new Disciplina("3", "Backend", "100h", professor1);

        Pessoa.Aluno aluno1 = new Pessoa.Aluno("Gabriel Espingarda", "416451651", "gabriel@gmail.com", "123", curso);
        Pessoa.Aluno aluno2 = new Pessoa.Aluno("Bruno Santificado", "612015064", "bruno@gmail.com", "456", curso);
        Pessoa.Aluno aluno3 = new Pessoa.Aluno("Arthur Royale", "72564951", "arthur@gmail.com", "789", curso);


        // --- 2. O MENU INTERATIVO ---
        Scanner scanner = new Scanner(System.in);
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n=== SISTEMA UNIVERSIDADE ===");
            System.out.println("1 - Exibir Dados dos Professores");
            System.out.println("2 - Exibir Dados dos Alunos");
            System.out.println("3 - Simular Matrículas e Notas");
            System.out.println("4 - Testar Pagamentos");
            System.out.println("5 - Listar Pessoas");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\n--- Professores ---");
                    professor1.exibirDados();
                    System.out.println("\n-------------------");
                    professor2.exibirDados();
                    break;
                case 2:
                    System.out.println("\n--- Alunos Cadastrados ---");
                    aluno1.exibirDados();
                    System.out.println("\n-------------------");
                    aluno2.exibirDados();
                    System.out.println("\n-------------------");
                    aluno3.exibirDados();
                    break;
                case 3:
                    System.out.println("\n--- Situação das Matrículas ---");

                    // Matrícula 1 (Aprovado)
                    Matricula matricula1 = new Matricula("MAT-001", aluno1, disciplina1, 8.5, 7.0);
                    System.out.printf("\nAluno: %s | Disciplina: %s - ", matricula1.getAluno().getNome(), matricula1.getDisciplina().getNome());
                    matricula1.calcularMedia();

                    // Matrícula 2 (Reprovado)
                    Matricula matricula2 = new Matricula("MAT-002", aluno2, disciplina2, 4.0, 3.5);
                    System.out.printf("Aluno: %s | Disciplina: %s - ", matricula2.getAluno().getNome(), matricula2.getDisciplina().getNome());
                    matricula2.calcularMedia();

                    // Matrícula 3 (Recuperação)
                    Matricula matricula3 = new Matricula("MAT-003", aluno3, disciplina3, 6.0, 5.0);
                    System.out.printf("Aluno: %s | Disciplina: %s - ", matricula3.getAluno().getNome(), matricula3.getDisciplina().getNome());
                    matricula3.calcularMedia();
                    break;

                case 4:
                    System.out.println("\n--- Pagamentos ---");
                    System.out.println("Escolha sua forma de pagamento \n 1-PIX \n 2-Cartao \n 3-Boleto \n 4-sair \n digite sua opção: ");

                    int forma = scanner.nextInt(); // <-- Adicionado o 'int' aqui

                    switch (forma) {
                        case 1:
                            PagamentoPix pix = new PagamentoPix();
                            pix.pagar(1500.50);
                            break;
                        case 2:
                            PagamentoCartao cartao = new PagamentoCartao();
                            cartao.pagar(2000.00);
                            break;
                        case 3:
                            PagamentoBoleto boleto = new PagamentoBoleto();
                            boleto.pagar(3000.00);
                            break;
                        case 4:
                            break;
                    }
                    break;
                case 5:
                    System.out.println("\n--- Lista de Todas as Pessoas ---");


                    List<Pessoa> listaPessoas = new ArrayList<>();

                    listaPessoas.add(professor1);
                    listaPessoas.add(professor2);
                    listaPessoas.add(aluno1);
                    listaPessoas.add(aluno2);
                    listaPessoas.add(aluno3);

                    for (Pessoa pessoaDaVez : listaPessoas) {
                        pessoaDaVez.exibirDados();
                        System.out.println("\n-------------------");
                    }
                    break;
                case 0:
                    System.out.println("Encerrando o sistema.");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }

        scanner.close();
    }
}
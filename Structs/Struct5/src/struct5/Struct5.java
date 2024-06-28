package struct5;
import java.util.Scanner;

class Aluno {
    int matricula;
    String nome;
    float nota1;
    float nota2;
    float nota3;
    float media;
}

public class Struct5 {
    static final int NUM_ALUNOS = 5;
    
    /**
     *
     * @param aluno
     */
    public static void lerAluno(Aluno aluno) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a matricula do aluno: ");
        aluno.matricula = scanner.nextInt();
        System.out.print("Digite o nome do aluno: ");
        aluno.nome = scanner.next();
        System.out.print("Digite a nota da primeira prova: ");
        aluno.nota1 = scanner.nextFloat();
        System.out.print("Digite a nota da segunda prova: ");
        aluno.nota2 = scanner.nextFloat();
        System.out.print("Digite a nota da terceira prova: ");
        aluno.nota3 = scanner.nextFloat();
        
        aluno.media = (aluno.nota1 + aluno.nota2 + aluno.nota3) / 3;
        System.out.println();
    }
    /**
     *
     * @param alunos
     * @return
     */
    public static Aluno encontrarMaiorNota1(Aluno[] alunos) {
        Aluno maiorNota1 = alunos[0];
        for (int i = 1; i < NUM_ALUNOS; i++) {
            if (alunos[i].nota1 > maiorNota1.nota1) {
                maiorNota1 = alunos[i];
            }
        }
        return maiorNota1;
    }

    /**
     *
     * @param alunos
     * @return
     */
    public static Aluno encontrarMaiorMedia(Aluno[] alunos) {
        Aluno maiorMedia = alunos[0];
        for (int i = 1; i < NUM_ALUNOS; i++) {
            if (alunos[i].media > maiorMedia.media) {
                maiorMedia = alunos[i];
            }
        }
        return maiorMedia;
    }

    /**
     *
     * @param alunos
     * @return
     */
    public static Aluno encontrarMenorMedia(Aluno[] alunos) {
        Aluno menorMedia = alunos[0];
        for (int i = 1; i < NUM_ALUNOS; i++) {
            if (alunos[i].media < menorMedia.media) {
                menorMedia = alunos[i];
            }
        }
        return menorMedia;
    }

    /**
     *
     * @param aluno
     */
    public static void verificarAprovacao(Aluno aluno) {
        if (aluno.media >= 7) {
            System.out.printf("%s foi aprovado(a)!\n", aluno.nome);
        } else {
            System.out.printf("%s foi reprovado(a)!\n", aluno.nome);
        }
    }

    public static void main(String[] args) {
        Aluno[] alunos = new Aluno[NUM_ALUNOS];
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Entre com os dados dos alunos.");
        for (int i = 0; i < NUM_ALUNOS; i++) {
            System.out.printf("Aluno %d.\n", i + 1);
            alunos[i] = new Aluno();
            lerAluno(alunos[i]);
        }
        
        Aluno alunoMaiorNota1 = encontrarMaiorNota1(alunos);
        System.out.printf("Aluno com maior nota na primeira prova: %s\n", alunoMaiorNota1.nome);
        
        Aluno alunoMaiorMedia = encontrarMaiorMedia(alunos);
        System.out.printf("Aluno com maior media geral: %s\n", alunoMaiorMedia.nome);
        
        Aluno alunoMenorMedia = encontrarMenorMedia(alunos);
        System.out.printf("Aluno com menor media geral: %s\n", alunoMenorMedia.nome);
        
        System.out.println("Situacao dos alunos.");
        for (int i = 0; i < NUM_ALUNOS; i++) {
            System.out.printf("%s - ", alunos[i].nome);
            verificarAprovacao(alunos[i]);
        }
    }
}

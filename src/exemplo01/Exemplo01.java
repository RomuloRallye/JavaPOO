package exemplo01;

import classes.Aluno;
import classes.Disciplina;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Rallye
 * Cadastro de alunos, sua idade e suas respectivas disciplinas.
 */
public class Exemplo01 {

    public static void main(String[] args) {
        //===============
        List<Aluno> alunos = new ArrayList<Aluno>();
        //===============
        int cadastroAluno;
        //===============
        System.out.println("//======Cadastro de aluno======//");
        do {
            //===============
            Aluno a = new Aluno();
            //===============
            Scanner g = new Scanner(System.in);
            //===============
            System.out.println("Qual o nome do aluno? ");
            a.setNome(g.nextLine());
            System.out.println("Qual a idade do aluno?");
            a.setIdade(g.nextInt());
            //===============
            alunos.add(a);
            //===============
            int cadastroDisciplina;
            //===============
            System.out.println("//======Cadastro da disciplina======//");
            //===============
            do {
                //===============
                Disciplina d = new Disciplina();
                //===============
                Scanner g2 = new Scanner(System.in);
                //===============
                System.out.println("Qual nome da disciplina?");
                d.setDisciplina(g2.nextLine());
                System.out.println("Qual a nota da disciplina ?");
                d.setNota(g2.nextDouble());
                //===============
                a.getDisciplina().add(d);
                //===============
                System.out.println("Deseja adicionar outra disciplina?");
                System.out.println("Digite 1 para sim ou 0 para não");
                cadastroDisciplina = g2.nextInt();
                //===============
            } while (cadastroDisciplina == 1);
            //===============
            System.out.println("Deseja adicionar outro aluno?");
            System.out.println("Digite 1 para sim ou 0 para não");
            cadastroAluno = g.nextInt();
        } while (cadastroAluno == 1);
        //===============
        System.out.println("=============================");
        //===============
        for (Aluno aluno : alunos) {
            System.out.println("Aluno: " + aluno.getNome());
            System.out.println("Idade: " + aluno.getIdade());
            System.out.println("Media = " + aluno.media());
            System.out.println("Resultado = " + (aluno.aprovacao() ? "Aprovado" : "Reprovado"));
            System.out.println("=======");
            //===============
            for (Disciplina disciplina : aluno.getDisciplina()) {
                System.out.println("Disciplina: " + disciplina.getDisciplina());
                System.out.println("Nota: " + disciplina.getNota());
            }
            //===============
            System.out.println("=============================");
            //===============
        }
    }

}

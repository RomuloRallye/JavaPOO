package classes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rallye
 */
public class Aluno {
    //===============
    private String nome;
    private int idade;
    //===============
    private List <Disciplina> disciplinas = new ArrayList<>();
    //===============

    public List<Disciplina> getDisciplina() {
        return disciplinas;
    }

    public void setDisciplina(List<Disciplina> disciplina) {
        this.disciplinas = disciplina;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    //===============
    public Double media(){
        Double media = 0.0;
        //===============
        for (Disciplina d : disciplinas) {
            media +=d.getNota();
        }
        return media/disciplinas.size();
    }
    public boolean aprovacao(){
        double media = this.media();
        if (media >= 8.4)
            return true;
        else
            return false;
    }
    //===============

    @Override
    public String toString() {
        return "Aluno{" + "nome=" + nome + ", idade=" + idade + ", disciplina=" + disciplinas + '}';
    }
    
}

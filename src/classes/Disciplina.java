package classes;
/**
 *
 * @author Rallye
 */
public class Disciplina {
    //=================
    private String disciplina;
    private Double nota;
    //=================
    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }
    //=================

    @Override
    public String toString() {
        return "Disciplina{" + "disciplina=" + disciplina + ", nota=" + nota + '}';
    }
}

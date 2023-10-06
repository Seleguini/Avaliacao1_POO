//Gabriel Seleguini Monteiro RA11320007
package questao2;

public class Main {
    public static void main(String[] args) {

    Professor prof = new Professor("Michelle","michelle@newtonpaiva.br", "pontoextraproGabriel", 800, 40);

    Aluno aln = new Aluno("Gabriel", "gabrielseleguini@hotmail.com", "michellemedaumponto", 3, 1);

    System.out.printf(prof.mostraProfessor());
    System.out.println(aln.mostraAluno());
    }
}
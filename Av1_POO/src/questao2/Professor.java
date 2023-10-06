//Gabriel Seleguini Monteiro RA11320007
package questao2;

public class Professor extends Pessoa{
    private float salarioHora;
    private int horasAula;

    public Professor(String nome, String email, String senha, float salarioHora, int horasAula) {
        super(nome, email, senha);
        this.salarioHora = salarioHora;
        this.horasAula = horasAula;
    }

    public float getSalarioHora() {
        return salarioHora;
    }

    public void setSalarioHora(float salarioHora) {
        this.salarioHora = salarioHora;
    }

    public int getHorasAula() {
        return horasAula;
    }

    public void setHorasAula(int horasAula) {
        this.horasAula = horasAula;
    }

    public float calculaSalario(){
        return getSalarioHora() * getHorasAula();
    }

    public String mostraProfessor(){
        return "\n Nome= " + getNome() +
                "\n E-mail= " + getEmail() +
                "\n Salário= " + calculaSalario();
    }
}

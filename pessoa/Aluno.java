package pessoa;

//Herança
public class Aluno extends Pessoa{
    private String matricula;

    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    // Sobreescreveu
    String imprimirDadosPessoas(){
        System.out.println(super.imprimirDadosPessoas());
        return "Você é aluno";
    }


}

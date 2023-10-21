package pessoa;

//Herança
public class Professor extends Pessoa {
    private double salario;

    public double getSalario(){
        return salario;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

    // Sobreescreveu
    String imprimirDadosPessoas(){
        System.out.println(super.imprimirDadosPessoas());
        return "Você é professor";
    }
}

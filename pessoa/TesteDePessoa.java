package pessoa;

public class TesteDePessoa {

    //Entendendo POO
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.setCpf("333222211"); 
        professor.setNome("Daniele");
        professor.setIdade(33);
        professor.setSalario(50000);

        System.out.println(professor.imprimirDadosPessoas());

        Aluno aluno = new Aluno();
        aluno.setCpf("11556655");
        aluno.setIdade(19);
        aluno.setNome("Fernanda");
        aluno.setMatricula("898989");
        System.out.println(aluno.imprimirDadosPessoas());
    }
}

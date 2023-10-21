package primeirasAulas;
/*
 * HelloWorld = Nome da minha classe
 * public = Tipo de acesso da classe
 * class = Tipo da classe
 */
public class HelloWorld{
    // Todo conteúdo deverá ser inserido aqui dentro
    public static void main(String[] args){
        /*
         * Valores (int, double, float, long)
         * Texto (String)
         * Boleano (boolean)
         */
        int dadoTipoInt = 10;
        double dadoDoTipoDouble = 3.14;
        float dadoDoTipoFloat = 3.14f;
        long dadoDoTipoLong = 8934723423949L;
        String dadoDoTipoString = "Colocar o meu texto";
        boolean dadoDoTipoBoolean = false;

        // if - else
        /*if(dadoTipoInt == 10){
            // sysout
            System.out.println("Entrou no if do 10");
        }
        if(dadoTipoInt < 12){
            System.out.println("Entrou no if do 12");
        }
        else{
            System.out.println("Entrou no else");
        }*/
        //While (Enquanto algo for verdadeiro, faça alguma coisa)
        /*int valorInicial = 0;
        while(valorInicial < 3){
            System.out.println("O valor inicial é menor que 3");
            System.out.println(valorInicial);
            valorInicial++;
        }
        System.out.println("Saiu do while");*/

        //For
        System.out.println("Iniciando o FOR");
        for(int i = 0; i < 4; i++){
            System.out.println("O valor de i é: " +i);
        }
    }
}
// Fora do escopo da classe
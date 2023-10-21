package conta;

public class ContaBancaria {
    private String numero;
    private String titular;
    private double saldo;

    // Getters e Setters

    public ContaBancaria(){
        this.saldo = 0.0;
    } 

    public void setNumero(String numero){
        this.numero = numero;
    }

    public String getNumero(){
        return this.numero;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    // Depositar
    void depositar(double valor){
        if(valor >0){
            saldo = saldo + valor;
            System.out.println("Depósito de R$ " + valor + ". Saldo atual R$ " + saldo);
        }else{
            System.out.println("O valor do depósito é invalido");
        }
    }

    // Sacar
    void sacar(double valor){
        if(valor > 0 && valor <= saldo){
            saldo = saldo - valor;
            System.out.println("Saque de R$ " + valor + ". Saldo atual R$ " + saldo);
        }
    }
}

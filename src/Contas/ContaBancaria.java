package Contas;

// Classe abastrata ContaBancaria
public abstract class ContaBancaria {
	// Atributo da classe ContaBancaria
    protected double saldo;
    
    //Construtor da classe ContaBancaria
    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    //Metodos da classe ContaBancaria
    public abstract void sacar(double valor);
    public abstract void depositar(double valor);
    public abstract void consultarSaldo();
    
    //Getter
    public double getSaldo() {
        return saldo;
    }
}
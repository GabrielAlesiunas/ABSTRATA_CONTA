package Contas;

//Classe abastrata ContaCorrente com heranca da classe ContaBancaria
public class ContaCorrente extends ContaBancaria {
	//Atributos da classe ContaCorrente
    private double limite;
    private final double taxaSaque = 7.0;
    private final double taxaDeposito = 3.0;
    private final double taxaConsulta = 1.0;

    //Construtor da classe ContaCorrente
    public ContaCorrente(double saldoInicial, double limite) {
        super(saldoInicial);
        this.limite = limite;
    }

    //Metodo de sacar da ContaCorrente
    @Override
    public void sacar(double valor) {
        double totalComTaxa = valor + taxaSaque;
        if (saldo + limite >= totalComTaxa) {
            saldo -= totalComTaxa;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso. Taxa de saque: R$ " + taxaSaque);
        } else {
            System.out.println("Saldo insuficiente para realizar o saque.");
        }
    }

    //Metodo de depositar da ContaCorrente
    @Override
    public void depositar(double valor) {
        saldo += valor - taxaDeposito;
        System.out.println("Depósito de R$ " + valor + " realizado com sucesso. Taxa de depósito: R$ " + taxaDeposito);
    }
    
    //Metodo consultarSaldo da ContaCorrente
    @Override
    public void consultarSaldo() {
        saldo -= taxaConsulta;
        System.out.println("Saldo disponível: R$ " + saldo + ". Taxa de consulta: R$ " + taxaConsulta);
    }
}

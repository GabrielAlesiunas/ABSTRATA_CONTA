package Contas;

//Classe abastrata ContaPoupanca com heranca da classe ContaBancaria
public class ContaPoupanca extends ContaBancaria {
	//Atributos da classe ContaCorrente
    private final double taxaSaque = 4.0;
    private final double taxaDeposito = 1.5;
    private final double taxaConsulta = 0.5;
    
    //Construtor da classe ContaCorrente
    public ContaPoupanca(double saldoInicial) {
        super(saldoInicial);
    }

    //Metodo de sacar da ContaPoupanca
    @Override
    public void sacar(double valor) {
        double totalComTaxa = valor + taxaSaque;
        if (saldo >= totalComTaxa) {
            saldo -= totalComTaxa;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso. Taxa de saque: R$ " + taxaSaque);
        } else {
            System.out.println("Saldo insuficiente para realizar o saque.");
        }
    }

    //Metodo de depositar da ContaPoupanca
    @Override
    public void depositar(double valor) {
        saldo += valor - taxaDeposito;
        System.out.println("Depósito de R$ " + valor + " realizado com sucesso. Taxa de depósito: R$ " + taxaDeposito);
    }
    
 	//Metodo consultarSald da ContaPoupanca
    @Override
    public void consultarSaldo() {
        saldo -= taxaConsulta;
        System.out.println("Saldo disponível: R$ " + saldo + ". Taxa de consulta: R$ " + taxaConsulta);
    }
}

package Contas;

// Classe Main para teste do programa
public class Main {
    public static void main(String[] args) {
    	// Instanciando a ContaCorrete e a ContaPoupanca
    	ContaCorrente cc = new ContaCorrente(100.0, 50.0);
        ContaPoupanca cp = new ContaPoupanca(1000.0);
        
        //Chamando os metodos da conta corrente
        System.out.println("---- Conta Corrente ----");
        cc.consultarSaldo();
        cc.depositar(200.0);
        cc.sacar(50.0);
        cc.consultarSaldo();

        System.out.println("");
        
        //Chamando os metodos da conta poupanca
        System.out.println("---- Conta Poupança ----");
        cp.consultarSaldo();
        cp.depositar(5000.0);
        cp.sacar(500.0);
        cp.consultarSaldo();
    }
}
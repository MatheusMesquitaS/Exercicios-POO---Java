package exercicio04OrientacaoAObjetos;

public class ContaBancaria {
	public double saldo;
	public String numeroConta;
	
	
	double depositar(double deposito) {
	return saldo += deposito;	
		
		
	}
	double sacar(double saque) {
		return saldo -= saque;
	}
}

package entities;

public class ContaBancaria {
	private int numConta;
	private String nome;
	private double saldo;
	
	public ContaBancaria(int numConta, String nome) {
		this.numConta = numConta;
		this.nome = nome;
	}

	/*public int getNumConta() {
		return numConta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}*/ // algum desses é necessário???
	
	public void adicionarSaldo(double saldo) {
		this.saldo += saldo;
	}
	
	public void removerSaldo(double saldo) {
		this.saldo -= saldo + 5.0;
	}
	
	public String toString() {
		return "Account "
				+ numConta
				+ ", Holder: "
				+ nome
				+ ", Balance: $ "
				+ String.format("%.2f%n", saldo);
	}
}

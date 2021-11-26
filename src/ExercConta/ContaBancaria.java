package ExercConta;

public class ContaBancaria {

	private int agencia;
	private int NumeroDaConta;
	private double saldo;
	protected Pessoa correntista;
	protected Banco banco;
	
	public ContaBancaria() {
		banco = new Banco();
		correntista = new Pessoa();
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumeroDaConta() {
		return NumeroDaConta;
	}

	public void setNumeroDaConta(int numeroDaConta) {
		NumeroDaConta = numeroDaConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Pessoa getCorrentista() {
		return correntista;
	}

	public void setCorrentista(Pessoa correntista) {
		this.correntista = correntista;
	}

	public Banco getBanco() {
		return banco;
	}

	public void setBanco(Banco banco) {
		this.banco = banco;
	}
	
	public boolean deposito(double valor) {
		if (valor > 0) {
			setSaldo(getSaldo() + valor);
			return true;
		} else {
			return false;
		}
	}

	public boolean saque(double valor) {
		if (valor <= getSaldo()) {
			setSaldo(getSaldo() - valor);
			return true;
		}
		return false;

	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ContaBancaria [agencia=");
		builder.append(agencia);
		builder.append(", NumeroDaConta=");
		builder.append(NumeroDaConta);
		builder.append(", saldo=");
		builder.append(saldo);
		builder.append(", correntista=");
		builder.append(correntista);
		builder.append(", banco=");
		builder.append(banco);
		builder.append("]");
		return builder.toString();
	}

	
	
	
}

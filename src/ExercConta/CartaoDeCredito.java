package ExercConta;

public class CartaoDeCredito {

	private int numero;
	private String operadora;
	private double limite;
	private String TipoDeCartao;

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getOperadora() {
		return operadora;
	}

	public void setOperadora(String operadora) {
		this.operadora = operadora;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public String getTipoDeCartao() {
		return TipoDeCartao;
	}

	public void setTipoDeCartao(String tipoDeCartao) {
		TipoDeCartao = tipoDeCartao;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CartaoDeCredito [numero=");
		builder.append(numero);
		builder.append(", operadora=");
		builder.append(operadora);
		builder.append(", limite=");
		builder.append(limite);
		builder.append(", TipoDeCartao=");
		builder.append(TipoDeCartao);
		builder.append("]");
		return builder.toString();
	}

}

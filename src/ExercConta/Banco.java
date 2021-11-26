package ExercConta;

public class Banco {

	private int codigo;
	private String nome;
	private int NumeroAgencias;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		if (codigo > 0)
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome.length() > 0)
		this.nome = nome;
	}

	public int getNumeroAgencias() {
		return NumeroAgencias;
	}

	public void setNumeroAgencias(int numeroAgencias) {
		if (NumeroAgencias >= 0)
		NumeroAgencias = numeroAgencias;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Banco [codigo=");
		builder.append(codigo);
		builder.append(", nome=");
		builder.append(nome);
		builder.append(", NumeroAgencias=");
		builder.append(NumeroAgencias);
		builder.append("]");
		return builder.toString();
	}

	
}

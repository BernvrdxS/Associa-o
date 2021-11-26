package ExercComputador;

public class PlacaMae {
	private String marca;
	private String modelo;
	protected Processador processador;
	protected Memoria memoria;
	protected HD hd;

	public PlacaMae() {
		processador = new Processador();
		memoria = new Memoria();
		hd = new HD();
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		if (marca.length() > 0)
			this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		if (modelo.length() > 0)
			this.modelo = modelo;
	}

	public Processador getProcessador() {
		return processador;
	}

	public void setProcessador(Processador processador) {
		this.processador = processador;
	}

	public Memoria getMemoria() {
		return memoria;
	}

	public void setMemoria(Memoria memoria) {
		this.memoria = memoria;
	}

	public HD getHd() {
		return hd;
	}

	public void setHd(HD hd) {
		this.hd = hd;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PlacaMae [marca=");
		builder.append(marca);
		builder.append(", modelo=");
		builder.append(modelo);
		builder.append(", processador=");
		builder.append(processador);
		builder.append(", memoria=");
		builder.append(memoria);
		builder.append(", hd=");
		builder.append(hd);
		builder.append("]");
		return builder.toString();
	}

}



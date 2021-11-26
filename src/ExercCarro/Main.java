package ExercCarro;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Carro veiculo = new Carro();
		
		veiculo.setAno(2010);
		veiculo.setCor("preto");
		veiculo.setModelo("Uno");
		veiculo.setFabricante("Fiat");
		veiculo.dono.setEndereco("Avenida");
		veiculo.dono.setNome("Bernardo");
		veiculo.motor.setCilindros(150);
		veiculo.motor.setCombustivel("Gasolina");
		veiculo.motor.setMarca("Fiat");
		veiculo.motor.setPotencia(75);
		
		
		System.out.println(veiculo);
	}

}

package ExercConta;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ContaBancaria banco = new ContaBancaria();

		banco.setAgencia(126);
		banco.setNumeroDaConta(390);
		banco.setSaldo(9000);
		banco.correntista.setNome("Bernardo");
		banco.correntista.setEndereco("Avenida João das couves");
		banco.banco.setCodigo(325);
		banco.banco.setNome("Caixa");
		banco.banco.setNumeroAgencias(345);
		

		System.out.println(banco);
	}

}

public class Main {

	public static void main(String[] args) {

/*		SistemaDeSom ss =  new SistemaDeSom();
		ss.setTensao(220);
		ss.setPotencia(1500);
		ss.setModelo("J-45");
		ss.setMarca("JBL");
		ss.setConsumo(550);
		
		SistemaDeVideo sv = new SistemaDeVideo();
		sv.setTipo("LED");
		sv.setTensao(110);
		sv.setResolucao("4K");
		sv.setModelo("L500");
		sv.setMarca("LG");
		sv.setConsumo(500);
*/
		HomeTheater ht = new HomeTheater();

		
		ht.som.setTensao(110);
		ht.som.setPotencia(1500);
		ht.som.setModelo("J-45");
		ht.som.setMarca("JBL");
		ht.som.setConsumo(550);
		
		ht.video.setTipo("LED");
		ht.video.setTensao(220);
		ht.video.setResolucao("4K");
		ht.video.setModelo("L500");
		ht.video.setMarca("LG");
		ht.video.setConsumo(500);
		System.out.println(ht);
	}
}
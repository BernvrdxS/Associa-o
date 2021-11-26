package ExercComputador;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// PlacaMae
				HD hd = new HD();
				hd.setMarca("Seagate");
				hd.setModelo("BarraCuda");
				hd.setCapacidade(2000);
				hd.setRpm(7200);

				Memoria m = new Memoria();
				m.setMarca("HyperX");
				m.setModelo("Fury Beast");
				m.setCapacidade(8);
				m.setVelocidade(3200);

				Processador p = new Processador();
				p.setMarca("Intel");
				p.setModelo("Core i9");
				p.setClock(5200);
				p.setCache(12);

				PlacaMae pm = new PlacaMae();
				pm.setMarca("Asus ROG");
				pm.setModelo("Maximus Z690 Hero");
				pm.processador = p;
				pm.hd = hd;
				pm.memoria = m;
				System.out.println(pm);

				// Computador

				Gabinete g = new Gabinete();
				g.setModelo("Redragon Wheel Jack");
				g.setTipo("Mid Tower");
				g.setBaias(7);
				g.placamae = pm;

				Monitor mo = new Monitor();
				mo.setMarca("Asus");
				mo.setTipo("LED");
				mo.setResolucao("Full HD (1080p) 1920 x 1080 a 75 Hz");

				Teclado t = new Teclado();
				t.setMarca("HyperX");
				t.setTipo("Mecânico");

				Mouse mouse = new Mouse();
				mouse.setMarca("HyperX");
				mouse.setTipo("Gamer");

				Computador pc = new Computador();
				pc.setMarca("Pichau");
				pc.setModelo("UDYAT");
				pc.gabinete = g;
				pc.teclado = t;
				pc.mouse = mouse;
				pc.monitor = mo;
				System.out.println(pc);

				// EquipamentoEletronico

				EquipamentoEletronico ee = new EquipamentoEletronico();
				ee.setTensao(120);
				ee.setConsumo(300);
				System.out.println(ee);
	}

}

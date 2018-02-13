package poo01;

public class Main {
	
	public static void main(String[] args) {
		
		/*
		Player player = new Player();
	// classe, variavel , estanciamento da classe
		player.playerInit();
		
		Inimigo inimigo = new Inimigo();
	// classe, variavel , estanciamento da classe	
		inimigo.iniciarInit();
		*/
		new Main().instanceMain2();
	}
	
	public void instanceMain2() {
		new Main2().print1();
		
		/*inner class => classes dentro da outra*/
	}
	
	private class Main2{
		
		public void print1() {
			System.out.println("Chamando meu método");
		}
	}
}

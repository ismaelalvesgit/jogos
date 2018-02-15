package logica_game;

public class Game implements Runnable{
	
	private boolean isRunning;
	private Thread thread;
	
	public static void main(String[] args) {
		Game game = new Game();
		game.start();
	}
	
	public synchronized void start() {
		//sincronia com o start
		isRunning = true;
		thread = new Thread(this);
		thread.start();
	}
	public void tick() {
		//atualiza o jogo
		System.out.println("Tick");
	}
	
	public void render() {
		//renderizar o jogo
		System.out.println("Render");
	}
	
	@Override
	public void run() {
		while(isRunning){
			tick();
			render();
			
			//controle de FPS basico
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

	
}

package estrutura_repetição;

public class exe_do_while {
	
	public static void main(String[] agrs) { 
		
		int contador = 1;
		
		do {
			System.out.println("esta em " + contador);
			contador++;
			/*
			
			a estrutura do DO WHILE e um pouco mais complexa pois 
			primeiro ele vai mostrar o contador e acresentar mais 1
			depois ele vai verifica se a condição correta.
			
			*/
		}while(contador <=10);
	}
}

package estrutura_repetição;

public class switch_case {
	
	public static void main(String[] args) {
	
		String nome = "douglas";
		
		
		// o switch case trabalho por caso
		switch(nome) {
			
		case "ismael":
		
		// caso o meu nome for ismael faça isso ....
			System.out.println("olá meu nome e ismael");
		
		break;
		
		case "eduardo":
		
		// caso o meu nome for eduardo faça isso ....	
			System.out.println("olá meu nome é eduardo");
		
		break;
		
		default:
		// caso não caia em nenhum dos casos a cima faça isso .... 	
			System.out.println("olá meu nome é " + nome);
		
		}
	}
}

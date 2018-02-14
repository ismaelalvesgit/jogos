package poo02;

public class Main {
	//acesso somente na class Main
	private String nome = "ismael";
	private int [] idade;
	public static final int VIDA_MAXIMA = 100;
	
	public boolean verdadeiro = true;
	
	//metodo construtor
	public Main() {
		idade = new int[20];
	}
	
	public String getNome() {
		return nome;
	}
	
	public static void main(String[] args) {
		Main m = new Main();
		System.out.println(m.getNome());
		System.out.println(Main.VIDA_MAXIMA);
	}
	
	// final e = a costantes variaveis que nunca munda o valor
}

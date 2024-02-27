package pacote_codigo;

public class ClassePrincipal {
	
	public static int ImprimirComRetornoEParametro(int a, int b){   //public é o modificador de acesso e o int é o tipo do return
		return a + b; // retorna um int
	}
	
	public static void main(String[] args) {
		int y = 3;
		int z = 7;
		
		int x;
		x = ImprimirComRetornoEParametro(y, z); // Passando dois parâmetros.

	}

}
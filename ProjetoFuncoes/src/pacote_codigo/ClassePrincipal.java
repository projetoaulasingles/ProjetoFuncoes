package pacote_codigo;

public class ClassePrincipal {
	
	public static int ImprimirComRetornoEParametro(int a, int b){
		
		return a + b;
		
	}
	
	public static void main(String[] args) {
		
		int y = 3;
		int z = 7;
		
		int x;
		x = ImprimirComRetornoEParametro(y, z);

	}

}


public class NumeroInv {
	public static void imprimeTabuada(int numero) {
	    if (numero < 1 || numero > 10) {
	        System.out.println("número inválido");
	        return;
	    }
	    for (int i = 1; i <= 10; i++) {
	        int resultado = numero * i;
	        System.out.println(numero + " x " + i + " = " + resultado);
	    }
	}

}

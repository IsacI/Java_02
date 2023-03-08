
public class Lista2ativ1 {
	import java.util.List;

	public static int contaNumerosPares(List<Integer> lista) {
	    int quantidadePares = 0;
	    for (int numero : lista) {
	        if (numero % 2 == 0) {
	            quantidadePares++;
	        }
	    }
	    return quantidadePares;
	}



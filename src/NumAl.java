
public class NumAl {

import java.util.Random;

public static  void imprimeNumerosAleatorios(){
    Random random = new Random();
    for (int i = 0; i < 5; i++) {
        int numero = random.nextInt(100) + 1;
        System.out.println(numero);
    }
}

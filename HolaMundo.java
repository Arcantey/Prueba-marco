//package holamundo;

import java.util.Scanner;

public class HolaMundo {
    public static void main(String[] args) {
        int limiteNumerico;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escribir un número en el teclado");
        limiteNumerico = teclado.nextInt();
        
        for (int index = 0; index < limiteNumerico; index++) {
            System.out.println(index+1);
        }
        teclado.close();
    }
}

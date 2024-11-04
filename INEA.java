//Package Inea;
import java.util.Scanner;

class IneaApp {
    public static void main (String[] args){

        Scanner califica = new Scanner (System.in);
        int c,b,contraseña;
        char a;
        String nombre;
        b = 0;

//hash para generar la contraseña
        int seg[5];
        seg[2] = 1523;
         
     System.out.print("ingresa tu nombre");
     nombre = califica.nextLine();
     do{
        System.out.print("introduce tu contraseña");
        contraseña=califica.nextInt();
    
        if(contraseña==1234){
            System.out.print("Cual es tu numero de aciertos");
            c=califica.nextInt();
            if(c>=58 && c<=100){
                System.out.print("promedio bajo");
            }else if(c>=101 && c<=207){
                    System.out.print("Promedio normal");
            }else if(c>=208 && c<=250){
                    System.out.print("promedio excelente");
                }
                else{
                    System.out.print("no se encontro el rango de aciertos");
                }
            }
        else{
            System.out.print("quieres intentar de nuevo la contraseña 1.si 2.no");
            b=califica.nextInt();
        }
    } while ( b == 1);
    }

}



import java.util.Scanner;

public class Rango {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Cuantos valores ingresara ? ");
        int valores =  scanner.nextInt();
        int[] valor = new int [valores];

        for (int i = 0; i < valor.length; i++) {
            System.out.print("Ingrese el valor "+(i+1)+": ");
           valor[i] = scanner.nextInt();
        }

        int mayor, menor;
        mayor = menor = valor [0];

        for (int i = 0; i < valor.length; i++) {
            if(valor [i] > mayor) {
                mayor = valor[i];
            }
            if(valor[i]<menor) {
                menor = valor[i];
            }
        }
 int rango= mayor-menor;
        System.out.print("EL rango es:"+rango);
    }
}

import java.util.Scanner;
import java.util.Random;
public class Yo_adivino_un_número {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Adivina un numero entre el 1 al 100");
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        int numero_ingresado = 0;
        int intentos=1;
        while (randomNumber != numero_ingresado) {
            System.out.println("Intento  " + intentos);
            numero_ingresado = scanner.nextInt();
            if (numero_ingresado > randomNumber) {

                System.out.println("El numero es menor a : " + numero_ingresado);
                intentos=intentos+1;
            } else {

                System.out.println("El numero es mayor a : " + numero_ingresado);
                intentos=intentos+1;
            }
        }
        System.out.println("Correcto. Adivinaste al intento "+intentos);
    }
}
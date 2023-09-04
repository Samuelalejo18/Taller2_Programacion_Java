import java.util.Scanner;

public class Tiempo_de_viaje {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Cuantos tramos de viaje realizo? ");
        int tramos = scanner.nextInt();
        int[] duracion = new int[tramos];

      int suma = 0;
        for (int i = 0; i < duracion.length; i++) {
            System.out.print("Duracion del tramo " + (i + 1) + ": ");
            duracion[i] = scanner.nextInt();
            suma += duracion[i];

        }
        int horas = suma / 60;
        int minutos = suma % 60;
        if (minutos >= 10) {
            System.out.println("El tiempo total de viaje : " + horas + ":" + minutos + " horas");
        } else  {
            System.out.println("El tiempo total de viaje : " + horas + ": 0" + minutos + " horas");

        }
    }
}



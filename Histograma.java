import java.util.Scanner;

public class Histograma {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(" Ingrese un valores enteros(terminara cuando ingreses '0') ");
        int valor;
        int positivos=0;
        int negativos=0;
       StringBuilder resultados_positivos= new StringBuilder("positivos : ");
        StringBuilder resultados_negativos= new StringBuilder("negativos : ");
        do {
            valor = scanner.nextInt();
        if(valor>0){
         positivos=positivos+1;

        } else if (valor<0) {
         negativos=negativos+1;
        }
        }
        while (valor != 0);

        for(int i=0;i<positivos;i++) {
        resultados_positivos.append("*");

        }
        for(int i=0;i<negativos;i++) {resultados_negativos.append("*");

        }
        System.out.println(resultados_positivos);
        System.out.println(resultados_negativos);

        }

        }



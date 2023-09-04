import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa numero");
        int numero = scanner.nextInt();
        //Convertir el int a string
        String valor=String.valueOf(numero);
        String valor_invertido = "";

        //Para que inicie desde el iterador 0 y no desde el primer valor
        //i-- desminuye al ultimo y empieza
        for(int i=valor.length()-1;i>=0;i--){
           //+= ir sumandole los valores de caracteres
            // a valor invertido se le a;ade el caracter de valor en el indice que esta recorriendo , por ende al disminuyendo el iterador
            //se iran a;adiendo los caracteres de la variable original pero en el valor invertido
            valor_invertido+=valor.charAt(i);

        }
        // esta funcion pasa de string porque las string no son posibles compararlas con valores numericos

        if(Integer.parseInt(valor_invertido)==numero){
            System.out.print("el numero es palindromo");
        } else{
            System.out.print("el numero no  es palindromo");
        }

    }
}

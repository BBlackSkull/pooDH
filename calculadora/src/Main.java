import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Elige que cuenta desea ralizar");
        System.out.println("1. Adicion");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. division");

        int choice = in.nextInt();
        int a;
        int b;
        int resultado;

        if (choice == 1 ){

            System.out.println("Ingrese el primer numero para sumar: ");

            a = in.nextInt();

            System.out.println("Ingrese el segundo numero para sumar: ");

            b = in.nextInt();

            resultado = a + b;

            System.out.println("Tu resultado es: " + resultado);

        } else if ( choice == 2 ){

            System.out.println("Ingrese el primer numero para restar:");

            a = in.nextInt();

            System.out.println("Ingrese el segundo numero para restar: ");

            b = in.nextInt();

            resultado = a - b;

            System.out.println("Tu resultado es : " + resultado);

        } else if (choice == 3 ){

            System.out.println("Ingrese el primer numero para Multiplicar: ");

            a = in.nextInt();

            System.out.println("Ingrese el segundo numero para Multiplicar: ");

            b = in.nextInt();

            resultado = a * b;

            System.out.println("Tu resultado es: " + resultado);


        } else if (choice == 4){

            System.out.println("Ingrese el primer numero para Dividir: ");

            a = in.nextInt();

            System.out.println("Ingrese el segundo numero para dividir: ");

            b = in.nextInt();

            resultado = a / b;

            System.out.println("Tu resultado es: " + resultado);
        } else {
            System.out.println("No se encontro el dato digitado, por favor ingrese un dato valido.");
        }
    }
}
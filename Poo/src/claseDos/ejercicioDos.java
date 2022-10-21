package claseDos;

import java.util.Scanner;

public class ejercicioDos {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num1, num2,num3;

        System.out.println("ingrese el primer numero");
        num1 = scanner.nextInt();
        System.out.println("ingrese el segundo numero");
        num2 = scanner.nextInt();
        System.out.println("ingrese el tercer numero");
        num3 = scanner.nextInt();

        if (num1 > num2) {
            if (num1 > num3) {
                System.out.println("El numero mayor es: " + num1);
            } else {
                System.out.println("el numero mayor es: " + num3);
            }
        } else if (num2 > num3) {
            System.out.println("el numero mayor es: " + num2);
        } else {
            System.out.println("el numero mayor es: " + num3);
        }
    }
}

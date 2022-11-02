package ejerciciosRandom;

import java.util.Scanner;

public class divisibleEntreDos {

    int num1,num2;

    public static boolean esDivisible(int num1, int num2){

        if(num1 % num2 == 0){

             return true;

        }else {
            return false;

        }

    }

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer numero...");
        int num1 = scanner.nextInt();
        System.out.println("Ingrese el segundo numero...");
        int num2 = scanner.nextInt();

        boolean found = esDivisible(num1, num2);
        if(!found){
            System.out.println("tus numeros no son primos");
        } else if(found){
            System.out.println("tus numeros son primos");
        }

    }


}

package claseDos;

import java.util.Scanner;

public class ejercicioUno {

    public static Boolean primo(int num){

        int acc;
        for(int i=2; i<num; i++){
            if( num % i == 0){

                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int num;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el numero");

         num = scanner.nextInt();

         boolean found = primo(num);

         if(found == true){
             System.out.println("es primo");
         }else{
             System.out.println("no es primo");
         }

    }
}

package uh.ac.cr;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*for*/
        int cantidad;
        int i;
        System.out.println("Select how many times do you want to see the message ");
        Scanner qty = new Scanner(System.in);
        cantidad = qty.nextInt();
        for (i = 1; i <= cantidad; i++){
            System.out.println( " hello world");
        }


        /*while*/

        int selection;
        int i2 = 0;
        System.out.println("How many times do you want to read the message?");
        Scanner ch = new Scanner(System.in);
        selection = ch.nextInt();
        while (i2 < selection){
            System.out.println( " hello world");
            i2++;
        }
    }
}

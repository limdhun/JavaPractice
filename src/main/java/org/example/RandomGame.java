package org.example;

import java.util.Scanner;

public class RandomGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = (int)(Math.random()*6); //0-5
        String str;
        int input;
        System.out.println(value);
        for (int i=0; i<6; i++){
            System.out.println("i ---- "+i);
            str = scanner.nextLine();
            input = Integer.parseInt(str);
            if (value == input){
                System.out.println("당첨");
                break;
            }
        }

    }
}

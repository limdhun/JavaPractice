package org.example;

import java.util.Scanner;

public class RPSGame {
    public static void main(String[] args) {
        int user;
        Scanner scanner = new Scanner(System.in);
        //0 : 가위, 1: 바위, 2: 보
        System.out.println("0 : 가위, 1: 바위, 2: 보\n입력 : ");
        user = scanner.nextInt();
        int com = (int)(Math.random()*3);

        if (user<com){
            user=user+3;
        }

        user = user < com ? user + 3 : user;
        int result = user - com;
        System.out.println("USER: " + user);
        System.out.println("COM: " + com);

        switch(result){
            case 0:
                System.out.println("비김");
                break;
            case 1:
                System.out.println("이김");
                break;
            case 2:
                System.out.println("짐");
                break;
        }



    }
}

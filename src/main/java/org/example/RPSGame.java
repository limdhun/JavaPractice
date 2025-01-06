package org.example;

import java.util.Scanner;

public class RPSGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int win=0;

        while (true){
            System.out.println("0 : 가위, 1: 바위, 2: 보\n입력하세요");
            String str = scanner.nextLine();    //키보드에서 입력한 문자열
            //blocking I/O? 라고 함.


            int user = Integer.parseInt(str);
            int com = (int)(Math.random()*3);

            if (user < com){
                user = user + 3;
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
                    win += 1;
                    break;
                case 2:
                    System.out.println("짐");
                    win = 0;
                    break;
            }
            if (win == 2){
                System.out.println("2연승 축하드립니다");
                break;
            }


        }



    }
}

package org.example;

import java.util.Scanner;

public class Calculator4U {
    public static void main(String[] args) {
        int money=0;
        int sum=0;
        String str;

        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("숫자를 입력하세요 (종료 : END, 취소 : UNDO)");
            str = scanner.nextLine();
            if(str.equals("END")){
                break;
            }
            else if(str.equals("UNDO")){
                sum -= money;
                System.out.println("현재 합 : "+sum);
                continue;
            }

            money = Integer.parseInt(str);
            sum += money;
            System.out.println("현재 합 : "+sum);

        }


    }
}

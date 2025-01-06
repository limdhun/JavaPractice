package org.example;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str;
        double C;
        double F;

        while (true){
            System.out.println("1: 섭씨 -> 화씨  // 2: 화씨 -> 섭씨 // 종료 : END");
            str = scanner.nextLine();
            if (str.equals("END")){
                break;
            }

            int purpose = Integer.parseInt(str);

            if (purpose == 1){
                System.out.println("섭씨 온도를 입력해주세요");
                str = scanner.nextLine();
                C = Integer.parseInt(str);
                F = 1.8 * C + 32;
                System.out.println("화씨 온도는 " + F);
            }else if (purpose == 2){
                System.out.println("화씨 온도를 입력해주세요");
                str = scanner.nextLine();
                F = Integer.parseInt(str);
                C = (F - 32)*5/9;
                System.out.println("섭씨 온도는 " + C);

            }

        }


    }
}

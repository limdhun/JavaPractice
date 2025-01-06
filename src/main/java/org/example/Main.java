package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner 객체를 사용하여 키보드 입력을 받음
        Scanner scanner = new Scanner(System.in);
        int sum=0;
        // 5개의 Item 객체를 배열로 선언
        Item[] items = new Item[5];

        // 배열의 각 요소를 Item 객체로 초기화
        for (int i = 0; i < items.length; i++) {
            items[i] = new Item();  // 각 Item 객체 초기화
        }

        // 각 아이템의 type과 amount를 입력 받기
        System.out.println("입력");

        // 5개의 아이템에 대해 반복문을 사용하여 입력 받기
        for (int i = 0; i < items.length; i++) {
            System.out.println("어떤 종류의 이득/지출?");
            items[i].type = scanner.nextLine();
            System.out.println("얼마? (부호까지)");
            items[i].amount = scanner.nextInt();
            sum=sum+items[i].amount;
            scanner.nextLine();  // nextInt() 후에 남은 개행문자 처리
        }

        System.out.println("순이익은 "+sum+"입니다.");
        scanner.close();
    }
}

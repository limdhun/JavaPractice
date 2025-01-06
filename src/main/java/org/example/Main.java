package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
        // Scanner 객체를 사용하여 키보드 입력을 받음
        Scanner scanner = new Scanner(System.in);
        int sum=0;
        // 5개의 Item 객체를 배열로 선언

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //오직 br.readLine()만 사용
        String str = br.readLine(); //예외처리 안하면 오류남 main ... args) 뒤에 throws Exception 추가해야함
        
        //소수 처리
        double value1 = Double.parseDouble(str); // 문자열을 Double로 처리
        int value2 = Integer.parseInt(str);
        
    }
}

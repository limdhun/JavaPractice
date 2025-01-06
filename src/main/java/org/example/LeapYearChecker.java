package org.example;

public class LeapYearChecker {
    public static void main(String[] args) {

        int year = 2000;
//if 말고 switch문도 잇음
        if (year % 400 == 0){
            System.out.println("윤년!");
            return;
        }
        else if (year % 100 == 0){
            System.out.println("평년");
            return;
        }
        else if (year % 4 == 0){
            System.out.println("윤년");
            return;
        }
        else{
            System.out.println("평년");
        }

    }
}

package org.example;

public class IfTest {

    public static void main(String[] args) {



        //랜덤한 int값을 만들고싶음
        int value = (int)(Math.random()*6+1);
        //casting
        System.out.println(value);
        int oddEven = value % 2;
        if (oddEven==0){
            System.out.println("짝");
            //return; 적고 else 없앤 후 if문 뒤에 홀 출력해도됨
        }
        else {
            System.out.println("홀");
        }

        //아니면 삼항연산자 써도됨
        String result=oddEven==1? "홀수":"짝수";
        System.out.println(result);
    }

}

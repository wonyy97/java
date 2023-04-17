package com.green.java.ch03;

public class OperatorStudy1 {
    public static void main(String[] args) {
        int num = 5;  //정수형 타입의 num을 선언했고 5를 초기화 했다.
        int result = 4 + num * 3;     //일반 수학 연산과 같다.
        //                5  * 3
        //           4 +  15       = 19
        System.out.println(result);
                                      // 오른쪽 값을 복사하여 왼쪽에 주입하는것이 =대행연산자
        result = 11 / num;            //  int/int = int    실수는 버려버려~ 그래서 정수형 2로 나옴
        System.out.println(result);

        result = result - 1;
        System.out.println(result);

        result = 13 % num;    // % (mod 모드) 나머지 구할 때
                             // 짝수인지 홀수인지 체크할 때 쓰임. 2로 나눴을때 0이 나오면 짝수, 1이 나오면 홀수
        System.out.println(result);
    }
}


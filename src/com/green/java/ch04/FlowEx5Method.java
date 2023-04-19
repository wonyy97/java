package com.green.java.ch04;
//★★★★★

import java.util.Scanner;
//100점 > A+
//90점 보다 크거나 같으면 "%d점은 A입니다."
//80점 보다 크거나 같으면 "%d점은 B입니다."
//70점 보다 크거나 같으면 "%d점은 C입니다."
//70점 미만 otp없음 무조건 D학점, 나머지 "%d점은 D입니다."

// 1의3자리가 8점이상 +, 4미만-, 나머지 0

class scoreObj2 {
    String getGrade(int score) {
        if(score > 100 || score < 0) {
            return "점수는 0~100점 사이입니다.";
        } else if(score < 70) {
            return String.format("%d점의 학점은 D입니다.", score);
        }
        String grade = "C";
        if(score == 100) {
            return "100점의 학점은 A+입니다.";
        } else if (score >= 90) {
            grade = "A";
        } else if(score >= 80) { //0 ~ 89 > 80~89
            grade = "B";
        }
        int num = score % 10;
        if(num >= 8 || score == 100) {
            grade += "+";
        } else if(num < 4) {
            grade += "-";
        } else {
            grade += "0";
        }
        return String.format("%d점의 학점은 %s입니다.", score, grade);

        /*String abc = " ";
        if (score > 100 || score < 0) {
            System.out.println("점수는 0~100사이 입니다.");
        } else {
            if (score >= 90) {
               abc = "A";
            } else if (score >= 80) {
                abc = "B";
            } else if (score >= 70) {
                abc = "C";
            } else {
                abc = "D";
            }
        }

        int num = score % 10;

        if ( abc != "D") {
            if (num >= 8 || score == 100) {
                abc +=  "+";
            } else if (num > 4) {
                abc +=  "-";
            } else {
                abc +=  "0";
            }
        }
        return abc;*/
    }
}

    public class FlowEx5Method {
        public static void main(String[] args) {
            System.out.print("점수를 입력하세요 > ");
            Scanner scan = new Scanner(System.in);
            int score = scan.nextInt();
            scoreObj2 so = new scoreObj2();
            String result = so.getGrade(score);
            System.out.println(result);
//            System.out.printf("%d점의 학점은 %s입니다.", score , result);
        }
    }


//        if (grade != 'D') {
//
//        } else {
//            System.out.printf("%d점의 학점은 %c입니다.");
//        }




       /* if (score > 100 || score < 0) {
            System.out.println("점수는 0~100점 사이입니다.");
        } else {
            if (score >= 90) {
                grade = 'A';
            } else if (score >= 80) {
                grade = 'B';
            } else if (score >= 70) {
                grade = 'C';
            } else {
                grade = 'D';
            }
        }

        int num = score % 10;
        if (grade != 'D') {
            if (num >= 8 || score == 100) {
                otp = '+';
            } else if (num < 4) {
                otp = '-';
            } else {
                otp = '0';
            }
        }
        if (grade != 'D') {
            System.out.printf("%d점의 학점은 %c%c입니다.", score, grade, otp);
        } else {
            System.out.printf("%d점의 학점은 %c입니다.", score, grade);
        }
*/


//        int x = 0;
//
//        if (score >= 90) {
//            grade = 'A';
//            x = score - 90;
//        } else if (score >= 80) {
//            grade = 'B';
//            x = score - 80;
//        } else if (score >= 70) {
//            grade = 'C';
//            x = score - 70;
//        } else if (score < 70) {
//            grade = 'D';
//        }
//
//
//        if (x >= 8) {
//            otp = '+';
//        } else if (x < 4) {
//            otp = '-';
//        } else {
//            otp = '0';
//        }
//
//        if (grade != 'D') {
//            System.out.printf("%d점의 학점은 %c%c입니다.", score, grade, otp);
//        } else {
//            System.out.printf("%d점은 %c입니다.", score, grade);
//        }




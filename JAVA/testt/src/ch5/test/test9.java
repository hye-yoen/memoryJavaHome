package ch5.test;

import java.util.Scanner;

public class test9 {
    public static void main(String[] args) {

        boolean run = true; // wgile 문 무한 반복

        int studentNum = 0;
        int[] scores = null;

        Scanner scanner = new Scanner(System.in);
        // Scanner : 자바에서 입력을 받기 위한 클래스
        // System.in : 키보드 입력

        while (run) {
            System.out.println("----------------------------------------------------");
            System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4.분석 | 5. 종료");
            System.out.println("-----------------------------------------------------");

            int selecNO = Integer.parseInt(scanner.nextLine());
            // 입력받은 문자 정수 변환

            if (selecNO == 1) {
                System.out.print("학생수>");
                studentNum = Integer.parseInt(scanner.nextLine());
                scores = new int[studentNum];
            } else if (selecNO == 2) {
                for (int i = 0; i < scores.length; i++) {
                    System.out.println("scores [" + i + "]");
                    scores[i] = Integer.parseInt(scanner.nextLine());

                }
            } else if (selecNO == 3) {
                for (int i = 0; i < scores.length; i++) {
                    System.out.println("scores [" + i + "] : " + scores[i]);
                }
            } else if (selecNO == 4) {
                int max = 0;
                int sum = 0;
                double avg = 0;
                for (int i = 0; i < scores.length; i++) {
                    if (max < scores[i]) {
                        max = scores[i];
                    }
                    sum += scores[i];
                }
                avg = (double) sum /studentNum;
                System.out.println("최고점수 : "+ max);
                System.out.println("평균점수"+avg);
            }
            else if(selecNO ==5){
                run = false;
            }
            else{
                System.out.println("다시선택하삼");
            }
        }

    }
}

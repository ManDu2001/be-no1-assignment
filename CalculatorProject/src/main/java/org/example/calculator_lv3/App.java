package org.example.calculator_lv3;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("----------------------ArithmeticCalculator(도전 기능) 테스트 (시작)----------------------");

        ArithmeticCalculator ac = new ArithmeticCalculator(new ArrayList<Integer>());

        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int n1 = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            int n2 = sc.nextInt();
            System.out.print("사칙연산 기호를 입력하세요: ");
            char op = sc.next().charAt(0);

            int result = ac.calculate(n1, n2, op);
            System.out.println("결과: " + result);

            //getter 예시
            System.out.println("현재 계산 결과 목록: " + ac.getResultHistory());

            //setter 예시 -> printAboveValue 테스트 위해 주석 처리
            //ac.changeResultHistory(ac.getResultHistory().size() - 1, 777);
            //System.out.println("가장 최근 계산 결과를 777로 바꾼 후(setter test) 계산 결과 목록: " + ac.getResultHistory());

            //removeResult 예시 -> printAboveValue 테스트 위해 주석 처리
            //ac.removeResult();
            //System.out.println("가장 먼저 저장된(즉, index 0인 데이터) 계산 결과 삭제후 계산 결과 목록: " + ac.getResultHistory());

            System.out.print("저장된 계산 결과중 얼마 이상의 값만 출력하시겠습니까: ");
            int threshold = sc.nextInt();
            System.out.println(threshold + "이상의 결과만 반환: " + ac.printAboveValue(threshold));

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료, 그 외의 입력에 대해서는 더 계산하는 것으로 간주)");
            String s = sc.next();
            if(s.equals("exit")) {
                break;
            }
        }
        System.out.println("----------------------ArithmeticCalculator(도전 기능) 테스트 (끝)----------------------");
    }
}

package org.example.calculator_lv2;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("----------------------Calculator(기본 기능) 테스트 (시작)----------------------");

        Calculator c = new Calculator(new ArrayList<Integer>());

        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int n1 = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            int n2 = sc.nextInt();
            System.out.print("사칙연산 기호를 입력하세요: ");
            char op = sc.next().charAt(0);

            int result = c.calculate(n1, n2, op);
            System.out.println("결과: " + result);

            //getter 예시
            System.out.println("현재 계산 결과 목록: " + c.getResultHistory());

            //setter 예시
            c.changeResultHistory(c.getResultHistory().size() - 1, 777);
            System.out.println("가장 최근 계산 결과를 777로 바꾼 후(setter test) 계산 결과 목록: " + c.getResultHistory());

            //removeResult 예시
            c.removeResult();
            System.out.println("가장 먼저 저장된(즉, index 0인 데이터) 계산 결과 삭제후 계산 결과 목록: " + c.getResultHistory());

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료, 그 외의 입력에 대해서는 더 계산하는 것으로 간주)");
            String s = sc.next();
            if(s.equals("exit")) {
                break;
            }
        }
        System.out.println("----------------------Calculator(기본 기능) 테스트 (끝)----------------------");
    }
}

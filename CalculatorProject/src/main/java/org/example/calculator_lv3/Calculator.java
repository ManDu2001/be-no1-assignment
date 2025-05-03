package org.example.calculator_lv3;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    /* 연산 결과를 저장하는 컬렉션 타입 필드 선언 및 생성 */
    protected List<Integer> resultHistory;

    public Calculator(){

    }

    public Calculator(ArrayList<Integer> alist){
        this.resultHistory = alist;
    }

    public int calculate(int n1, int n2, char op){
        int result = 0;
        switch (op){
            case '+':
                result = n1 + n2;
                break;
            case '-':
                result = n1 - n2;
                break;
            case '*':
                result = n1 * n2;
                break;
            case '/':
                if(n2 == 0){
                    System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                    break;
                }
                result = n1 / n2;
                break;
            default:
                System.out.println("사칙연산 기호는 +, -, *, / 중 하나여야 합니다.");
                break;
        }
        this.resultHistory.add(result);
        return result;
    }

    /*
    [Getter]
    @return Calculator의 저장된 연산 결과들을 반환
     */
    public List<Integer> getResultHistory(){
        return this.resultHistory;
    }

    /*
    [Setter]
    @param idx 바꿀 인덱스, value 바꿀 값
    Calculator의 저장된 연산 결과 리스트를 인덱스를 기준으로 값 수정
    */
    public void changeResultHistory(int idx, int value){
        int resultHistorySize = this.resultHistory.size();
        if(idx < 0 && resultHistorySize <= idx){
            System.out.println("현재 계산 결과는 " + resultHistorySize + "개 저장되어 있으며, " + "0부터 " + (resultHistorySize - 1) + " 사이의 인덱스만 접근할 수 있습니다.");
            return;
        }
        this.resultHistory.set(idx, value);
    }

    /*
    Calculator 클래스에 저장된 연산 결과들 중 가장 먼저 저장된 데이터를 삭제 (즉, index 0인 데이터)
     */
    public void removeResult(){
        if(this.resultHistory.size()==0){
            System.out.println("계산 결과 목록에 아무것도 없기 때문에 삭제할 수 없습니다.");
            return;
        }
        this.resultHistory.remove(0);
    }
}

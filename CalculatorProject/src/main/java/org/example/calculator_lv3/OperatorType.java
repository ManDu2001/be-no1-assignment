package org.example.calculator_lv3;

import java.util.function.BiFunction;

public enum OperatorType {

    PLUS('+', (x, y) -> x + y),
    SUBTRACT('-', (x, y) -> x - y),
    MULTIPLY('*', (x, y) -> x * y),
    DIVIDE('/', (x, y) -> {
        if(y == 0){
            System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
            return 0;
        }
        return x / y;
    }),
    DEFAULT('?', (x, y) -> {
        System.out.println("사칙연산 기호는 +, -, *, / 중 하나여야 합니다.");
        return 0;
    });

    private char op;
    private BiFunction<Integer, Integer, Integer> exp;

    OperatorType(char op, BiFunction<Integer, Integer, Integer> exp){
        this.op = op;
        this.exp = exp;
    }

    private static OperatorType getOperator(char op){
        for(OperatorType ot : values()){
            if(ot.op == op){
                return ot;
            }
        }
        return OperatorType.DEFAULT;
    }

    public static int calculate(int n1, int n2, char op){
        OperatorType ot = getOperator(op);
        return ot.exp.apply(n1, n2);
    }
}

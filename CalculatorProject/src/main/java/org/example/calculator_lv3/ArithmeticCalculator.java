package org.example.calculator_lv3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArithmeticCalculator extends Calculator {

    public ArithmeticCalculator(ArrayList<Integer> alist){
        super(alist);
    }
    @Override
    public int calculate(int n1, int n2, char op){
        int result = OperatorType.calculate(n1, n2, op);
        this.resultHistory.add(result);
        return result;
    }

    /*
    @param value 주어진 값
    @return 파라미터로 주어진 value 이상의 값들만 resultHistory에서 추출하여 리스트로 반환
     */
    public List<Integer> printAboveValue(int value) {
        return this.resultHistory.stream().filter(x -> x >= value).collect(Collectors.toList());
    }

}

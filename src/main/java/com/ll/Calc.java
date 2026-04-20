package com.ll;

import java.util.ArrayList;

public class Calc {
    private static int calculate(int a, String op, int b) {
        if (op.equals("+")) return a + b;
        if (op.equals("-")) return a - b;
        if (op.equals("*")) return a * b;
        return 0;
    }

    public static int run(String expression) {
        while (expression.contains("(")) {
            int start = expression.lastIndexOf("(");
            int end = expression.indexOf(")", start);
            String inner = expression.substring(start + 1, end);
            expression = expression.substring(0, start) + run(inner) + expression.substring(end + 1);
        }

        String[] expressionBits = expression.split(" ");
        ArrayList<Integer> numList = new ArrayList<>();
        ArrayList<String> opList = new ArrayList<>();

        for (int i = 0; i < expressionBits.length; i++) {
            if (i % 2 == 0) {
                numList.add(Integer.parseInt(expressionBits[i]));
            } else {
                opList.add(expressionBits[i]);
            }
        }

        for (int i = 0; i < opList.size(); i++) {
            if (opList.get(i).equals("*")) {
                numList.set(i, calculate(numList.get(i), "*", numList.get(i + 1)));
                numList.remove(i + 1);
                opList.remove(i);
                i--;
            }
        }
        for (int i = 0; i < opList.size(); i++) {
            numList.set(i, calculate(numList.get(i), opList.get(i), numList.get(i + 1)));
            numList.remove(i + 1);
            opList.remove(i);
            i--;
        }
        return numList.get(0);
    }
}

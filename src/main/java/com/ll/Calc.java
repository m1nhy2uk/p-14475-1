package com.ll;

import java.util.ArrayList;

public class Calc {
    public static int run(String expression) {
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
                int result = numList.get(i) * numList.get(i + 1);
                numList.remove(i + 1);
                numList.set(i, result);
                opList.remove(i);
                i--;
            }
        }
        for (int i = 0; i < opList.size(); i++) {
            if (opList.get(i).equals("+")) {
                int result = numList.get(i) + numList.get(i + 1);
                numList.set(i, result);
                numList.remove(i + 1);
                opList.remove(i);
                i--;
            }else if (opList.get(i).equals("-")) {
                int result = numList.get(i) - numList.get(i + 1);
                numList.set(i, result);
                numList.remove(i + 1);
                opList.remove(i);
                i--;
            }
        }
        return numList.get(0);
    }
}

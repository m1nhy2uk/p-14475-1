package com.ll;

public class Calc {
    public static int run(String expression) {
        String[] expressionBits = expression.split(" ");

        int num1 = Integer.parseInt(expressionBits[0]);
        int num2 = Integer.parseInt(expressionBits[2]);

        if (expressionBits[1].equals("+")) {
            if (expressionBits.length == 5) {
                int num3 = Integer.parseInt(expressionBits[4]);
                if (expressionBits[1].equals("+") && expressionBits[3].equals("+")) {
                    return num1 + num2 + num3;
                } else if (expressionBits[1].equals("-") && expressionBits[3].equals("-")) {
                    return num1 - num2 - num3;
                } else if (expressionBits[1].equals("+") && expressionBits[3].equals("-")) {
                    return num1 + num2 - num3;
                } else if (expressionBits[1].equals("-") && expressionBits[3].equals("+")) {
                    return num1 - num2 + num3;
                }
            }
            return num1 + num2;
        } else if (expressionBits[1].equals("-")) {
            if (expressionBits.length == 5) {
                int num3 = Integer.parseInt(expressionBits[4]);
                if (expressionBits[1].equals("+") && expressionBits[3].equals("+")) {
                    return num1 + num2 + num3;
                } else if (expressionBits[1].equals("-") && expressionBits[3].equals("-")) {
                    return num1 - num2 - num3;
                } else if (expressionBits[1].equals("+") && expressionBits[3].equals("-")) {
                    return num1 + num2 - num3;
                } else if (expressionBits[1].equals("-") && expressionBits[3].equals("+")) {
                    return num1 - num2 + num3;
                }
            }
            return num1 - num2;
        } else if (expressionBits[1].equals("*")) {
            if(expressionBits.length == 5) {
                int num3 = Integer.parseInt(expressionBits[4]);
                if (expressionBits[1].equals("*") && expressionBits[3].equals("*")) {
                    return num1 * num2 * num3;
                } else if (expressionBits[1].equals("/") && expressionBits[3].equals("/")) {
                    return num1 / num2 / num3;
                } else if (expressionBits[1].equals("*") && expressionBits[3].equals("/")) {
                    return num1 * num2 / num3;
                } else if (expressionBits[1].equals("/") && expressionBits[3].equals("*")) {
                    return num1 / num2 * num3;
                }
            }
            return num1 * num2;
        } else if (expressionBits[1].equals("/")) {
            if(expressionBits.length == 5) {
                int num3 = Integer.parseInt(expressionBits[4]);
                if (expressionBits[1].equals("*") && expressionBits[3].equals("*")) {
                    return num1 * num2 * num3;
                } else if (expressionBits[1].equals("/") && expressionBits[3].equals("/")) {
                    return num1 / num2 / num3;
                } else if (expressionBits[1].equals("*") && expressionBits[3].equals("/")) {
                    return num1 * num2 / num3;
                } else if (expressionBits[1].equals("/") && expressionBits[3].equals("*")) {
                    return num1 / num2 * num3;
                }
            }
            return num1 / num2;
        }
        return 0;
    }
}

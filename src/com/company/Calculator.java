package com.company;

public class Calculator {

    public Calculator() {
    }

    public String calculate(int number1, int number2, char operation, boolean rom) {
        int result = 0;
        String res = "";
        switch (operation) {
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '*':
                result = number1 * number2;
                break;
            case '/':
                result = (int) ((double) number1 / number2);
                if (number2 == 0) {
                    throw new IllegalArgumentException("Нельзя делить на ноль");
                } else if (number1 == 0) {
                    throw new IllegalArgumentException("Ноль нельзя делить");
                }
                break;
            default:
                throw new IllegalArgumentException("Не верный знак операции");

        }
        if (rom == true) {
            {

                double ones = result % 10;
                double tens = (result / 10) % 10;
                if (result >= 100) {
                    res = "C";
                }

                if (tens >= 1 && tens < 4) {
                    for (int i = 0; i < tens; i++) {
                        res = res + "X";
                    }

                } else if (tens == 4) {
                    res = "XL";
                } else if (tens >= 5 && tens < 9) {
                    res = "L";
                    for (int i = 5; i < tens; i++) {
                        res = res + "X";
                    }

                } else if (tens == 9) {
                    res += "XC";
                }


                if (ones >= 1 && ones <= 3) {
                    for (int i = 0; i < ones; i++) {
                        res += "I";

                    }
                } else if (ones == 4) {
                    res += "IV";
                } else if (ones >= 5 && ones <= 8) {
                    res += "V";
                    for (int i = 5; i < ones; i++) {
                        res += "I";

                    }
                } else if (ones == 9) {
                    res += "IX";
                }


            }


            return res;
        } else {
            return String.valueOf(result);
        }


    }

}

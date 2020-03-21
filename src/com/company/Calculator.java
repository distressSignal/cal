package com.company;

public class Calculator {

    public Calculator() {
    }

    public double calculate(int number1, int number2, char operation) {
        double result = 0;

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
                result = (double) number1 / number2;
                if (number2 == 0) {
                    throw new IllegalArgumentException("Нельзя делить на ноль");
                } else if (number1 == 0) {
                    throw new IllegalArgumentException("Ноль нельзя делить");
                }
                break;
            default:
                throw new IllegalArgumentException("Не верный знак операции");

        }
        return result;
    }

}

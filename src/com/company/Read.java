package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Read {
    private int num1 = 0;
    private int num2 = 0;
    String a;
    String za;
    boolean sw = false;
    boolean rom;

    public void read() {
        String[] arabic = {"10", "9", "8", "7", "6", "5", "4", "3", "2", "1"};
        String[] roman = {"X", "IX", "VIII", "VII", "VI", "V", "IV", "III", "II", "I"};


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            za = reader.readLine();
            a = za.toUpperCase();// TODO: 21.03.2020 что-бы можно было складывать x+X

        } catch (IOException e) {
            e.printStackTrace();
        }


        String[] cif = a.split("[+-/*]");


        char qw = a.charAt(cif[0].length());


        try {
            for (String value : arabic) {
                if (value.equals(cif[0]) || value.equals(cif[1])) {


                    num1 = Integer.parseInt(cif[0]);
                    num2 = Integer.parseInt(cif[1]);


                }
            }
            for (String s : roman) {
                if (s.equals(cif[0]) || s.equals(cif[1])) {
                    num1 = romanToNumber(cif[0]);
                    num2 = romanToNumber(cif[1]);
                    rom=true;



                }
            }

            if ((num1 > 10 || num1 <= 0) || (num2 > 10 || num2 <= 0)) {
                throw new IllegalArgumentException();
            }
        } catch (RuntimeException e) {
            throw new IllegalArgumentException("Неверный формат данных");
        }



        Calculator calc = new Calculator();

        System.out.println(calc.calculate(num1, num2, qw,rom));
    }

    private static int romanToNumber(String roman) {
        if (roman.equals("I")) {
            return 1;
        } else if (roman.equals("II")) {
            return 2;
        } else if (roman.equals("III")) {
            return 3;
        } else if (roman.equals("IV")) {
            return 4;
        } else if (roman.equals("V")) {
            return 5;
        } else if (roman.equals("VI")) {
            return 6;
        } else if (roman.equals("VII")) {
            return 7;
        } else if (roman.equals("VIII")) {
            return 8;
        } else if (roman.equals("IX")) {
            return 9;
        } else if (roman.equals("X")) {
            return 10;
        } else {
            return 0;
        }
    }
}

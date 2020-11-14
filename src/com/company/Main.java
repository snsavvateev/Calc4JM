package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Калькулятор!");
        System.out.println("Калькулятор умеет работать как с арабскими (1,2,3,4,5…), так и с римскими (I,II,III,IV,V…) числами.");
        System.out.println("Калькулятор умеет выполнять операции a + b, a - b, a * b, a / b. Данные передаются в одну строк");

        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        if(s.contains("+")) {
            String[] numbers = s.split("\\+");
            int a, b;
            if (s.contains("I") || s.contains("V") || s.contains("X")) {
                a = RomanNumbers.fromRoman(numbers[0]);
                b = RomanNumbers.fromRoman(numbers[1]);
                if (a > 0 & a <= 10 & b > 0 & b <= 10) {
                    System.out.println(RomanNumbers.toRoman(a + b));
                } else {
                    System.out.println("Калькулятор принимають от 1 до 10 включительно, не более.");
                }
            } else {
                a = Integer.valueOf(numbers[0]);
                b = Integer.valueOf(numbers[1]);
                if (a > 0 & a <= 10 & b > 0 & b <= 10) {
                    System.out.println(a + b);
                } else {
                    System.out.println("Калькулятор принимають от 1 до 10 включительно, не более.");                }
            }

        }else if (s.contains("-")) {
            String[] numbers = s.split("\\-");
            int a, b;
            if (s.contains("I") || s.contains("V") || s.contains("X")) {
                a = RomanNumbers.fromRoman(numbers[0]);
                b = RomanNumbers.fromRoman(numbers[1]);
                if (a > 0 & a <= 10 & b > 0 & b <= 10)  {
                    System.out.println(RomanNumbers.toRoman(a - b));
                } else {
                    System.out.println("Калькулятор принимають от 1 до 10 включительно, не более.");
                }
            } else {
                a = Integer.valueOf(numbers[0]);
                b = Integer.valueOf(numbers[1]);
                if (a > 0 & a <= 10 & b > 0 & b <= 10)  {
                    System.out.println(a - b);
                } else {
                    System.out.println("Калькулятор принимають от 1 до 10 включительно, не более.");            }
            }
        }else if (s.contains("*")) {
            String[] numbers = s.split("\\*");
            int a, b;
            if (s.contains("I") || s.contains("V") || s.contains("X")) {
                a = RomanNumbers.fromRoman(numbers[0]);
                b = RomanNumbers.fromRoman(numbers[1]);
                if (a > 0 & a <= 10 & b > 0 & b <= 10)  {
                    System.out.println(RomanNumbers.toRoman(a * b));
                } else {
                    System.out.println("Калькулятор принимають от 1 до 10 включительно, не более.");
                }
            } else {
                a = Integer.valueOf(numbers[0]);
                b = Integer.valueOf(numbers[1]);
                if (a > 0 & a <= 10 & b > 0 & b <= 10)  {
                    System.out.println(a * b);
                } else {
                    System.out.println("Калькулятор принимають от 1 до 10 включительно, не более.");  }
            }
        }else if (s.contains("/")) {
            String[] numbers = s.split("\\/");
            int a, b;
            if (s.contains("I") || s.contains("V") || s.contains("X")) {
                a = RomanNumbers.fromRoman(numbers[0]);
                b = RomanNumbers.fromRoman(numbers[1]);
                if (a > 0 & a <= 10 & b > 0 & b <= 10)  {
                    System.out.println(RomanNumbers.toRoman(a / b));
                } else {
                    System.out.println("Калькулятор принимають от 1 до 10 включительно, не более.");
                }
            } else {
                a = Integer.valueOf(numbers[0]);
                b = Integer.valueOf(numbers[1]);
                if (a > 0 & a <= 10 & b > 0 & b <= 10)  {
                    System.out.println(a / b);
                } else {
                    System.out.println("Калькулятор принимають от 1 до 10 включительно, не более.");  }
            }
        }
    }
}
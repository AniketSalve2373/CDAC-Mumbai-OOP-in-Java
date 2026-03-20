// 9. Create a simple calculator using switch: 
// ○ Input: two numbers + operator 
// ○ Perform: +, -, *, / 

import java.util.Scanner;

public class _9_calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number : ");
        double num1 = sc.nextDouble();
        System.out.println("enter the second number : ");
        double num2 = sc.nextDouble();

        System.out.println("Enter the operators (+,-,*,/)");

        char operator = sc.next().charAt(0);
        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("result is = " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Result = " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Result = " + result);
                break;
            case '/':
                result = num1 / num2;
                System.out.println("Result = " + result);
                break;
            default:
                System.out.println("Invalid operator !");

                sc.close();

        }

    }
}

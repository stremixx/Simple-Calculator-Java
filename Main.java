// this is to learn how to code a calculator in java :)

import java.util.Scanner;
import java.lang.Math;
import java.io.*;
import java.lang.*;

public class Main
{
    public static void main(String[] args) throws Exception
    {

        //variables as integers
        double numero1,numero2;

        //creates a scanner object to grab inputs
        Scanner sc = new Scanner(System.in);

        //Enter the inputs
        System.out.println("Enter the first number");
        numero1 = sc.nextDouble();

        //Enter the second input
        System.out.println("Enter the second number");
        numero2 = sc.nextDouble();aracter-type variables and methods. It is capable of holding the unsigned 16-bit Unicode characters.

        //enter the operator
        System.out.println("Enter the Operator");
        char operator = sc.next().charAt(0);
        //char is the UNICODE symbol variable
        double result = 0;

        switch (operator) {
            //cases for every operator
            case '+':
            result = numero1 + numero2;
            break;

            case '-':
                result = numero1 - numero2;
                break;

            case '/':
                result = numero1 / numero2;
                break;

            case '*':
                result = numero1 * numero2;
                break;

            default:
                System.out.println("You enter the WRONG input");
        }
        System.out.println("The result is ");
        System.out.print(" ");

        System.out.println(numero1 + " " + operator + " " + numero2
        + " = " + result);


    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package methodslab;
import java.util.Scanner;
/**
 *
 * @author RIVERA_CPE112
 */
public class MethodsLab { 
    public static void greetUser() {
        System.out.println("Hello, welcome to the Math program!");
    }

    public static int number1(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static int number2(int a, int b) {
        int subtract = a - b;
        return subtract;
    }

    public static int number3(int a, int b) {
        int multiply = a * b;
        return multiply;
    }

    public static int number4(int a, int b) {
        int division = a / b;
        return division;
    }

    public static int factorial(int n) {
        int a = n--;
        for (int b = n; b >= 1; b--) {
            a *= b;
        }
        return a;
    }

    public static int sumArray(int[] arr) {
        int sum = 0;
        for (int a = 0; a < arr.length; a++) {
            sum += arr[a];
        }
        return sum;
    }

    public static String isPrime(int n) {
        String a = "not a prime";
        if (n < 0) {
            a = "not a prime";
        } else if (n == 2) {
            a = "prime";
        } else if (n % 2 == 0) {
            a = "not a prime";
        } else if (n % 1 == 0) {
            a = "prime";
        }
        return a;
    }
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //TASK 1
        greetUser();
        //TASK 2
        System.out.print("Enter two numbers\nType Here: ");
        int a = input.nextInt();
        System.out.print("Type Here: ");
        int b = input.nextInt();
        System.out.println("Addition: " + number1(a, b) + "\nSubtraction: " + number2(a, b) + "\nMultiplication: " + number3(a, b) + "\nDivision: " + number4(a, b));
        //TASK 3
        System.out.print("\nEnter a number for factorial: ");
        int n = input.nextInt();
        System.out.println("Factorial: " + factorial(n));
        //TASK 4
        System.out.println("\nThe Sum of Arrray\nlets make 5 elements in array first");
        int[] number = new int[5];
        System.out.println("Enter the elements");
        for (int i = 0; i < number.length; i++) {
            System.out.print("Type here: ");
            number[i] = (input.nextInt());
        }
        System.out.println("Sum of array elements: " + sumArray(number));
        //TASK 5
        System.out.print("\nPrime number identifier");
        System.out.print("\nNow user pick any random number\ntype Here: ");
        int d = input.nextInt();
        String e = isPrime(d);
        System.out.println("The number " + d + " is a " + e);

    }

}

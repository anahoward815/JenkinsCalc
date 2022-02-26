import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        Calculator calculator = new Calculator();

        System.out.println("welcome to the calculator");
        System.out.println("Enter a command");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String command = br.readLine();

        System.out.println("Enter the first number");
        int num1 = Integer.parseInt(br.readLine());

        if (command.equals("add")) {
            System.out.println("Enter the second number");
            int num2 = Integer.parseInt(br.readLine());
            System.out.println("Result: " + calculator.add(num1, num2));
        } else if (command.equals("subtract")) {
            System.out.println("Enter the second number");
            int num2 = Integer.parseInt(br.readLine());
            System.out.println("Result: " + calculator.subtract(num1, num2));
        } else if (command.equals("multiply")) {
            System.out.println("Enter the second number");
            int num2 = Integer.parseInt(br.readLine());
            System.out.println("Result: " + calculator.multiply(num1, num2));
        } else if (command.equals("divide")) {
            System.out.println("Enter the second number");
            int num2 = Integer.parseInt(br.readLine());
            System.out.println("Result: " + calculator.divide(num1, num2));
        } else if (command.equals("fibonacciNumberFinder")) {
            System.out.println("Result: " + calculator.fibonacciNumberFinder(num1));
        } else if (command.equals("intToBinaryNumber")) {
            System.out.println("Result: " + calculator.intToBinaryNumber(num1));
        }
    }
}

public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        if (args[0].equals("add")) {
            int num1 = Integer.parseInt(args[1]);
            int num2 = Integer.parseInt(args[2]);
            System.out.println(calculator.add(num1, num2));
        } else if (args[0].equals("subtract")) {
            int num1 = Integer.parseInt(args[1]);
            int num2 = Integer.parseInt(args[2]);
            System.out.println(calculator.subtract(num1, num2));
        } else if (args[0].equals("multiply")) {
            int num1 = Integer.parseInt(args[1]);
            int num2 = Integer.parseInt(args[2]);
            System.out.println(calculator.multiply(num1, num2));
        } else if (args[0].equals("divide")) {
            int num1 = Integer.parseInt(args[1]);
            int num2 = Integer.parseInt(args[2]);
            System.out.println(calculator.divide(num1, num2));
        } else if (args[0].equals("fibonacciNumberFinder")) {
            int num1 = Integer.parseInt(args[1]);
            System.out.println(calculator.fibonacciNumberFinder(num1));
        } else if (args[0].equals("intToBinaryNumber")) {
            int num1 = Integer.parseInt(args[1]);
            System.out.println(calculator.intToBinaryNumber(num1));
        }
    }
}

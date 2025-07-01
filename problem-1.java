import java.util.Scanner;

class Calculator {
    public double calculate(double a, double b, String operation) {
        switch (operation.toLowerCase()) {
            case "add":
            case "+":
                return a + b;
            case "subtract":
            case "-":
                return a - b;
            case "multiply":
            case "*":
                return a * b;
            case "divide":
            case "/":
                if (b != 0) {
                    return a / b;
                } else {
                    System.out.println("Error: Division by zero!");
                    return Double.NaN;
                }
            default:
                System.out.println("Invalid operation!");
                return Double.NaN;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        double a = sc.nextDouble();

        System.out.print("Enter b: ");
        double b = sc.nextDouble();

        sc.nextLine(); 
        System.out.print("Enter operation (add, subtract, multiply, divide): ");
        String op = sc.nextLine();

        Calculator calc = new Calculator();
        double result = calc.calculate(a, b, op);

        if (!Double.isNaN(result)) {
            System.out.println("Result: " + result);
        }

        sc.close();
    }
}
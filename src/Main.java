public class Main {
    public static void main(String[] args) {
        System.out.println("");
        System.out.println("Calculator:");
        System.out.println("");

        double num1 = 15.0;
        double num2 = 3.0;

        Calculator calc = new Calculator(new AddOperation());
        System.out.printf("First number: %.1f, Second number: %.1f\n", num1, num2);

        System.out.printf("Addition: %.1f + %.1f = %.1f\n", num1, num2, calc.calculate(num1, num2));

        calc.setOperation(new SubtractOperation());
        System.out.printf("Subtraction: %.1f - %.1f = %.1f\n", num1, num2, calc.calculate(num1, num2));

        calc.setOperation(new MultiplyOperation());
        System.out.printf("Multiplication: %.1f * %.1f = %.1f\n", num1, num2, calc.calculate(num1, num2));

        calc.setOperation(new DivideOperation());
        System.out.printf("Division: %.1f / %.1f = %.2f\n", num1, num2, calc.calculate(num1, num2));
    }
}
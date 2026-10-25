public class Calculator {
    private MathOperation operation;

    public Calculator(MathOperation operation) {
        if (operation == null) {
            throw new IllegalArgumentException("Operation strategy cannot be null");
        }
        this.operation = operation;
    }

    public void setOperation(MathOperation operation) {
        if (operation == null) {
            throw new IllegalArgumentException("Operation strategy cannot be null");
        }
        this.operation = operation;
    }

    public double calculate(double num1, double num2) {
        return operation.execute(num1, num2);
    }
}
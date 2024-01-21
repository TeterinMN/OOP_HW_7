import interfaces.CalculatorModel;

// Реализация модели
public class BasicCalculatorModel implements CalculatorModel {

    @Override
    public double performOperation(double operand1, double operand2, String operator) {
        switch (operator) {
            case "+":
                return operand1 + operand2;
            case "-":
                return operand1 - operand2;
            case "*":
                return operand1 * operand2;
            case "/":
                if (operand2 != 0) {
                    return operand1 / operand2;
                } else {
                    throw new ArithmeticException("Деление на ноль");
                }
            default:
                throw new IllegalArgumentException("Неподдерживаемый оператор: " + operator);
        }
    }
}
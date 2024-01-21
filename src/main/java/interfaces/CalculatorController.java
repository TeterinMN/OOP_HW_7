package interfaces;

// Интерфейс для контроллера (Controller)
public interface CalculatorController {
    void onOperationRequested(double operand1, double operand2, String operator);
}
import interfaces.CalculatorView;

// Реализация представления
public class BasicCalculatorView implements CalculatorView {
    @Override
    public void displayResult(double result) {
        System.out.println("Результат: " + result);
    }

    @Override
    public void displayError(String errorMessage) {
        System.err.println("Ошибка: " + errorMessage);
    }
}
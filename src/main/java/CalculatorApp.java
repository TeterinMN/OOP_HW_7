import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import interfaces.CalculatorController;
import java.util.Scanner;

public class CalculatorApp {
    private static final Logger logger = LoggerFactory.getLogger(CalculatorApp.class);
    public static void main(String[] args) {
        BasicCalculatorModel model = new BasicCalculatorModel();
        BasicCalculatorView view = new BasicCalculatorView();
        CalculatorController controller = new BasicCalculatorController(model, view);

        // Использование
        try (Scanner scanner = new Scanner(System.in)) {
            // Вводим первый операнд
            System.out.print("Введите первое число: ");
            double operand1 = scanner.nextDouble();

            // Вводим оператор
            System.out.print("Введите действие (+, -, *, /): ");
            String operator = scanner.next();

            // Вводим второй операнд
            System.out.print("Введите второе число: ");
            double operand2 = scanner.nextDouble();

            // Выполняем операцию
            controller.onOperationRequested(operand1, operand2, operator);

        } catch (Exception e) {
            // Обрабатываем возможные ошибки ввода
            logger.error("Ошибка при вводе или вычислении: {}", e.getMessage());
        }
    }
}
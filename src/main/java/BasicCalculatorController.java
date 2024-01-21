import interfaces.CalculatorController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// Реализация контроллера
public class BasicCalculatorController implements CalculatorController {
    static final Logger logger = LoggerFactory.getLogger(BasicCalculatorController.class);
    private final BasicCalculatorModel model;
    private final BasicCalculatorView view;

    public BasicCalculatorController(BasicCalculatorModel model, BasicCalculatorView view) {
        this.model = model;
        this.view = view;
    }

    @Override
    public void onOperationRequested(double operand1, double operand2, String operator) {
        try {
            double result = model.performOperation(operand1, operand2, operator);
            view.displayResult(result);
            logger.info(" {} {} {} = {}", operand1, operator, operand2, result);
        } catch (Exception e) {
            view.displayError(e.getMessage());
            logger.error("Ошибка при вычислении: {}", e.getMessage());
        }
    }
}
package Task1.App;

import Task1.Model.*;
import Task1.Presenter.CalculatorPresenter;
import Task1.View.CalculatorView;

//Определяем класс приложения для запуска бесконечного цикла для непрерывной работы
public class CalculatorApp {
    private final CalculatorView calculatorView = new CalculatorView(); //создаем view

    DataModels models = new DataModels(new AdditionModel(), new SubtractionModel(), new MultiplicationModel(), new DivisionModel());

    private final CalculatorPresenter presenter = new CalculatorPresenter(calculatorView, models); //создаем presenter
    private boolean flagWork = true; // флаг продолжения работы

    public void start() {
        calculatorView.messageHello();
        while (flagWork) {
            presenter.onOperation();
            flagWork = calculatorView.requestToContinue();
        }
        calculatorView.messageGoodbye();
    }
}

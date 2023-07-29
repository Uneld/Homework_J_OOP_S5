package Task1.Presenter;

import Task1.Model.*;
import Task1.View.CalculatorView;
//определяем presenter с использование всех моделей вычислений
public class CalculatorPresenter {
    private final CalculatorView view;
    private final AdditionModel additionModel;
    private final SubtractionModel subtractionModel;
    private final MultiplicationModel multiplicationModel;
    private final DivisionModel divisionModel;

    public CalculatorPresenter(CalculatorView view) {
        this.view = view;

        additionModel = new AdditionModel();
        subtractionModel = new SubtractionModel();
        multiplicationModel = new MultiplicationModel();
        divisionModel = new DivisionModel();
    }

    //метод получения ввода пользователя и вычисления результата
    public void onOperation() {
        //Получаем ввод чисел используя Task1.View
        Double num1 = view.getValue("Введите число 1: ");
        Double num2 = view.getValue("Введите число 2: ");
        //Получаем ввод оператора используя Task1.View
        String operator = view.getOperator();

        //Выполнение вычислений
        switch (operator) {
            case "+" -> {
                //использование модели суммы
                additionModel.setA(num1);
                additionModel.setB(num2);
                //вывод на консоль результата
                view.printResult(additionModel.result(), "Сумма = ");
            }
            case "-" -> {
                //использование модели разности
                subtractionModel.setA(num1);
                subtractionModel.setB(num2);
                //вывод на консоль результата
                view.printResult(subtractionModel.result(), "Разность = ");
            }
            case "*" -> {
                //использование модели произведения
                multiplicationModel.setA(num1);
                multiplicationModel.setB(num2);
                //вывод на консоль результата
                view.printResult(multiplicationModel.result(), "Произведение = ");
            }
            case "/" -> {
                //использование модели частного
                divisionModel.setA(num1);
                divisionModel.setB(num2);
                Double result = divisionModel.result();
                //вывод на консоль результата с проверкой на null если вычисление провалилось
                if (result != null) {
                    //вывод на консоль результата
                    view.printResult(result, "Частное = ");
                } else {
                    //вывод ошибки
                    view.printError();
                }
            }
            //вывод ошибки
            default -> view.printError();
        }
    }
}

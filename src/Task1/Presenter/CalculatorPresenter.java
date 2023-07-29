package Task1.Presenter;

import Task1.Model.*;
import Task1.View.CalculatorView;

//определяем presenter с использование всех моделей вычислений
public class CalculatorPresenter {
    private final CalculatorView view;

    private final DataModels models;

    public CalculatorPresenter(CalculatorView view, DataModels models) {
        this.view = view;
        this.models = models;
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
                models.getAdditionModel().setA(num1);
                models.getAdditionModel().setB(num2);
                //вывод на консоль результата
                view.printResult(models.getAdditionModel().result(), "Сумма = ");
            }
            case "-" -> {
                //использование модели разности
                models.getSubtractionModel().setA(num1);
                models.getSubtractionModel().setB(num2);
                //вывод на консоль результата
                view.printResult( models.getSubtractionModel().result(), "Разность = ");
            }
            case "*" -> {
                //использование модели произведения
                models.getMultiplicationModel().setA(num1);
                models.getMultiplicationModel().setB(num2);
                //вывод на консоль результата
                view.printResult(models.getMultiplicationModel().result(), "Произведение = ");
            }
            case "/" -> {
                //использование модели частного
                models.getDivisionModel().setA(num1);
                models.getDivisionModel().setB(num2);
                Double result = models.getDivisionModel().result();
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

package Task1.View;

import java.util.Scanner;

//определяем класс view для работы с пользователем через консоль
public class CalculatorView {
    private final Scanner scanner;

    public CalculatorView() {
        this.scanner = new Scanner(System.in);
    }

    //метод получения нового значения и выводом переданного сообщения
    public Double getValue(String title) {
        System.out.printf("%s", title);
        return Double.parseDouble(scanner.nextLine());
    }

    //метод получения оператора
    public String getOperator() {
        System.out.println("Введите оператор (+, -, *, /)");
        return scanner.nextLine();
    }

    //метод вывода результата и выводом переданного сообщения
    public void printResult(Double data, String title) {
        System.out.printf("%s %.2f\n", title, data);
    }

    //метод вывода об ошибке
    public void printError() {
        System.out.println("Введены некорректные данные, попробуйте заново");
    }

    //метод запроса на продолжение работы
    public boolean requestToContinue() {
        System.out.print("Вы хотите продолжить? (Y - продолжить, остальные - выход): ");
        String choice = scanner.nextLine();
        System.out.println("-------------------------------------");
        return choice.trim().equalsIgnoreCase("Y");
    }

    //метод вывода сообщения начала
    public void messageHello() {
        System.out.println("Запуск приложения простой калькулятор");
        System.out.println("-------------------------------------");
    }

    //метод вывода сообщения завершения
    public void messageGoodbye() {
        System.out.println("Приложение завершено");
    }
}

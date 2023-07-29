package Task1.Model;
//реализуем метод result для частного с проверкой на 0
public class DivisionModel extends СomputationModel {
    public DivisionModel() {
    }

    @Override
    public Double result() {
        if (b != 0) {
            return a / b;
        } else {
            return null;
        }
    }
}

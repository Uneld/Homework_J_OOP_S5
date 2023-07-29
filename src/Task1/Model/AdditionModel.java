package Task1.Model;

//реализуем метод result для суммы
public class AdditionModel extends СomputationModel {
    public AdditionModel() {
    }

    @Override
    public Double result() {
        return a + b;
    }
}

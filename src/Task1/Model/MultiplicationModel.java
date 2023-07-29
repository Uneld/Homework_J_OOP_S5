package Task1.Model;
//реализуем метод result для умножения
public class MultiplicationModel extends СomputationModel {
    public MultiplicationModel() {
    }

    @Override
    public Double result() {
        return a * b;
    }
}

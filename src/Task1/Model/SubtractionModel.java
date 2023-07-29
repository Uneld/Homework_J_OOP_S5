package Task1.Model;
//реализуем метод result для разности
public class SubtractionModel extends СomputationModel {
    public SubtractionModel() {
    }

    @Override
    public Double result() {
        return a - b;
    }
}

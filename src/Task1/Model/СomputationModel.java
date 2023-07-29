package Task1.Model;
// определяем абстрактный класс о том что требуется хранение двух переменных
// для дальнейших вычислений и определяем методы их назначения
public abstract class СomputationModel implements Model {
    Double a, b;

    @Override
    public void setA(Double a) {
        this.a = a;
    }

    @Override
    public void setB(Double b) {
        this.b = b;
    }
}

package Task1.Model;

public class DataModels {
    private AdditionModel additionModel;
    private SubtractionModel subtractionModel;
    private MultiplicationModel multiplicationModel;
    private DivisionModel divisionModel;

    public DataModels() {
    }

    public DataModels(AdditionModel additionModel, SubtractionModel subtractionModel, MultiplicationModel multiplicationModel, DivisionModel divisionModel) {
        this.additionModel = additionModel;
        this.subtractionModel = subtractionModel;
        this.multiplicationModel = multiplicationModel;
        this.divisionModel = divisionModel;
    }

    public void setAdditionModel(AdditionModel additionModel) {
        this.additionModel = additionModel;
    }

    public void setSubtractionModel(SubtractionModel subtractionModel) {
        this.subtractionModel = subtractionModel;
    }

    public void setMultiplicationModel(MultiplicationModel multiplicationModel) {
        this.multiplicationModel = multiplicationModel;
    }

    public void setDivisionModel(DivisionModel divisionModel) {
        this.divisionModel = divisionModel;
    }

    public AdditionModel getAdditionModel() {
        return additionModel;
    }

    public SubtractionModel getSubtractionModel() {
        return subtractionModel;
    }

    public MultiplicationModel getMultiplicationModel() {
        return multiplicationModel;
    }

    public DivisionModel getDivisionModel() {
        return divisionModel;
    }
}

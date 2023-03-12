package factoryMetod;

public class TruckLogisticFactory implements LogisticFactory{
    @Override
    public Logistic createLogistic() {
        return new Truck();
    }
}

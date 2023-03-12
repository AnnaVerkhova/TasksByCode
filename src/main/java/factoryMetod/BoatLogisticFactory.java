package factoryMetod;

public class BoatLogisticFactory implements LogisticFactory{
    @Override
    public Logistic createLogistic() {
        return new Boat();
    }
}

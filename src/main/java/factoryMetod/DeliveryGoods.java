package factoryMetod;

public class DeliveryGoods {
    public static void main(String[] args) {
        LogisticFactory logisticFactory = new BoatLogisticFactory();
        Logistic logistic = logisticFactory.createLogistic();
        logistic.delivery();
    }
}

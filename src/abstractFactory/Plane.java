package abstractFactory;

public class Plane implements ShipDelivery {

    @Override
    public int calculateDeliveryTimeInDays() {
        return 1;
    }
}

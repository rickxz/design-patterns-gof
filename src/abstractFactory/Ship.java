package abstractFactory;

public class Ship implements ShipDelivery {

    @Override
    public int calculateDeliveryTimeInDays() {
        return 7;
    }
}

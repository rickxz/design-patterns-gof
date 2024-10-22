package abstractFactory;

public class MaritimeShipFactory implements ShipAbstractFactory {

    @Override
    public ShipDelivery createShipMethodA() {
        return new Ship();
    }
}

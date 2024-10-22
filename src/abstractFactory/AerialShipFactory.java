package abstractFactory;

public class AerialShipFactory implements ShipAbstractFactory {

    @Override
    public ShipDelivery createShipMethodA() {
        return new Plane();
    }
}

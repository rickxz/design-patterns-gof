package abstractFactory;

public class LandShipFactory implements ShipAbstractFactory {

    @Override
    public ShipDelivery createShipMethodA() {
        return new MailTruck();
    }
}

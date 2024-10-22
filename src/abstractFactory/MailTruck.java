package abstractFactory;

public class MailTruck implements ShipDelivery {

    @Override
    public int calculateDeliveryTimeInDays() {
        return 5;
    }
}

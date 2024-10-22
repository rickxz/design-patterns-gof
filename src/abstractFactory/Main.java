package abstractFactory;
import java.util.Scanner;

// O design pattern de abstract factory faz parte de um dos Creational Design Patterns (design patterns que servem para facilitar a criação de objetos).
// Esse padrão provê uma interface (ShipAbstractFactory) para criar famílias (MaritimeShipFactory, LandShipFactory e AerialShipFactory) de objetos relacionados/dependentes entre si
// sem especificar suas classes concretas.

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o método de entrega que gostaria (aerial/land/maritime): ");
        String shippingDeliveryMethodChosen = scanner.nextLine();

        ShipAbstractFactory factory;

        switch(shippingDeliveryMethodChosen) {
            case "aerial" -> factory = new AerialShipFactory();
            case "land" -> factory = new LandShipFactory();
            default -> factory = new MaritimeShipFactory();
        }

        ShipDelivery shipMethod = factory.createShipMethodA();

        System.out.println("shipMethod = " + shipMethod);
        System.out.println("shipMethod.calculateDeliveryTimeInDays() = " + shipMethod.calculateDeliveryTimeInDays());
    }
}
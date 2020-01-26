package practice.interface_abstract;

public class InterfaceDemo implements CarsInterface, BMWCarsInterface {

    public void engineStart1(final String engineType, final boolean isKeyLess) {
        System.out.println("This is the implementation");
    }

    public void features(final String color, final int speed) {
        System.out.println("black  color and 50 speed");
    }
}

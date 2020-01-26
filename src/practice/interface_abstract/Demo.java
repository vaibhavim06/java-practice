package practice.interface_abstract;


public class Demo {

    public static void main(String[] args){
        final CarsInterface myObject1 = new InterfaceDemo();
        final BMWCarsInterface myObject2 = new InterfaceDemo();
        final InterfaceDemo myObject3 = new InterfaceDemo();

        myObject1.engineStart1("6 cycl" , true);
        myObject2.features("White", 70);
        myObject3.engineStart1("4 cycl" , false);
        myObject3.features("Black", 90);
    }
}

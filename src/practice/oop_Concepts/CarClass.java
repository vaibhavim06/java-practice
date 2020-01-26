package practice.oop_Concepts;

public class CarClass {
    public static void main(String args[])
    {
            Car bmw = new Car();
            bmw.setmake("BMW");
            System.out.println(bmw.getMake());

            Car benz = new Car();
            benz.setmodel("c300");
        System.out.println(benz.getModel());

            benz.setYear(1600);
        System.out.println(benz.getYear());

    }
}

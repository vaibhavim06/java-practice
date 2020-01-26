package practice.interface_abstract;

public class CarsInheritance {
    int speed;
    public CarsInheritance(){

    }
   /* public CarsInheritance(int Startspeed){
            speed = Startspeed;
    }*/
    public void increasespeed(){
        speed++;
        System.out.println("Increasing the speed of cars");
    }
    public void decreasespeed(){
        speed--;
        System.out.println("Decreasing the speed of cars");

    }
}

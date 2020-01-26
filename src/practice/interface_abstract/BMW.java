package practice.interface_abstract;

public class BMW extends CarsInheritance {

    public BMW() {
        super();
    }
  /*  public BMW(int Startspeed){
        super(Startspeed);
    }*/



    public void increasespeed(){
       // speed++;
         //super.increasespeed();
        System.out.println("Increasing the speed of cars in Bmw class");
    }
    public void colorOf(){
        String var = "blue";
        System.out.println(var);
    }

}

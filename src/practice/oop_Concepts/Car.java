package practice.oop_Concepts;

public class Car {

    private String color;

    private String make;

    private String model;

    public int year;

    public void setmake(String make){
        this.make=make;
    }
        public String getMake(){
            return this.make;
        }

    public void setmodel(String model){
        this.model=model;
    }
    public String getModel(){
        return this.model;
    }

    public void setcolor(String color){
        this.color=color;
    }
    public String getColor(){
        return this.color;
    }
    public int getYear(){
        return year;
    }
    public void setYear(int year) {
        if (year > 1900) {
            this.year = year;
        } else {
            System.out.println("This year is not valid");

        }

    }

}

package practice.interface_abstract;

public abstract class AbstractClass {

    private int privateSpeed;
    public int publicSpeed;

    public AbstractClass()
    {
            this(0);
    }
    public AbstractClass(int startSpeed){
        this.privateSpeed = startSpeed;
    }
    public void setPrivateSpeed(int pspeed)
    {
        this.privateSpeed = pspeed;
    }
    public void enginstart()
    {
        System.out.println("Engine is started");

    }

}

public class Raptor extends Bird
{
    //constructors
    public Raptor()
    {
        System.out.println("Raptor's default constructor invoked.");
    }
     
    public Raptor(boolean b)
    {
        isHungry = b;
        System.out.println("Raptor's 1-arg constructor is invoked");
    }
     
    public Raptor(double w, boolean n)
    {
        wingspan = w;
        buildNests = n;
        System.out.println("Raptor's 2-arg constructor is invoked.");
    }
     
    //methods
    public void hunt()
    {
        System.out.println(name + " is hunting.");
    }
     
    //override the parent class's version of this method
    public void layEggs()
    {
        System.out.println(name + " is a raptor and is laying eggs.");
    }
     
     
}//end Raptor

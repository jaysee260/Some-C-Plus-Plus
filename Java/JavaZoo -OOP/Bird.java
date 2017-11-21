public class Bird extends ZooAnimal
{
    //attributes
    protected double wingspan;
    protected boolean buildNests;
     
    //constructors
    public Bird()
    {
        wingspan = 0.0;
        buildNests = true;
        name = "anonymous bird";
        type = "unknown bird";
        System.out.println("Bird's default constructor invoked.");
    }
     
    public Bird(double w, boolean n)
    {
        wingspan = w;
        buildNests = n;
        System.out.println("Bird's 2-arg constructor is invoked."); 
    }
     
    public Bird(String n, String t, int a, boolean h, double w, boolean ne)
    {
        super(n, t, a, h);
        wingspan = w;
        buildNests = ne;
        System.out.println("Bird's 6-arg constructor is invoked.");
    }
     
    //methods
    public void layEggs()
    {
        System.out.println(name + " is laying eggs.");
    }
 
}//end class

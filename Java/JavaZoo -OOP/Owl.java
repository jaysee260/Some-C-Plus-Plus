public class Owl extends Raptor
{
    //constructors
    public Owl() 
    {
        System.out.println("Owl's default constructor invoked.");
    }
     
    //methods
    public void seeAtNight()
    {
        System.out.println(name + " sees at night.");
         
    }
     
    //overriding parent's version of this method
    public void layEggs()
    {
        System.out.println(name + " is an owl and is laying eggs.");
    }
 
}//end Owl

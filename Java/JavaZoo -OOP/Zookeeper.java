public class Zookeeper 
{
    //attributes
    private String name;
    private double payRate;
    private char gender;
    private boolean hasDegree;
 
     
    //constructors
     
    //methods
        //accessors or getters
    public String getName()     {return name;}
    public double getPayRate() {return payRate;}
    public char getGender()     {return gender;}
    public boolean getHasDegree() {return hasDegree;}
     
        //mutators or setters
    public void setName(String name)        {this.name = name;}
    public void setPayRate(double payRate) {this.payRate = payRate;}
    public void setGender(char gender)      {this.gender = gender;}
    public void setHasDegree(boolean hasDegree) {this.hasDegree = hasDegree;}
 
    //other (behavioural methods)
    public void feedAnimal()
    {
        System.out.println(name + " is feeding an animal.");
    }
     
    //overload feedAnimal to set up dependency on ZooAnimal
    public void feedAnimal(ZooAnimal za)
    {
        System.out.println(name + " is feeding " + za.getName());
        za.setIsHungry(false);
         
    }
     
    public void cleanCage()
    {
        System.out.println(name + " is cleaning a cage.");
    }
     
    public void cleanCage(ZooCage cage)
    {
        System.out.println(name + " is cleaning a cage.");
        cage.setIsClean(true);
    }
 
}//end Zookeeper

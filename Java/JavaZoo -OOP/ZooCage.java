public class ZooCage
{
    //attributes
    private double width;
    private double length;
    private double height;
    private boolean isClean;
    private ZooAnimal cagedAnimal;
     
    //constructors
    public ZooCage()
    {
        width = 0.0;
        length = 0.0;
        height = 0.0;
        isClean = true;
        cagedAnimal = null;
    }
     
    //4-arg constructor
    public ZooCage(double w, double l, double h, ZooAnimal za)
    {
        width = w;
        length = l;
        height = h;
        isClean = true;
        //cagedAnimal = za; creates security hole
        cagedAnimal = new ZooAnimal(za);
    }
     
    //methods
        //accessors or getters
    public double getWidth()    {return width;}
    public double getLength()   {return length;}
    public double getHeight()   {return height;}
    public boolean getIsClean() {return isClean;}
     
    //getter for cagedAnimal attribute
    public ZooAnimal getCagedAnimal()
    //{return cagedAnimal;} creates security hole
    {
        return new ZooAnimal(cagedAnimal);
    }
     
        //mutators or setters
    public void setWidth(double width)   {this.width = width;}
    public void setLength(double length) {this.length = length;}
    public void setHeight(double height) {this.height = height;}
    public void setIsClean(boolean set)  {isClean = set;}
     
    //other (behavioural methods)
 
 
}//end ZooCage

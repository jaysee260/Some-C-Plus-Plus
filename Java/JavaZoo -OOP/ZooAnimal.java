public class ZooAnimal
{
    //attributes
    protected String name;
    protected String type;
    protected int age;
    protected boolean isHungry;
    //class attribute
    //only 1 copy shared by all objects
    protected static int animalCounter = 0;
     
    //constructors
    //default constructor
    //MUST include if also have an args constructor
    public ZooAnimal()
    {
        name = "anonymous";
        type = "unknown";
        age = 0;
        isHungry = true;
        animalCounter++;
        System.out.println("ZooAnimal's default constructor was invoked");
    }
     
    //4-arg constructor
    public ZooAnimal(String n, String t, int a, boolean h)
    {
        name = n;
        type = t;
        age = a;
        isHungry = h;
        animalCounter++;
        System.out.println("ZooAnimal's 4-arg constructor was invoked.");
     
    }
     
    //1-arg constructor
    public ZooAnimal(String n)
    {
        name = n;
        animalCounter++;
        System.out.println("ZooAnimal's 1-arg constructor was invoked\n");
    }
     
    //3-arg constructor
    public ZooAnimal(String n, String t, int a)
    {
        //Explicitly call the 4-arg constructor
        this(n, t, a, true);
         
        /*
        These initializations are now not needed. Values have been initialized
        by calling 4 arg constructor
         
        name = n;
        type = t;
        age = a;
        isHungry = true; */
         
        System.out.println("ZooAnimal's 3-arg constructor was invoked");
     
    }
     
    //copy constructor
    public ZooAnimal(ZooAnimal z)
    {
        name = z.name;
        type = z.type;
        age = z.age;
        isHungry = z.isHungry;
    }
     
    //methods
        //accessors or getters
    public String getName() {return name;}
    public String getType() {return type;}
    public int getAge()         {return age;}
    public boolean getIsHungry() {return isHungry;}
    public static int getAnimalCount() {return animalCounter;}
     
        //mutators or setters
    public void setName(String n) {name = n;}
    public void setType(String t) {type = t;}
    public void setAge(int a)       {age = a;}
    public void setIsHungry(boolean is) {isHungry = is;}
     
    //other (models object's behaviour)
    public void eat()
    {
        System.out.println(name + " is eating.");
        isHungry = false;
    }
     
    public void sleep()
    {
        System.out.println(name + " is sleeping.");
    }
     
 
}//end ZooAnimal

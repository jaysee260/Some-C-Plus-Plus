import java.util.ArrayList;
 
public class ZooDriver
{
    public static void main(String[] args)
    {
        //Instantiating object using default constructor
        ZooAnimal myZooAnimal = new ZooAnimal();
         
        //Display object's instance variables
        //It displays the default values
        System.out.println(myZooAnimal.getName());
        System.out.println(myZooAnimal.getType());
        System.out.println(myZooAnimal.getAge());
        System.out.println(myZooAnimal.getIsHungry());
         
        //Call object's setters to initialize instance variables
        myZooAnimal.setName("Simba");
        myZooAnimal.setType("Lion");
        myZooAnimal.setAge(5);
        myZooAnimal.setIsHungry(true);
         
        //Display object's new values
        System.out.println();
        System.out.println(myZooAnimal.getName());
        System.out.println(myZooAnimal.getType());
        System.out.println(myZooAnimal.getAge());
        System.out.println(myZooAnimal.getIsHungry());
         
        //Call object's behavioural methods
        myZooAnimal.eat();
        myZooAnimal.sleep();
         
        //Test to see if object is still hungry
        System.out.println(myZooAnimal.getIsHungry());
         
        //Instantiate a Zookeeper object
        Zookeeper myZookeeper = new Zookeeper();
         
        //Display attribute values
        System.out.println();
        System.out.println(myZookeeper.getName());
        System.out.println(myZookeeper.getPayRate());
        System.out.println(myZookeeper.getGender());
        System.out.println(myZookeeper.getHasDegree());
         
        //Initialize attribute values
        myZookeeper.setName("Harry");
        myZookeeper.setPayRate(16.75);
        myZookeeper.setGender('M');
        myZookeeper.setHasDegree(true);
         
        //Display attribute values
        System.out.println();
        System.out.println(myZookeeper.getName());
        System.out.println(myZookeeper.getPayRate());
        System.out.println(myZookeeper.getGender());
        System.out.println(myZookeeper.getHasDegree());
         
        //Create another ZooAnimal using 4-arg constructor
        ZooAnimal yourZooAnimal = new ZooAnimal("Necky", "Giraffe", 12, true);
         
        //Display new ZooAnimal's values
        System.out.println();
        System.out.println(yourZooAnimal.getName());
        System.out.println(yourZooAnimal.getType());
        System.out.println(yourZooAnimal.getAge());
        System.out.println(yourZooAnimal.getIsHungry());
         
        //Display number of ZooAnimal objects created
        //Since there's only one copy of the static variable animalCounter
        //the message will be the same if invoked from ANYa object from the same class
        System.out.println("There are " + myZooAnimal.getAnimalCount() + " animals in the zoo.\n");
        System.out.println("There are " + yourZooAnimal.getAnimalCount() + " animals in the zoo.\n");
         
        //If a method is declared static, it doesn't need to be invoked through an object
        //When a method is static, it can be invoked by directly accessing the class
        System.out.println("There are " + ZooAnimal.getAnimalCount() + " animals in the zoo.\n");
 
        //Print ZooAnimal object
        System.out.println(myZooAnimal);
        System.out.println(yourZooAnimal);
         
         
        //Print ZooKeeper Object
        System.out.println(myZookeeper);
         
         
        //Call new feedAnimal method
        myZookeeper.feedAnimal(myZooAnimal);
        myZookeeper.feedAnimal(yourZooAnimal);
         
         
        //instantiate a 3rd zoo animal to cage
        ZooAnimal cagedOne = new ZooAnimal("Moe", "Tiger", 3);
         
        //Instantiate Zoo Cages
        //this links a particular ZooAnimal object with the ZooCage object
        ZooCage myZooCage = new ZooCage(12.5, 20.2, 25.0, cagedOne);
         
        //Display name of animal trapped in cage
        System.out.println(myZooCage.getCagedAnimal().getName());
         
        //Demonstrate security hole
        //use the ZooAnimal reference return from getter to change type
        myZooCage.getCagedAnimal().setType("Lizard");
        System.out.println(myZooCage.getCagedAnimal().getType());
         
        //Can also change attributes of ZooAnimal this way
        ZooAnimal secondReference = myZooCage.getCagedAnimal();
        secondReference.setType("Elephant");
        System.out.println("now type of animal in cage is " + cagedOne.getType());
         
         
        System.out.println("\nNow instantiating subclass objects\n");
         
        //Instantiate a Bird Object
        Bird myBird = new Bird(5.6, false);
        System.out.println("\n\n");
         
        //Instantiate another Bird Object
        Bird yourBird = new Bird("Big Bird", "Canary", 3, true, 30.5, false);
        System.out.println("\n\n");
         
        //Instantiate and Owl object
        Owl myOwl = new Owl();
        System.out.println("\n\n");
         
     
        System.out.println("\n");   
        //Instantiate Raptor objects
        Raptor myRaptor = new Raptor(false);
        System.out.println("\n\n");
        System.out.println("value of boolean is " + myRaptor.getIsHungry());
        System.out.println("raptor's name is " + myRaptor.getName());
        System.out.println("raptor's type is " + myRaptor.getType());
         
        System.out.println("\n\n");
        //Demonstrate generic programming
        //method that has superclass paramater can accept a subclass argument
        //Call new feedAnimal method
        myZookeeper.feedAnimal(myBird);
        myZookeeper.feedAnimal(myRaptor);
         
        System.out.println("\n");
        //Raptor inherits Bird's version of layEggs method
        //If raptor overrides method then Raptor's version called
        myRaptor.layEggs();
        //If owl overrides method then Owl's version called
        myOwl.layEggs();
         
        //Demonstrate polymorphism
        //A Bird referenc type can point to various different types of objects
        //as long as there is an inheritance relationship
        //In polymorphism, the object type determines the version of the method called
        Bird b1 = new Bird();
        Bird b2 = new Raptor();
        Bird b3 = new Owl();
         
        System.out.println("\n");
        //Use polymorphic reference variable to call methods
        //OBJECT TYPE DETERMINES WHICH VERSION OF METHOD IS CALLED
        b1.layEggs();
        b2.layEggs();
        b3.layEggs();
         
        System.out.println("\n");
        //Use ZooAnimal reference type to point to raptor
        ZooAnimal an = new Raptor();
         
        System.out.println("\n");
        //Try to call layEggs method using ZooAnimal reference variable
        //an.layEggs();
        //ok to call eat and sleep because defined in ZooAnimal class
        //REFERENCE VARIABLE DETERMINES WHAT METHODS CAN BE CALLED
        an.sleep();
        an.eat();
         
        //Because of polymorphism, can have collections of multiple types of objects
        //Collection can be of type superclass, but hold subclass objects
        ArrayList<ZooAnimal> list = new ArrayList<ZooAnimal>();
        list.add(myZooAnimal);
        list.add(myBird);
        list.add(yourBird);
        list.add(myRaptor);
        list.add(myOwl);
         
        System.out.println("\n");
        //Iterate through collection calling methods contained in ZooAnimal class
        for(ZooAnimal animal: list)
        {
            animal.sleep();
            animal.eat();
            //animal.hunt(); //can't call because hunt not defined in ZooAnimal class
        }
         
         
         
    }//end main
 
}//end class

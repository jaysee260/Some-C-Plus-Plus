import java.util.Scanner;
 
public class Exam1
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int sLimit = 0;
        int driverSpeed = 0;
        int sentinnel = 0;
        int choice; 
         
         
        System.out.print("Enter the speed limt: ");
        sLimit = keyboard.nextInt();
         
        if(sLimit < 20 || sLimit > 70)
            sLimit = validateSpeedLimit(sLimit);
         
                 
        System.out.print("Enter your speed: ");
        driverSpeed = keyboard.nextInt();
         
        if(!(driverSpeed >= sLimit))
            driverSpeed = validateUserSpeed(driverSpeed, sLimit);
             
             
        calculateSpeeding(driverSpeed, sLimit);
         
         
         
        System.out.println("\t\t 1 = Yes | 0 = No");
        System.out.print("Run program again?: ");
        choice = keyboard.nextInt();
         
         
            while(choice == 1)
            {
         
                System.out.print("Enter the speed limt: ");
            sLimit = keyboard.nextInt();
         
            if(sLimit < 20 || sLimit > 70)
                sLimit = validateSpeedLimit(sLimit);
         
                 
            System.out.print("Enter your speed: ");
                driverSpeed = keyboard.nextInt();
         
            if(!(driverSpeed >= sLimit))
                driverSpeed = validateUserSpeed(driverSpeed, sLimit);
             
             
            calculateSpeeding(driverSpeed, sLimit);
         
         
            System.out.println("\t\t 1 = Yes | 0 = No");
            System.out.print("Run program again?: ");
            choice = keyboard.nextInt();
         
            }
         
         
            System.out.println("\nThank you for using the speeding calculator");             
                 
     
    }//end main
     
     
    public static int validateSpeedLimit(int speed)
    {
        Scanner keyboard1 = new Scanner(System.in);
     
        while(speed < 20 || speed > 70)
        {
            System.out.println("\n\tERROR");
            System.out.println("Speed limit should be at least 20 and no more than 70");
            System.out.print("Enter speed limit again: ");
            speed = keyboard1.nextInt();
         
            System.out.println();
         
        }//end while
         
        return speed;
     
    }//end validateSpeedLimit
     
     
    public static int validateUserSpeed(int uSpeed, int limit)
    {
        Scanner keyboard2 = new Scanner(System.in);
     
        while(!(uSpeed >= limit))
        {
            System.out.println("\n\tERROR");
            System.out.println("Driver's speed should be at least that of speed limit");
            System.out.print("Enter your speed again: ");
            uSpeed = keyboard2.nextInt();
         
        }//end while
         
        return uSpeed;
     
    }//end validatUserSpeed
     
    public static void calculateSpeeding(int driver, int speedLimit)
    {
        int milesOver;
         
        if(driver > speedLimit)
        {
            milesOver = driver - speedLimit;
             
            if(milesOver >= 1 && milesOver <= 5)
            {
             
                if(milesOver == 1)
                {
                    System.out.print("You were going " + milesOver);
                    System.out.println(" mile over the speed limit...\n");
                    System.out.print("Don't worry, you were still within ");
                    System.out.println("the acceptable range\n");
                }
                else
                {
                    System.out.print("You were going " + milesOver);
                    System.out.println(" miles over the speed limit...");
                    System.out.print("Don't worry, you were still within ");
                    System.out.println("the acceptable range\n");
                }
                 
            }//end [1-5]
            else if(milesOver >= 6 && milesOver <= 10)
            {
                 
                System.out.print("You were going " + milesOver);
                System.out.println(" miles over the speed limit...");
                System.out.print("A bit faster than permitted but not lethal.\n");
                 
                 
            }//end [6-10]
            else if(milesOver >= 11 && milesOver <= 15)
            {
             
                System.out.print("You were going " + milesOver);
                System.out.println(" miles over the speed limit...");
                System.out.print("Try to leave earlier next time!\n");
                 
            }//end [11-15]
            else if(milesOver > 15)
            {
             
                System.out.print("You were going " + milesOver);
                System.out.println(" miles over the speed limit...");
                System.out.print("This is way too reckless!\n");
                 
            }//end [over 15]
         
        }//end if speeding
        else
        {
         
            System.out.println("You were not speeding\n");
         
        }//end else if not speeding
         
         
        //return milesOver;
     
    }//end calculateSpeeding
     
}//end class

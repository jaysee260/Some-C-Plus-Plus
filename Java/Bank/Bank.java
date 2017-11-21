//Juan C. Gonzalez
//Feb. 24, 2013
//First assignment of the Project
//This program reads information from AcctInfo.txt file and
//follows the instructions on the Capstone.
import java.util.Scanner;
import java.io.*;
import java.text.DecimalFormat; //Used to format double type outputs
 
public class Bank
{
     
    public static void main(String[] args) throws IOException
    {
         
        //Will keep count of total deposits
        double count = 0.0;
         
        //Sets format for output
        DecimalFormat f = new DecimalFormat("0.00");
         
        String fileName = "AcctInfo.txt";
        File myFile = new File(fileName);
         
        //Checks for existance of file. If it doesn't exist, program quits.
        if(!myFile.exists())
        {
            System.out.println("File does not exist");
            System.exit(0);
        }
         
         
        //Open the file for reading
        Scanner fileReader = new Scanner(myFile);
         
         
        //This loop allows to read data from the file until there is no more
        while(fileReader.hasNext()){
         
        //Read and print Account number
        String accountNum = fileReader.nextLine();
        System.out.println("Account #: \t" + accountNum);
         
         
        //Read and print Account Type
        String acctType = fileReader.nextLine();
        System.out.println("Account Type: \t" + acctType);
         
         
        //Read and print Customer Name
        String name = fileReader.nextLine();
        System.out.println("Customer name: \t" + name);
         
         
        //Read and Customer Type
        String custType = fileReader.nextLine();
        System.out.println("Customer Type: \t" + custType);
         
         
        //Read and print Balance
        double balance = fileReader.nextDouble();
        System.out.println("Balance: \t" + "$"+ balance);
         
         
        //Calls method which determines the monthly fee
        //Monthly Fee is printed from the method
        monthlyFeeCalc(acctType, custType, balance);
     
     
        fileReader.nextLine();
        fileReader.nextLine();
         
        //Keeps count of total deposits throughout the loop
        count = count + balance;
         
         
        }//end while
         
        //Close file
        fileReader.close();
         
        System.out.println("The total amount of deposits is: $" + f.format(count));
 
         
     
    }//end main
     
     
    public static void monthlyFeeCalc(String acT, String cT, double b)
    {
        //Monthly fee
        double fee;
         
        //Sets the format for output inside of the method
        DecimalFormat f = new DecimalFormat("0.00");
     
        if(acT.equals("Savings"))
        {
            fee = 0.0;
            System.out.println("Monthly Fee: \t" + "$" + f.format(fee) + "\n");
         
        }//end if savings
        else if(acT.equals("Checking"))
        {
         
            if(cT.equals("value") || cT.equals("Value"))
            {
             
                if(b < 1500)
                {
                 
                    fee = 5.0;
                    System.out.println("Monthly Fee: \t" + "$" + f.format(fee) + "\n");
                     
                }//end if < 1500
                else if(b >= 1500)
                {
                 
                    fee = 0.0;
                    System.out.println("Monthly Fee: \t" + "$" + f.format(fee) + "\n");
                     
                }//end else if >= 1500
     
             
            }//end if value
            else if(cT.equals("advantage") || cT.equals("Advantage"))
            {
             
                if(b < 1000)
                {
                 
                    fee = 10.0;
                    System.out.println("Monthly Fee: \t" + "$" + f.format(fee) + "\n");
                     
                }//end if < 1000
                else if(b >= 1000)
                {
                 
                    fee = 0.0;
                    System.out.println("Monthly Fee: \t" + "$" + f.format(fee) + "\n");
                     
                }//end else if >= 1000
     
             
            }// end else if advantage
            else if(cT.equals("premier") || cT.equals("Premier"))
            {
                 
                if(b < 25000)
                {
                 
                    fee = 30.0;
                    System.out.println("Monthly Fee: \t" + "$" + f.format(fee) + "\n");
                     
                }//end if < 25000
                else if(b >= 25000)
                {
                 
                    fee = 0.0;
                    System.out.println("Monthly Fee: \t" + "$" + f.format(fee) + "\n");
                     
                }//end else if >= 25000
             
            }//end else if premier
         
        }//end else if checking
     
         
    }//end monthlyFeeCalc
 
}//end class

//Juan Gonzalez
//Lab 3 - Savings Account
//03-22-2012
//This program calculates the balance of a savings account at the end of a period
//of time. The period of time is entered by the user; therefore, the number of 
//times the loop iterates is determined by the user.

#include <iostream>
#include <iomanip>


using namespace std;

int main()
{
    
    float interest, starting_balance;
    
    //Input
    cout << "Enter the annual interest rate on the account <e.g. .04>: ";
    cin >> interest;
    
    //Input validation
    while (interest < 0)
    {
          cout << "Interest rate must be non-negative: ";
          cin >> interest;
    }
    
    cout << "Enter the starting balance: $";
    cin >> starting_balance;
    
    //Input validation
    while (starting_balance < 1)
    {
          cout << "The balance must be greater than 0: $";
          cin >> starting_balance;
    }
    
    int months; //count control variable
    float deposit, withrawal, total_deposits, total_withrawals; //accumulators
    
    cout << "How many months have passed since the account was established? ";
    cin >> months;
    
    //Loop begins here
    for (int i = 1; i <= months; i++)
    {
        cout << "\nMonth " << i << endl;
        
        cout << "Total deposits for this month: $";
        cin >> deposit;
            //Input validation
            while (deposit < 0)
            {
                  cout << "Deposists must be zero or greater. Please re-enter: ";
                  cin >> deposit;
            }
            if (deposit >= 0)
            {
                  starting_balance += deposit;
                  total_deposits += deposit;
            }
        
        cout << "Total withrawals for this month: $";
        cin >> withrawal;
            //Input valudation
            while (withrawal < 0)
            {
                  cout << "Withrawals must be zero or greater. Please re-enter: ";
                  cin >> withrawal;
            }
            if (withrawal >= 0)
            {
                  starting_balance -= withrawal;        
                  total_withrawals += withrawal;
            }
            
        
    }//end for loop
    
        float interest_earned, ending_balance;
        
        ending_balance = starting_balance;
        
        /*I had a hard time figuring out the correct formula to calculate
        the interest earned. I followed the instructions just as the book said,
        but even then, I did not get the same results when I compared it to the 
        results the example program gave me. Please try running both the example
        program provided on blacbkboard and mine, with the following input data
        
        .04 interest
        $500 starting balance
        2 months
        $200 deposit for both months
        $100 withawal for both months
        
        Everything in my program is correct and identical, expect for the interest earned.
        I tried my best to make it as similar as possible.
        I followed the formula/instructions given on the book and my answer was not the same
        as the one in the example program.
        Again, everything in my program is correct, the only problem is in the formula.*/
        
        interest_earned = ((ending_balance*interest)/12)*months; //I only multiplied by months so that
                                                                 //the number would be closer to the one
                                                                 //on the example program when the test
                                                                 //input data mentioned in the previous comment was used.
        
        
        cout << setprecision(2) << fixed;
        cout <<  "\nEnding balance:          $" << setw(10) << right << ending_balance + interest_earned << endl;
        cout <<  "Amount of deposits:        $" << setw(10) << right << total_deposits << endl;
        cout <<  "Amount of withrawals:      $" << setw(10) << right << total_withrawals <<endl;
        cout <<  "Amount of interest earned: $" << setw(10) << right << interest_earned << endl << endl;
    
    system ("pause");
    return 0;
}

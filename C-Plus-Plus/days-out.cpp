//Juan Gonzalez
//04/10/2012
//Lab 4 - Days Out
//This program calculates the average number of days a company's employees are absent
//It implements the use of functions
 
#include <iostream>
#include <iomanip>
 
using namespace std;
 
//Function Prototypes
int userInput();
int daysMissed(int);
double averageCalc(int, int);
 
 
int main()
{
     
    //Variable declarations - (main function)
    int employees, count;
    double average;
     
    //Input
    employees = userInput(); //function call; stores returned value
    cout << endl;
     
    //Processing
    count = daysMissed(employees); //function call; stores returned value
    average = averageCalc(employees, count); //function call; stored returned value
     
    //Output
    cout << setprecision(1) << fixed ;
    cout << "\nThe average number of days missed per employee is " << average << endl;
     
    
    system ("pause");
    return 0;
     
}//end main
 
 
//Function Definitions
 
int userInput()
{
     
    //Variable declarations - (userInput function)
    int employees;
     
    cout << "How many employees does the company have? ";
    cin >> employees;
     
    //Input validation
    while (employees < 1)
        {
              cout << "The number of employees must be one or greater. ";
              cout << "Please re-enter: ";
              cin >> employees;
        }
         
        return employees;
  
}//end userInput
 
int daysMissed(int num)
{
     
    //Variable declarations - (daysMissed function)
    int missed, count;
     
     for (int i = 1; i <= num; i++)
    {
         //This if decision structures formats the spacing
         //between the # sign and the employee number in case
         //it is greater than 2 digits
        if (i < 10)
        {
           cout << "Days missed by employee # " << i << ": ";
           cin >> missed;
        }
        else
        {
           cout << "Days missed by employee #" << i << ": ";
           cin >> missed;
        }
         
        //Input validation
        while (missed < 0)
        {
              cout << "Days missed must be zero or greater. ";
              cout << "Please re-enter:";
              cin >> missed;
        }
        count += missed;
    }
     
    return count;
     
}//end daysMissed
 
double averageCalc(int employees, int count)
{
        
       //Variable declarations - (averageCalc function)
       double avg;
        
       avg = static_cast<double>(count) / employees;
       return avg;
        
}//end averageCalc

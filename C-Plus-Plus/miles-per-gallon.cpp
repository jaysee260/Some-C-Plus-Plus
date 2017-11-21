//01-19-12
//A car holds 16 gallons of gasoline and can travel 350 miles before refueling. 
//Write a program that calculates and displays the number of miles per gallon 
//of gas the car gets. Use variables of the appropriate datatype.
 
#include <iostream>
 
using namespace std;
 
int main ()
{
    //Input
    float maxGals = 16; //This is the maximum # of gallons the car can hold
    float maxMiles = 350; //This is how many miles the car can travel before refueling
     
    //Processing
    float mpg = maxMiles / maxGals; // Miles per gallon the car gets
     
    //Output
    cout << "This car gets " << mpg << " miles per gallon of gas."<< endl;
     
     
    system ("pause");
    return 0;   
     
}//end main

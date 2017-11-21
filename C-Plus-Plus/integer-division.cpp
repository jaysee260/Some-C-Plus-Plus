//01-24-2012
//This program illustrates the integer division andd remainder operations
#include <iostream>
 
using namespace std;
 
int main()
{
    cout << "5/2 is " << 5/2 << endl;
    cout << "5.0/2 is " << 5.0/2 << endl;
     
    int numerator = 2.0;         //should be a double
    int denominator = 4.0;       //should be a double
 
     
    cout << numerator/denominator << endl;
     
    //demo the remainder operator
     
    cout << "5%2 is " << 5%2 << endl;
    cout << "6 is divisible by 2 because the remainder is " << 6%2 << endl;
     
    system ("pause");
    return 0;    
}//end main

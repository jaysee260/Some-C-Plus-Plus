/* 
Juan Gonzalez
Lab 2 Speed of Sound in Gases
Date: 03/01/2012
This program computes the distance sound travels in different gases.
It gives the user a menu of 4 different gases to chose from, it asks the user the 
time in seconds the soundwave traveled, and it then computes the answer using the
data that was already provided by the book (the 4 gases).
It rounds the answer to four decimal places.
 
*/
 
#include <iostream>
#include <cmath>
#include <iomanip>
 
using namespace std;
 
int main()
{
     
    const float CARBON_DIOXIDE = 258.0;
    const float AIR = 331.5;
    const float HELIUM = 972.0;
    const float HYDROGEN = 1270.0;
    char menu_choice;
    
     
    cout << "Select a gas for the sound to travel through from the list below.\n";
    cout << "1. Carbon dioxide\n";
    cout << "2. Air\n";
    cout << "3. Helium\n";
    cout << "4. Hydrogen\n";
     
    cout << endl;
    cout << "Enter your choice: ";
    cin >> menu_choice;
     
    cout << endl;
     
    int seconds; // must be within 0 - 30 range
    float distance_traveled;
     
     
    if (menu_choice == '1')
       {
            cout << "Enter the time in seconds the soundwave traveled: ";
            cin >> seconds;
                { 
                    if ( seconds >= 0 && seconds <= 30)
                       {
                            cout << endl;     
                            cout << setprecision(4) << fixed ;
                            cout << "The soundwave traveled " << CARBON_DIOXIDE * seconds << endl;
                             
                       }
                    else
                       {
                            cout << "Enter a value greater than 0 and no greater than 30 for time. \n";
                       }   
                }
       }
    else if (menu_choice == '2')
    {
            cout << "Enter the time in seconds the soundwave traveled: ";
            cin >> seconds;
                { 
                    if ( seconds >= 0 && seconds <= 30)
                       {
                            cout << endl;     
                            cout << setprecision(4) << fixed ;
                            cout << "The soundwave traveled " << AIR * seconds << endl;
                       }
                    else
                       {
                            cout << "Enter a value greater than 0 and no greater than 30 for time. \n";
                       }      
                }
       }                       
    else if (menu_choice == '3')
    {
            cout << "Enter the time in seconds the soundwave traveled: ";
            cin >> seconds;
                { 
                    if ( seconds >= 0 && seconds <= 30)
                       {
                            cout << endl;     
                            cout << setprecision(4) << fixed ;
                            cout << "The soundwave traveled " << HELIUM * seconds << endl;
                       }
                    else
                       {
                            cout << "Enter a value greater than 0 and no greater than 30 for time. \n";
                       }      
                }
       }                
    else if (menu_choice == '4')
    {
            cout << "Enter the time in seconds the soundwave traveled: ";
            cin >> seconds;
                { 
                    if ( seconds >= 0 && seconds <= 30)
                       {
                            cout << endl;     
                            cout << setprecision(4) << fixed ;
                            cout << "The soundwave traveled " << HYDROGEN * seconds << endl;
                       }
                    else
                       {
                            cout << "Enter a value greater than 0 and no greater than 30 for time. \n";
                       }      
                }
       }       
    else
    { 
         cout << "You may only enter 1, 2, 3, or 4 for gas.\n";
    }
     
     
                 
     
     
     
     
    system ("pause");
    return 0;
     
}//end main

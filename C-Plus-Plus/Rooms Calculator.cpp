//Juan Gonzalez
//01-17-2012
//This program computes the total number of rooms in a hotel
//given the number of floors in the hotel and the number of
//rooms per floor
 
#include <iostream>
using namespace std;
 
int main ()
{  
   //Get number of floors
   int floors = 6;
   //Get number of rooms
   int rooms = 35;
    
   //Calculate total number of rooms (rooms * floors)
   int totRooms = floors * rooms;
    
   //Display total number of rooms
   cout << "The total number of rooms in the hotel is " << totRooms << endl;
 
 
   system ("pause");
   return 0;   
    
}//end main 

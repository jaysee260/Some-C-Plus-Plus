//Juan Gonzalez
//Lab 5 - Monkey Business
//May 1, 2012
//This program tracks how many pounds of food are eaten by zoo monkeys 
//over a week. It calculates an average of the amount of food eaten by all
//the monkeys. It then shows the most and the least amount eaten by any monkey.
 
#include <iostream>
#include <iomanip>
 
using namespace std;
 
//Global Constants
const int ROWS = 3;  //Number of rows for 2D array
const int COLS = 7;  //Number of columns for 2D array
 
void userInput(double [][COLS], int); 
void average(double [][COLS], int);
double getLowest(double [][COLS], int);
double getLargest(double [][COLS], int);
 
 
int main()
{
    double lowest;
    double largest;
     
    double monkeys[ROWS][COLS];
    userInput(monkeys, ROWS);
    average(monkeys, ROWS);
     
    lowest = getLowest(monkeys, ROWS);
    cout << "\nThe least amount of food eaten on any day was " << lowest << " pounds." << endl;
     
    largest = getLargest(monkeys, ROWS);
    cout << "\nThe most amount of food eaten on any day was " << largest << " pounds." << endl;
     
 
     
    system("pause");
    return 0;
     
}//end main
 
 
 
//Fills table with user input
void userInput (double table[][COLS], int rows)
{
      
     for (int x = 0; x < rows; x++)
     {
         cout << endl;
         for (int y = 0; y < COLS; y++)
         {
              
             cout << "Enter the amount eaten by monkey number " << (x + 1) << endl;
             cout << "on day " << (y + 1) << ": ";
             cin >> table[x][y];
              
             while (table[x][y] < 0)
             {
                   cout << "Enter a non-negative amount: ";
                   cin >> table[x][y];
             }
              
              
         }
            
     }
      
      
}// end monkeys
 
//Calculates average
void average (double table[][COLS], int rows)
{
      
     double total = 0;
     double average;
      
     for (int i = 0; i < rows; i++)
     {
         for (int j = 0; j < COLS; j++)
             total += table[i][j];
          
     }
      
     average = total / 21;
 
     cout << "\nThe average eaten by all the monkey's is " << average << " pounds." << endl;
        
      
      
}// end average
 
 
//Gets lowest amount of food eaten by any monkey
double getLowest(double table[][COLS], int rows)
{
     double lowest; // To hold the lowest value
      
     //Set the array's first element as lowest value
     lowest = table[0][0];
      
     for (int i = 0; i < rows; i++)
     {
         for (int j = 1; j < COLS; j++)
         {
             if (table[i][j] < lowest)
                lowest = table[i][j];
         }    
          
     }
      
     return lowest;
      
      
}//end getLowest
 
//Gets lowest amount of food eaten by any monkey
double getLargest(double table[][COLS], int rows)
{
     double largest; // To hold the lowest value
      
     //Set the array's first element as lowest value
     largest = table[0][0];
      
     for (int i = 0; i < rows; i++)
     {
         for (int j = 1; j < COLS; j++)
         {
             if (table[i][j] > largest)
                largest = table[i][j];
         }    
          
     }
      
     return largest;
      
      
}//end getLargest

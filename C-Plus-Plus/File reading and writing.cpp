//Juan Gonzalez
//02-07-2012
//This program demonstrates reading and writing to files
 
#include<iostream>
#include<fstream> //needed for file IO
#include<string>
 
using namespace std;
 
int main()
{
    //create an ofstream object for writing to a file
    ofstream fout; //creates object
     
    //link the object to a text file
    fout.open("names.txt"); //creates the file. names.txt is the name of the file
     
    //write to the file
    fout << "James ";
    fout << "Madison\n";
    fout << "Benjamin " << "Franklin";
    fout << "\nAndrew Jackson";
     
    //flush file
    fout.flush();
 
    //create a second file. must create another object, can't use fout
    ofstream fileObj2;
    fileObj2.open("poem.txt");
     
    //write to second file
    fileObj2 << "Mary had a little lamb.";
    fout << "Mary had a little lamb.";
 
    //close the file
    fout.close();
    fileObj2.close();
     
    //read from a file
    //instantiate (create) an ifstream object
    ifstream fin;
     
    //associate a file with the if stream object
    fin.open("names.txt");
     
    //read data from file
    string name;
    fin >> name; //it's storing file into variable name
    cout << "The first name is " << name << endl;
    fin >> name;
    cout << "The second name is " << name << endl;
     
    fin.ignore(); //grab new line character in buffer
     
     
    //get entire line from file
    getline(fin, name);
    cout << "The second entire line from the file is " << name << endl;
     
     
    cout << "Data has been written to file." << endl;
     
     
    system ("pause");
    return 0;   
     
}//end main

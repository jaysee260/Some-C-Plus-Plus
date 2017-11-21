#Juan Gonzalez
#April 3, 2012
#Lab 6-1
#This program converts kilometers to miles
 
 
CONVERSION_FACTOR = 0.6214
 
#Input function - This function returns the user input
def user_input():
    km_input = float(raw_input("Please enter the number of Kms you wish to convert to miles (-1 to quit): "))
    return km_input
 
#conversion function - this function makes the km to miles conversion
def conversion(km):
    miles = km * CONVERSION_FACTOR
    return miles
     
#display function - this function displays the results of the convertion with an appropiate message
def display(kmDisplay, miles):
    print kmDisplay,"kilometer(s) converts to", miles ,"miles.\n"
         
               
#main function - this is simply the maain function
def main():
    kilometers = user_input()
    while kilometers >= 0:
        miles = conversion(kilometers)
        display(kilometers, miles)
        kilometers = user_input()
    else:
        print "\nThank you for using the kilometers to miles converter."
     
     
     
 
#Main program
print "This program converts kilometers to miles"
print
 
main()

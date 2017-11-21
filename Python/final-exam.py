#Juan Gonzalez
#May 8, 2012
#Final Exam Spring 2012
 
#Global Variable
PRICE_PER_DRAWER = 45
 
import random
 
#Functions
 
#Generates random order number
def orderNum():
    order = random.randint(1, 100000)
    return order
     
#Gets and returns customer name
def customerName():
    name = raw_input("Customer Name: ")
    return name
 
#Takes length and width as parameters to calculate area, then return it
def getArea(length, width):
    area = length * width
    return area
 
#Asks for wood type, checks for valid input, and returns wood type
def woodType():
    print "\n\t\tTypes of wood"
    print "0 for pine\t","1 for oak\t","2 for cherry"
    wood = int(raw_input("Select your wood of choice: "))
     
    while wood < 0 or wood > 2:
        print "\nINVALID OPTION"
        wood = int(raw_input("Select your wood of choice: "))
         
    return wood
 
#Gets number of drawers and returns it
def getDrawers():
    drawers = int(raw_input("\nEnter the number of drawers desired: "))
    while drawers < 0:
        print "Number of drawers must be zero or greater"
        drawers = int(raw_input("Re-enter the number of drawers: "))
         
    return drawers
 
#Calculates total amount of drawers alone
def drawersPrice(drawers):
    totalDrawersPrice = drawers * PRICE_PER_DRAWER
    return totalDrawersPrice
     
         
#Prints order summary
def printOrder(order, name, size, wood, numOfDrawers, total):
    if wood == 0:
        wood = "Pine"
    elif wood == 1:
        wood = "Oak"
    elif wood == 2:
        wood = "Cherry"
         
    print "\n---------------------------------"
    print "\tORDER SUMMARY"
    print "---------------------------------"
    print "\nOrder number:\t", order
    print "Customer:\t", name
    print "Desk size:\t", size, "square feet"
    print "Wood:\t\t", wood
    print "No. of Drawers:\t", numOfDrawers
    print "Total cost:\t$", total
         
     
#Main function
def main():
    total = 0 #Accumulator
     
    #Generates order number
    order = orderNum()
     
    #Gets customer name
    name = customerName()
     
    #Gets length and validates its value
    length = float(raw_input("Enter the desk's lenght: "))
    while length <= 0:
        print "\nLength must be greater than zero"
        length = float(raw_input("Enter the desk's lenght: "))
         
         
    #Gets length and validates its value
    width = float(raw_input("Enter the desk's width: "))
    while width <= 0:
        print "\nWidth must be greater than zero"
        width = float(raw_input("Enter the desk's width: "))
     
    #Calculates area    
    area = getArea(length, width)
    if area > 15:
        total += 75
     
    #Gets type of wood    
    wood = woodType()
    if wood == 0:
        print "You have selected pine"
    elif wood == 1:
        total += 175
        print "You have selected oak"
    elif wood == 2:
        total += 185
        print "You have selected cherry"
     
    #Asks for number of drawers    
    numOfDrawers = getDrawers()
     
    #Calculates total price of drawers alone
    totalDrawersPrice = drawersPrice(numOfDrawers)
     
    #Adds total price of drawers alone to total
    total += totalDrawersPrice
     
    #Prints order summary
    printOrder(order, name, area, wood, numOfDrawers, total)
                 
         
#Main program        
main()

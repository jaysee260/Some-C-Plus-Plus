#Juan Gonzalez
#April 4, 2012
#Lab 6-2
#Tip-n-Tax
#This program calculates and displays the total price of a meal including sales tax and tip.
 
#Global Variable
SALES_TAX = 0.0725
 
'''
====================
Function definitions
====================
'''
 
#Amount of purchase
def amtOfPurchase():
    amount = float(raw_input("Please enter the amount of your purchase: $"))
    while amount < 0:
        print "ERROR"
        print "Please enter a valid amount"
        amount = float(raw_input("Re-enter the amount of your purchase: $"))
    return amount
 
#Tip calculator
def tipPercent():
    percentTip = float(raw_input("Enter the percent tip (e.g. 15%):  %"))
    while percentTip < 0:
        print "ERROR - Invalid Input"
        percentTip = float(raw_input("Re-enter the percent tip (e.g. 15%): %"))
    percentTip /= 100
    return percentTip
     
#Sales tax calculator
def salesTaxCalc(amount):
    tax = amount * SALES_TAX
    return tax
 
#Tip calculator
def tipCalculator(amount, percentTip):
    tip = amount * percentTip
    return tip
 
#Total cost
def totalCost(amount, tax, tip):
    total = amount + tax + tip
    return total
     
#Print receipt
def preceipt(amount, tax, tip):
    print "\nPurchase:    $",amount
    print "Sales Tax:   $",round(tax,1)
    print "Tip:         $",round(tip,1)
    total = totalCost(amount, tax, tip)
    print "Total:       $", round(total,1)
     
#Main function definition
def main():
    amount = amtOfPurchase()
    percentTip = tipPercent()
    tax = salesTaxCalc(amount)
    tip = tipCalculator(amount, percentTip)
    preceipt(amount, tax, tip)
    
  
#Main program    
main()

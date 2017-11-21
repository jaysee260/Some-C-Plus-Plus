#Juan Gonzalez
#April 8, 2012
#Lab 8-1
#This program emulates a Magic 8 Ball
 
import random
 
#This function creates and returns an array which holds the 8 possible answers
def answers():
    answers = ["It is certain", "Ask again later", "Very doubtful", "Yes - Definitely", "Concentrate and ask again", "My reply is no", "Without a doubt","Don't count on it"]
    return answers
 
#This functions prompts the user for his or her questions, and it returns that question
def userq():
    question = raw_input("Ask the Magic 8 Ball something: ")
    return question
 
#This functions generates the random number that will determine the answer of the Magic 8 Ball
def randnum():
    rand = random.randint(0, 7)
    return rand
 
#This function prints a different random answer
def magicball(element, answer):
    print "The Magic 8 Ball says...:", answer[element]
     
     
#Main function  
def main():
    userQuestion = userq()
    randomNumber = randnum()
    answer = answers()
    magicball(randomNumber, answer)
 
         
         
     
#Main program    
main()
 
keepGoing = raw_input("\nWould you like to ask the Magic 8 Ball another question? (y for yes): ")
while keepGoing == 'y' or keepGoing == 'Y':
    main()
    keepGoing = raw_input("\nWould you like to ask the Magic 8 Ball another question? (y for yes): ")
else:
    print "\nThank you for asking the Magic 8 Ball"

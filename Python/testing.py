#import sqlite3

#mydbconnection = sqlite3.connect('anewdb.db') 
#mycursor = mydbconnection.cursor()

#mycursor.execute("create table Names (id INT AUTO_INCREMENT PRIMARY KEY, name VARCHAR(20) NOT NULL);")
#mycursor.fetchall()

#word = "       what  a minute i must \n try this be    cause           wow                 "

def palTest(joiword):
    if joiword == joiword[::-1]:
        return True
    return False

run = True
while (run):
    joiword = input("enter word")
    if joiword == "exit" or joiword == "q":
       # print("Palindrome test:")
        run = False
        break
    #print("Palindrome test:")
    newjoiword = "".join((joiword.split()))
    #print(newjoiword)
    print("Test results:", palTest(newjoiword))
    
    #print("Palindrome test:", is_palindrome(newstr))
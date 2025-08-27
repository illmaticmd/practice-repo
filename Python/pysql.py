import mysql.connector
import pandas as pd


#my connection object
#can commit
#can rollback to the start of any pending transaction
#tranaction: set of all or nthingchange tothe DB
#can close

mydb = mysql.connector.connect(
  host="localhost",
  user="root",
  password="mcdes",
  database="world"
)

#with connection object can make cursor object, which allows for interaction with DB
#allowsfor execute of command
#allows for fetching of data
mycursor = mydb.cursor()

#Testing.
#sql = "drop database testcreateschemawithpython;"
#mycursor.execute(sql)
#sql = "show databases;"
#mycursor.execute(sql)

sql = "select * from city where population < 1000 LIMIT 5;"
#executes sql statment/command
mycursor.execute(sql)
#fetches data
#fetchone would fetch one row
#or fetchmany or fetchall
myresult = mycursor.fetchall()
#prints result
print (f"The following is array/list of result in tuples {myresult}")

rr = myresult[::-1]




#for x in myresult:
#  print(x)

#for x in myresult:
#  for y in x:
#    print(y)


mydbpdf = pd.DataFrame(rr)
mydbps = pd.Series(rr)
print(mydbpdf)
print("above is DataFrame info")
print("Number of schemas/dbs in RDBMS")
print("below is Series info")
print(mydbps)
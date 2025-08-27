#the old way

firstname = "mack"
lastname = "duru"
fullname = "{} {}".format(firstname, lastname)
print(fullname)

#the new way 3.6 onward
fullname = f"{firstname} {lastname}"
print(fullname)
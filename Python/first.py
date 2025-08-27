numbers = [2, 4, 6, 8]
product = 1
for number in numbers:
    product = product * number
 
print('The product is:', product)



fruits = ['Banana', 'Apple', 'Lime']
loud_fruits = [fruit.upper() for fruit in fruits]
print(loud_fruits)

# List and the enumerate function
p = list(enumerate(fruits))
print(p)
[(0, 'Banana'), (1, 'Apple'), (2, 'Lime')]

names = ["Mack","Dili","Duru"]
#print(f"Hello my name is {name}.")
print(names[0])
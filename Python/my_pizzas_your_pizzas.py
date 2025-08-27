pizzas = ['pep','italian','meat lovers','buffalo','hawaiian']
friend_pizzas = pizzas[:]

pizzas.append('bbq')
friend_pizzas.append('cheese')

print("My favorite pizzas are:")
for x in pizzas:
    print(x)

print("My friend's favorite pizzas are:")
for x in friend_pizzas:
    print(x)
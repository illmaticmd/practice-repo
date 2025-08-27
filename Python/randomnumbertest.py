import random
num = random.randint(1,10)
num2 = random.randint(1,5)

def random_to_power_of_random(x,y):
    result=x**y
    return result

print('first num is ' + str(num))
print('second num is', num2)
print(random_to_power_of_random(num,num2))
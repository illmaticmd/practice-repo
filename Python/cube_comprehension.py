#Or opposite of... since.. I've been doing comprehensions. 
#FULL, NO COMPREHENSION BEBLOW:
cubes = []
for x in range(1,11):
    cube = x**3
    cubes.append(cube)
    for x in cubes:
        print(x)
cars = ["Honda","Bugatti","Lambo","Mercedes","BMW"]
f"I want to own a {cars[4]}."
print(cars)
print(f"I want to own a {cars[4]}.")
print(f"I want to own a {cars[0]}.")
cars[0] = "pento"
print(cars)
print(f"I want to own a {cars[0]}.")
cars.append("Honda")
print(cars)
print(f"I want to own a {cars[5]}.")
cars.insert(1,"Prius")
print(cars)
print(f"I want to own a {cars[5]}.")
print(f"I want to own a {cars[1]}.")
del cars[0]
print(f"I want to own a {cars[5]}.")
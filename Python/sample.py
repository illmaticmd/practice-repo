class Person:
    def __init__(self, name, age, company) -> None:
        self.name = name
        self.age = age
        self.company = company
    def __str__(self) -> str:
        return f"My name is {self.name}, I am {self.age} years old and I work for {self.company}"

if __name__ == "__main__":
    name_i = input("Whats your name? ")
    age_i = input("How old are you? ")
    comp_i = input("Company your work for? ")
    me = Person(name_i,age_i,comp_i)
    print(me)
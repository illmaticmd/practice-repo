nums = [-3,-2,-1,0,1,2,3]

#filters out each
dada = list(filter(lambda x: x % 2 == 0, nums))
print(dada)

#mutiplies each
dada = list(map(lambda x: x * 2, nums))
print(dada)


#and so what is happening here? IDK.
# dada = list(filter(lambda x: x * 2, nums))
# print(dada)
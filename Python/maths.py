num = 0
for i in range(367):
    num = num + i
print(num)

num = 0
i = 0
while i < 367:
    #i = i+1
    #print(i)
    num = num + i
    i = i+1
print(num)

def slope(x1, y1, x2, y2):
  s = (y2-y1)/(x2-x1)
  return s

print (slope(80,240,90,260)) 
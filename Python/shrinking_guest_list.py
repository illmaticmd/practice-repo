guest = ['2Pac','Biggie','Nujabes']
for artist in guest:
    print(f"Please have dinner with me {artist}, lets discuss ideas!")

print(f"Unfortunately {guest[1]} can't make it.")

guest[1] = 'Michael Jackson'
for artist in guest:
    print(f"Please have dinner with me {artist}, lets discuss ideas!")

guest.insert(0,'Dev')
guest.insert(2,'Kev')
guest.append('Alannah')

print("")

for artist in guest:
    print(f"Please have dinner with me {artist}, lets discuss ideas!")

baby = guest.pop()
print(f"\nSorry {baby}, not this time baby, next time, love you though! ^_^")
#if(len(guest) > 2)
#$for artist in guest:
                
other = guest.pop()
print(f"\nSorry {other}, invite canceled but next time for sure!")
other = guest.pop(2)
print(f"Sorry {other}, invite canceled but next time for sure!")
other = guest.pop(0)
print(f"Sorry {other}, invite canceled but next time for sure!")

for artist in guest:
    print(f"Please have dinner with me {artist}, you are still invited!")

del guest[0]
del guest[0]
print(guest)
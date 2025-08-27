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
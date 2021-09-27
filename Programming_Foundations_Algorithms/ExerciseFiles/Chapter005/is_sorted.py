items1 = [34 ,23 ,1 ,54 ,6 ,8 ,221 ,11 ,47 ,21]
items2 = [2, 3, 24, 50, 51, 54, 60, 66, 88, 99]



def is_sorted(itemlist): # first way to check
    return all(itemlist[i] <= itemlist[i+1] for i in range(len(itemlist)-1))

print(is_sorted(items1))
print(is_sorted(items2))



def is_sorted2(itemlist): # second way to check
    for i in range(0, len(itemlist)-1):
        if (itemlist[i] > itemlist[i+1]):
            return False
    return True

print(is_sorted2(items1))
print(is_sorted2(items2))

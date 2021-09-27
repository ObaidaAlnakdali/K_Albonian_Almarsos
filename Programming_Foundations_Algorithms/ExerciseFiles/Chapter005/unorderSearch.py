items = [ 34 ,23 ,1 ,54 ,6 ,8 ,221 ,11 ,47 ,21 ]

def find_item(item, itemlist):
    for i in range(0, len(itemlist)):
        if item == itemlist[i]:
            return i + 1
    
    return None

print(find_item(8, items))
print(find_item(25, items))

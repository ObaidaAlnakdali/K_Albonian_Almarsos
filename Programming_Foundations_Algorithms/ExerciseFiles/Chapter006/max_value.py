
items = [ 34 ,23 ,1 ,54 ,6 ,8 ,221 ,11 ,47 ,21 ]

def find_max(items):
    if len(items) == 1:
        return items[0]

    op1 = items[0]
    print(op1)
    op2 = find_max(items[1:])
    print(op1, op2)

    if op1 > op2:
        return op1
    else:
        return op2

# testing
print(find_max(items))

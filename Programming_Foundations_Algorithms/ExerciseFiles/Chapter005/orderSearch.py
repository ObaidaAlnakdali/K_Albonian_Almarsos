items = [ 34 ,23 ,1 ,54 ,6 ,8 ,221 ,11 ,47 ,21 ]

def binarysearch(item, itemlist):

    listsize = len(itemlist) - 1
    lowerIdx = 0
    upperIdx = listsize

    while lowerIdx <= upperIdx:
        # calculate the middle point
        midPt = (lowerIdx + upperIdx)// 2

        if itemlist[midPt] == item:
            return midPt

        if item > itemlist[midPt]:
            lowerIdx = midPt + 1
        else:
            upperIdx = midPt - 1

    if lowerIdx > upperIdx:
        return None


print(binarysearch(23, items))
print(binarysearch(87, items))
print(binarysearch(250, items))

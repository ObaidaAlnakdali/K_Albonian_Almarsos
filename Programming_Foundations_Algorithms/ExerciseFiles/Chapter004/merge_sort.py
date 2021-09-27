#  merge sort 

items = [ 34 ,23 ,1 ,54 ,6 ,8 ,221 ,11 ,47 ,21 ]

def mergesort(dataset):
    if len(dataset) > 1:
        mid = len(dataset) // 2
        leftarr = dataset[:mid]
        rightarr = dataset[mid:]

        mergeSort(leftarr)
        mergeSort(rightarr)
        i=0 # index left array
        j=0 # index right array
        k=0 # index merged array

        while i < len(leftarr) and j < len(rightarr):
            if leftarr[i] < rightarr[j]:
                dataset[k] = leftarr[i]
                i += 1
            else:
                dataset[k] = rightarr[j]
                j += 1
            k += 1

        while i < len(leftarr):
            dataset[k] = leftarr[i]
            i += 1
            k += 1

        while j < len(rightarr):
            dataset[k] = rightarr[j]
            j += 1
            k += 1
# testing method
print(items)
mergesort(items)
print(items)

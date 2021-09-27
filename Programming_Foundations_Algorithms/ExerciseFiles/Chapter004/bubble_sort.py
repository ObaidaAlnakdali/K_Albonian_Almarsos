# Bubble sort 

def bubbleSort(dataset):
    for i in range(len(dataset)-1, 0, -1):
        for j in range(i):
            if dataset[j] > dataset[j+1]:
                temp = dataset[j]
                dataset[j] = dataset[j+1]
                dataset[j+1] = temp
        print("Current state: ", dataset)


def main():
    list1 = [ 34 ,23 ,1 ,54 ,6 ,8 ,221 ,11 ,47 ,21 ]
    print("Starting state: ", list1)
    bubbleSort(list1)
    print("Final state: ", list1)


if __name__ == "__main__":
    main()

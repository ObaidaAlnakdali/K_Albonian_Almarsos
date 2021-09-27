
items = ["apple", "pear", "orange", "banana", "apple",
        "orange", "apple", "pear", "banana", "orange",
        "apple", "kiwi", "pear", "apple", "orange"]

filter = dict()

# loop over each item and add to the hashtable
for item in items:
    filter[item] = 5

# create a set from the resulting keys in the hashtable
result = set(filter.keys())
print(result)
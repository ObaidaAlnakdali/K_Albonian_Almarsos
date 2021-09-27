items1 = dict({"key1": 1, "key2": 2, "key3": "Obaida"}) # create hashtable
print(items1)


# create a hashtable an other way
items2 = {}
items2["key1"] = 5
items2["key2"] = "asd"
items2["key3"] = True
print(items2)

items2["key2"] = "two"
print(items2)


# show all HashTable
for key, value in items2.items():
    print("key: ", key, " value: ", value)

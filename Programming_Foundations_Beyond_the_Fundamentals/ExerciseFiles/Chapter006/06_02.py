infile = open("value.txt","rt")
outfile = open("value_write.txt","wt")
print("processing input")
sum = 0

for line in infile:
    sum += int(line)
    print(line.rstrip(), file = outfile)

print('\nTotal: ' + str(sum) , file = outfile)
outfile.close()
print("Complete")
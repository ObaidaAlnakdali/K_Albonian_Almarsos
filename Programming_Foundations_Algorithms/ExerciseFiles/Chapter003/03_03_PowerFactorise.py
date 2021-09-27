def power(num, pwr):
    if pwe != 0:
        return num * power(num, pwr - 1)
    else:
        return 1


def factorial(num):
    if num != 0 :
        return num * factorial(num - 1)
    else:
        return 1

x = input("inter your num factoril")
print("{}! is {}".format(x, factorial(x)))

print("{} to the power of {} is {}".format(22, 5, power(22, 5)))
print("{} to the power of {} is {}".format(11, 3, power(11, 3)))
print("{}! is {}".format(0, factorial(0)))
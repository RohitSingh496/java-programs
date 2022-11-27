def toDecimal(binary):
    decimal = 0
    i = 0
    while binary > 0:
        rem = binary % 10
        decimal = decimal + rem * (2 ** i)
        binary = binary // 10
        i += 1
    return decimal

string = input("enter binary: ")


def isBinary(string):
    if string.count('0') + string.count('1') == len(string):
        return True
    else:
        return False

if isBinary(string) is True:
    num = int(string)
    print(toDecimal(num))
else:
    print("Enter binary input only i.e in the form 0s and 1s")
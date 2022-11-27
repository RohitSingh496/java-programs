
"""def toBinary(decimal):
    if decimal == 0:
        return "0"
    
    binary = 0
    i = 0
    while(decimal > 0):
        remainder = int(decimal % 2)
    
        print(remainder, end = '')
        decimal = decimal // 2
        i += 1
    print("\n")
    return 1 """

def toBinary(decimal):
    if decimal > 0:
        toBinary(decimal // 2)
        print(decimal % 2, end = '')
    
print("This program converts a decimal number to binary!")
dec = int(input("Enter a Decimal value: "))
print("\n")
if dec == 0:
    print("0")
toBinary(dec)
print("\n")
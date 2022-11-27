num1 = int(input())
num2 = int(input())

def minSteps(x, y):
    count = 0
    while x > 1 or y > 1 :
        if y > x :
            y -= x
        elif x > y :
            x -= y
        else:
            return -1
        count += 1
    return count

result = minSteps(num1, num2)
print(result)
    
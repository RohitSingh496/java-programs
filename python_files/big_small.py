import sys
def big(arr):
    smallest = largest = arr[0]
    for i in arr:
        if i > largest:
            largest = i
        elif i < smallest:
            smallest = i
    print("Array is : ", arr)
    print("biggest is " , largest)
    print("smallest is ", smallest)


size = int(input("Enter size: "))
arr = [0] * size
print("Enter elements: ")
for i in range(size):
    arr[i] = int(input())

big(arr)

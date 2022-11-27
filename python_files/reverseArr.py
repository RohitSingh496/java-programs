def doReverse(arr,size):
    for i in range(int(size/2)):
        temp = arr[i]
        arr[i] = arr[size - 1 -i]
        arr[size - i - 1] = temp
    print("Reversed array is: " + str(arr))

size = int(input("Enter size of array: "))
arr = [0] * size

for i in range(size):
    arr[i] = int(input())

print("Entered array is : ", arr)

doReverse(arr,size)




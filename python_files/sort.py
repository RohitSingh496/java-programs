size = int(input("Enter array size: "))
myArr = [0] * size

for i in range(size):
    myArr[i] = int(input())

def doSort(arr,size):
    for i in range(size):
        for j in range(size-1):
            if arr[j] > arr[j+1] or arr[j] == arr[j+1]:
               temp = arr[j]
               arr[j] = arr[j+1]
               arr[j+1] = temp
    print(arr)
    return 1

print("Original array: ", myArr)
doSort(myArr,size)



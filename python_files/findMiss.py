def findMissing(arr, size):
    actualSum = 0
    originalSum = ( size * (size + 1) ) / 2
    for i in arr:
        actualSum = actualSum + i
    return originalSum - actualSum

myArray = [1 , 2 , 4 , 3]
size = 5
print("Missing num is " ,findMissing(myArray, size), " in " , myArray)
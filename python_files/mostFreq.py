def mostFreq(arr , n):
    max_count = 0 ;
    mostFreqNum = 0 ;

    for i in range(n):
        count = 0 ;
        for j in range(n):
            if arr[i] == arr[j]:
                count += 1

        if count > max_count:
            max_count = count 
            mostFreqNum = arr[i]
    return mostFreqNum

size = int(input("Enter size of array : "))
myArr = [0] * size
print("Enter",size," elements: ")
for i in range(size):
    myArr[i] = int(input())

print(myArr)
print("Most frequent element is", mostFreq(myArr, size))



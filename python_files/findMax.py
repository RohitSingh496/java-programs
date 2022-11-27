def findMax(lst):
    if len(lst) == 1:
        return lst[0]
    
    r = findMax(lst[1:])
    if r >= lst[0]: 
        return r
    else:
        return lst[0]


arr = [3 ,4 ,55, 5 ,6, 88]
print(findMax(arr))
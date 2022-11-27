nums1 = [2 , 3 ,7 , 4 , 5 ,8 ,10]
nums2 = [4 , 1 , 9 , 10 , 12]

def mergeArr(nums1, nums2):
    size1 = len(nums1)
    size2 = len(nums2)
    totalSize = size1 + size2
   
    result = [0] * totalSize
    for i in range(totalSize):
        if i < size1:
            result[i] = nums1[i]
            
        elif i >= size1 and i < totalSize:
            result[i] = nums2[i-size1] 
        else:
            pass
    
    return result

#resulting merged Array stored in nums3
nums3 = mergeArr(nums1,nums2)
print(nums3)

#sorted nums3
nums3 = sorted(nums3)
print(nums3)

def findMedian(nums):
    size = len(nums)
    mid = size // 2
    if size % 2 == 1:
        return nums[mid]
    else:
        return (nums[mid - 1] + nums[mid]) / 2

print("\nMedian of above sorted array is: ", findMedian(nums3))

nums1 = [1, 2 , 3 , 0 , 0 ,0]
m = 3
nums2 = [2, 3 , 5]
n = 3

right1 = m - 1
right2 = n - 1

totalSize = len(nums1) - 1
for i in range((len(nums1) - 1), -1 , -1):
    if len(nums1) == 0 or len(nums2) == 0 or right2 < 0:
        break

    if nums1[right1] > nums2[right2]:
        nums1[i] = nums1[right1]
        right1 -= 1
    elif nums1[right1] < nums2[right2]:
        nums1[i] = nums2[right2]
        right2 -= 1
    else:
        nums1[i] = nums2[right2]
        right2 -= 1
        

print(nums1)

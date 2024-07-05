# Two-Pointers-1

## Problem1 (https://leetcode.com/problems/sort-colors/)

Main logic here is we are going to keep all 0s in the left all 2s in the right and all 1s in the middle. First we will keep middle and left pointers at the start of the array and the right pointer at the last element. If the current element is 1 then we will keep on increasing mid index. If the middle element is equal to zero we will swap it with left element to keep all 0s in the left and increase the middle and left pointers. Then we will check if the middle element is 2 then if it is 2 then we will swap it with right element to keep all 2s in the right section of the array and then we will decrease the right index.



## Problem2 (https://leetcode.com/problems/3sum/)

The main idea to solve this problem is to keep one pointer fixed and we will move other two pointers throughout the array to get the desired results. First we need to sort the array and then we will iterate through the array. we will keep the the left pointer on the second element of an array and right pointer on the last element of an array. Then we will add these elements and check if the sub is 0, if it is then we will add it in the output list and increase the left pointer and decrease the right pointer. We will keep on increasing the left pointer until we find new element and we will decrease right element until we find new element. If the sum is greater than 0 that means we need smaller element in the sum so we will decrease right pointer and if the sum is less than 0 that means we need bigger element in the sum so we will increase left pointer. At the end we will return result List.



## Problem3 (https://leetcode.com/problems/container-with-most-water/)

Here we will keep left pointer on 0th element and right pointer on last element. The main logic behind area is taking minimum height to cover the area. So first we will take minimum between these to element and multiply it with the width which will be difference between these two pointers. Then we will store maximum area between current area and previously stored area. We don't want to loose the maximum height so we will check if the right pointer is high we will move left pointer and if left pointer is high we will move right pointer. At the end we will return maximum area.
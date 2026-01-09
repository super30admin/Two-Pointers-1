// For this problem, we have three pointers, left, mid, right. The left, mid pointer start at the begining of the array and the right pointer starts at the end of the array.
// we iterate through the array with mid pointer. If the mid pointer points to 0, we swap the values at left and mid pointer and increment both pointers.
// If the mid pointer points to 2, we swap the values at mid and right pointer and decrement the right pointer. If the mid pointer points to 1, we just increment the mid pointer.
// Time complexity: O(n), Space complexity: O(1)

class Solution {
    fun sortColors(nums: IntArray): Unit {
       var l = 0
       var m = 0
       var r = nums.size -1

       while(m <= r) {
        if (nums[m] == 2) {
            swap(m, r, nums) 
            r--
        } else if (nums[m] == 0) {
            swap(m, l, nums)
            m++
            l++
        } else {
            m++
        }
       }
    }

    fun swap(element1: Int, element2: Int, nums: IntArray) {
        val temp = nums[element1]
        nums[element1] = nums[element2]
        nums[element2] = temp
    }
}
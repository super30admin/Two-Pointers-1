// This solution is based on keeping 3 pointers, one for each number in the triplet. We first sort the array. We keep the first pointer fixed and use the other two pointers to pass through the array to find the sum which equals to zero. 
// If we have found the triplet, we add it to the list and then increment the middle and right pointers. We also skip the duplicate elements to avoid duplicate triplets in the result.
// Time complexity: O(n^2), Space complexity: O(1) 


class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {
        val n = nums.size       
        val result : MutableList<MutableList<Int>> = mutableListOf()
        Arrays.sort(nums)

        for(l in 0..n-1) {
            if (nums[l] > 0) break
            if (l > 0 && nums[l] == nums[l - 1]) continue
             var m = l + 1
            var r = n - 1

            while (m < r) {
                val sum = nums[l] + nums[m] + nums[r]
                if (sum == 0) {
                    // add to the list
                    val li = mutableListOf<Int>()
                    li.add(nums[l])
                    li.add(nums[m])
                    li.add(nums[r])
                    result.add(li)
                    m++
                    r--
                    
                    while(m < r && nums[m] == nums[m-1]) m++
                    while(m < r && nums[r] == nums[r+1]) r--
                } else if (sum < 0) {
                    m++
                } else {
                    r--
                }
            }
        }
    return result
    }
}
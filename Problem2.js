// Time Complexity : O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None

// Your code here along with comments explaining your approach

// In this approach, the first thing we need to do is to sort the given array in ascending order.
// After sorting the array, we are going to iterate through it and set our two pointers. 
// A left pointer will be set to a number that comes immediately after the current number and a right pointer will be set to the number at the end of the array.
// Then we are going to find our current sum which is the sum of our current number, a left number, and a right number.
// Now we check if our current sum is equal to our target sum, which in this case is 0.

// Now we check if our current sum is equal to our target sum, which in this case is 0.
// If it is equal, we just add those three numbers to our final array (triplets).
// If the current sum is less than 0, we move the left pointer to the right by one to increase the sum.
// Because we earlier sorted the given array in ascending order, we know that each number is greater than the number to its left.

// If the current sum is greater than 0, because we know that each number is smaller than the number to its right, we can move the right pointer to the left by one to decrease the sum.

/**
 * @param {number[]} nums
 * @return {number[][]}
 */
 var threeSum = function(nums) {
    nums.sort((a,b) => a - b);
    const triplets = [];
    
    for (let i = 0; i < nums.length - 2; i++) {
        if(nums[i] != nums[i-1]){ // making sure our solution set does not contain duplicate triplets
            let left = i + 1;
            let right = nums.length - 1;
            while (left < right) {
                const currentSum = nums[i] + nums[left] + nums[right];
                if (currentSum === 0){
                    triplets.push([nums[i], nums[left], nums[right]]);
                    while(nums[left] == nums[left + 1]) left ++
                    while(nums[right] == nums[right - 1]) right -- // making sure our solution set does not contain duplicate triplets
                    left ++;
                    right --;
                } else if(currentSum < 0) {
                    left ++
                } else if(currentSum > 0){
                    right --
                }
            }
        }
    }
    
    return triplets;
};
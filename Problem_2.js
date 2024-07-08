//https://leetcode.com/problems/3sum/
// Time Complexity : O(n^2)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach
// Solution is to keep ith element as constant and use either two pointer or hashing to find the remaining two pairs. 
// If duplicates found, skip them.
/**
 * @param {number[]} nums
 * @return {number[][]}
 */
var threeSum = function(nums) {
    let res =[];
    let n = nums.length
    nums.sort((a, b) => a - b) // JS needed compare function if negative and postive numbers are in array else default doesnt sort correctly. 
    //Iterate through the sorted nums keeping first element as constant
    for(let i=0; i<n-2; i++){
        //To not repeat same ith element
        if(i>0 && nums[i] == nums[i-1])
            continue;
        let left = i+1;
        let right = n-1;
        // Use two pointer method to find the elements pair that sums up to 0 with the ith element. 
        while(left<right){    
            let sum = nums[i] + nums[left]+ nums[right];
            if(sum == 0){
                res.push([nums[i], nums[left], nums[right]]);
                left++;
                right--;
                //While to not repeat elements if they are duplicates
                while(left<right && nums[left] == nums[left-1])
                    left++;
                while(left<right && nums[right] == nums[right+1])
                    right--;

            }
            else if(sum > 0)
                right--;
            else
                left++;
        }
    }
    return res;
};
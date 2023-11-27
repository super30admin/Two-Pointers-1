//Problem1 (https://leetcode.com/problems/sort-colors/)
//Accepted In LeetCode
//TC is O(n) and SC O(1)
/**
 * @param {number[]} nums
 * @return {void} Do not return anything, modify nums in-place instead.
 */
var sortColors = function(nums) {
    
    let low =0;
    let high= nums.length-1;
    let mid=0

    while(mid<=high){

        if(nums[mid] == 2){
            swap(nums,mid,high);
            high--
        }else if(nums[mid] == 0){
            swap(nums,low,mid);
            low++;
            mid++
        }
        else{
            mid++;
        }
    }

    function swap(nums, i,j){

        let temp = nums[i];
        nums[i]= nums[j];
        nums[j]= temp;

    }

};
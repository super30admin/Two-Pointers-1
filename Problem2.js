// ## Problem2 (https://leetcode.com/problems/3sum/)

// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : NONE
var threeSum = function(nums) {
    // Time Complexity : O(n^2)
    // Space Complexity : O(1)
    nums.sort((a,b)=>a-b) 
    let i=0
    let res=[]
    while(i<=nums.length-2){ 
        let j=i+1
        let k=nums.length-1
        if(nums[i]>0) break 
        if(i>=1 && nums[i]==nums[i-1]) { i++; continue }

        while(j<k){
            if(nums[i]+nums[j]+nums[k]==0){
                res.push([nums[i], nums[j], nums[k]]) 
                j++ 
                k-- 
            }

            while(j<k && nums[j]===nums[j-1]) j++ 
            while(j<k && nums[k]===nums[k+1]) k-- 
            
            if(nums[i]+nums[j]+nums[k]<0){
                j++ 
            }
            else if(nums[i]+nums[j]+nums[k]>0){
                k-- 
            }
        }
        i++
    }
    return res
};

console.log(threeSum([-1,0,1,2,-1,-4,-4,2]))

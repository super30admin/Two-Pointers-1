//Problem2 (https://leetcode.com/problems/3sum/)
//Accepted In LeetCode
//TC is O(nlogn)+O(n^2) = O(n^2) and SC is O(1)
/**
 * @param {number[]} nums
 * @return {number[][]}
 */
var threeSum = function(nums) {
    
    //sort the array

    let sortArr = nums.sort((a,b)=>a-b);

    //two pointer approch

    let n =sortArr.length
    let result = []
    let target = 0
    for(let i=0;i<n;i++){
        let low = i+1; let high = n-1;
        if(i!=0 && sortArr[i] == sortArr[i-1]) continue;
        while(low < high){
            let sum = sortArr[i] + sortArr[low] + sortArr[high];
            if(sum == 0){
                result.push([sortArr[i],sortArr[low],sortArr[high]])
                low++;
                high--;
                while(low<high && sortArr[low] == sortArr[low-1]){
                    low++;
                }
                 while(low<high && sortArr[high] == sortArr[high+1]){
                   high--;
                }
            }
            else if(sum > target){
                high--;
            }
            else{
                low++;
            }

        }
  
    }
      return result
}
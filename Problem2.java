// Time Complexity :  O(nlogn + n^2)
// Space Complexity :  O(1)
// Did this code successfully run on Leetcode :  Yes
// Any problem you faced while coding this :  No

// Sort and Travese through array. At some position i, apply two pointers method to the array from i+1 to the end


class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result= new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0; i<nums.length-2; i++){
            int j= i+1, k= nums.length-1;
            while(j<k){
                int currSum= nums[i]+nums[j]+nums[k];
                if(currSum>0){
                    k--;
                }
                else if(currSum<0){
                    j++;
                }
                else{
                    List<Integer> temp= Arrays.asList(nums[i],nums[j],nums[k]);
                    Collections.sort(temp);
                    result.add(temp);
                    // why bring both pointers together in a single step?
                    // becoz when we hit the local target sum, when we decrement or increment only one of the pointers
                    // then it is definetly not going to be equal to local target provide there are no duplicates.
                    j++;
                    k--;
                    // inorder to avoid duplicates increment/ decrement until we find a different number
                    while(j<k && nums[j]==nums[j-1]){
                        j++;
                    }
                    while(k>j && nums[k]==nums[k+1]){
                        k--;
                    }
                }
            }
            // inorder to avoid duplicates increment until we find a different number
            while(i+1<nums.length && nums[i+1]==nums[i]){
                i++;
            }
        }
        return result;
    }
}
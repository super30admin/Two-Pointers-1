// Time Complexity : O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums); //O(nlogn)
        for(int i=0; i<nums.length-2; i++){
            //remove outerloop duplicacy
            if(i>0 && nums[i]==nums[i-1]) continue;
            //Optimization - Stop the search if the very first element of the sorted array is greater than 0
            if(nums[i]>0) break;
            int target=-1*nums[i];
            int j=i+1, k=nums.length-1;
            while(j<k){
                if(nums[j]+nums[k]==target){
                    List<Integer> l = Arrays.asList(nums[i], nums[j], nums[k]);
                    list.add(l);
                    j++;
                    k--;
                    //remove innerloop duplicacy while checking if the base condition stays true
                    while(j<k && nums[j]==nums[j-1]){
                        j++;
                    }
                    //remove innerloop duplicacy while checking if the base condition stays true
                    while(j<k && nums[k]==nums[k+1]){
                        k--;
                    }
                }
                else if(nums[j]+nums[k]<target){
                    j++;
                }
                else{
                    k--;
                }
            }
        }
        return list;
    }
}

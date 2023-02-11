/*
 * Time Complexity : O(n^2)
 * Space Complexity :  O(1)
 * Did this code successfully run on Leetcode : yes
 * Any problem you faced while coding this : No
 * 
 * Approach - For this pointer we consider 3 pointers. We first sort the array and make the first pointer iterate through the entire loop.
 * The second and third pointer, iterate through the rest of the loop and check if their total sum is equal to target. We handle the duplicacy 
 * but incrementing the pointers until we get unique element. 
 */

//https://leetcode.com/problems/3sum/description/
class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> elems=new ArrayList<>();
        Arrays.sort(nums);
        int low,high;
        for(int i=0;i<nums.length-2;i++){
            if(i!=0 && nums[i]==nums[i-1]) continue;
            low = i+1;
            high=nums.length- 1;
            while(low<high){
                if(nums[i]+nums[low]+nums[high]==0){
                    List<Integer> res = Arrays.asList(nums[i],nums[low],nums[high]);
                    elems.add(res);
                    low++;
                    high--;
                    while(low<high && nums[low]==nums[low-1]) low++;
                    while(low<high && nums[high]==nums[high+1]) high--;
                }else if(nums[i]+nums[low]+nums[high]>0){
                    high--;
                }else
                    low++;
            }
        }
        return elems;
    }
}
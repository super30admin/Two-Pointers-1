// Time Complexity : O(n*n) n:array length
// Space Complexity : O(n*n) created a hashset of lists to store the lists and remove duplicates
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

//Fixing one element, then from the next index to last index using two pointer approach in finding the next two elements which gives the sum of 3 elements as 0.

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> list = new HashSet<>();
        if(nums.length < 3) 
        return new ArrayList <> (list);
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                int sum  = nums[i]+nums[j]+nums[k];
                if(sum == 0){
                    list.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    k--;
                }
                else if(sum > 0){
                    k--;
                }
                else if(sum<0)
                    j++;
            }
        }
        return new ArrayList<>(list);
}
    }

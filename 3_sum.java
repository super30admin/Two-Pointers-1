// Time Complexity :O(n^2) n-length of the array
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes 
// Any problem you faced while coding this : Had to learn and code. 
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> list  = new HashSet<>(); // set of lists to avoid duplicate lists
        if(nums==null || nums.length==0) 
            return new ArrayList<>(list);
        Arrays.sort(nums); // sort the array for the two pointer approach
        for(int i=0; i<nums.length-2;i++){ // for every i having two pointers at i+1 amd nums.length-1
            int j =i+1;
            int  k =nums.length-1;
            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];
                if(sum==0)list.add(Arrays.asList(nums[i],nums[j++],nums[k--]));// If sum is 0 then adding the three values as a list to the set
                else if (sum>0) 
                    k--;
                else if (sum<0) 
                    j++;
            }

        }
        return new ArrayList<>(list);
    }
}
// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if(nums == null || nums.length == 0){
            return result;
        }
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            if(i>0 && nums[i] == nums[i-1]){continue;}
            int low = i+1, high = nums.length - 1;
            while(low<high){
                int sum = nums[i]+nums[low]+nums[high];
                if(sum == 0){
                    List<Integer> list1 = Arrays.asList(nums[i],nums[high],nums[low]);
                    result.add(list1);
                    low++; high--;
                    while(low<high && nums[low] == nums[low-1]){
                        low++;
                    }
                    while(low<high && nums[high] == nums[high+1]){
                        high--;
                    }
                }
                else if(sum<0) low++;
                else if(sum>0) high--;
                
            }
        }
        return result;
    }
}
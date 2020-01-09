// space complexity : O(1)
// time complexity : O(n2)
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        if(nums.length<3 || nums==null) return list;
        Arrays.sort(nums);
        // taking one number at time
        for(int i=0;i<nums.length-2;i++)
        {
            if(nums[i]>0) break;
            if(i>0 && nums[i]==nums[i-1]) continue; // to avoid duplicates
            int low=i+1;
            int high=nums.length-1;
            // after fixing one number , using two pointer we will find two other numbers
            while(low<high)
            {
                int sum=nums[low]+nums[high]+nums[i];
                if(sum==0)
                {
                       list.add(Arrays.asList(nums[i],nums[low],nums[high]));
                       low++;
                       high--; 
                       // to avoid duplicates 
                       while(low<=high && nums[low]==nums[low-1]) low++;
                       while(low<=high && nums[high]==nums[high+1]) high--;
                }
                else if(sum<0)
                {
                    low++;
                }
                else{
                    high--;
                }
            }
        }
        return list;
        
    }
}
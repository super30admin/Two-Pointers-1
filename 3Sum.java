// Time Complexity : O(NlogN) + O(N^2) = O(N^2) where N is the size of the input array.
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

//Unique:
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //if(nums)        
        List<List<Integer>> result = new ArrayList<>();
        //edge cases
        int n=nums.length;
        if(n<3){ return result;}
        
        Arrays.sort(nums);
        for(int i=0; i<n-2; i++){ //-2 important
            if ((i > 0) && (nums[i - 1] == nums[i])) continue; //!important to avoid duplicates
            int low = i+1;
            int high = n-1;
            while(low<high)
            {
            int sum = nums[i] + nums[low] + nums[high];
            //System.out.println(nums[i] + " " + nums[low] + " " + nums[high] + " = " + sum);

            if(sum==0){
                //System.out.println(nums[i] + " " + nums[low] + " " + nums[high]);
                List<Integer> current = Arrays.asList(nums[i],nums[low],nums[high]);
                result.add(current); //important
                
                low++; 
                high--;
                while(low<high && nums[low]==nums[low-1]) { low++; } //!important to avoid duplicates
                while(low<high && nums[high]==nums[high+1]) { high--; } //!important to avoid duplicates
            }
            
            else if(sum<0){
                low++;
            }
            else{
                high--;
            }
        }
        }
        return result;
    }
}

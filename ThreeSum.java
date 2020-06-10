// Time Complexity : O(n^2) where n is length of array
// Space Complexity :O(1) 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        
        List<List<Integer>> res = new ArrayList<>();
        if(nums.length==0) return new ArrayList<>(res);
        
        Arrays.sort(nums);
        
        for(int i=0; i<nums.length-2;i++){ //Fix first pointer
            if(i>0 && nums[i-1]==nums[i]) continue;
            int j =i+1;
           int  k = nums.length-1;
            
            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];
                if(sum==0)
                {
                    res.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;										//if sum is 0, increase j and decrease k
                    k--;
                    while(j<k && nums[j]==nums[j-1]) j++;		//Skip all consecutive identical values
                    while(j<k && nums[k]==nums[k+1]) k--;		//Skip all consecutive identical values
                }
                    
                else if ( sum >0){k--; while(j<k && nums[k]==nums[k+1]) k--;} //Skip all consecutive identical values
                else if (sum<0){j++; while(j<k && nums[j]==nums[j-1]) j++;}	  //Skip all consecutive identical values
            }

        }
        return res;
        
    }
}
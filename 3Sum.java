// Time Complexity : o(n^2) + (nlogn)
// Space Complexity : o(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
// Leetcode : 15
//Type : 2 Pointer + sort

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        //sort the numbers array
        Arrays.sort(nums);
        
        //list for output
        List<List<Integer>> al = new ArrayList<List<Integer>>();
        int i;
        
        
        for(i = 0 ; i < nums.length -2; i++){   
            //if the nums[i] == 0 , the nums in next part will never make 0 (will always be > 0)
            if(nums[i]>0) break;
            
            
            if(( i> 0 && (nums[i]!= nums[i-1])) || i==0 ){
                int l = i+1;
                int r = nums.length -1;
                int sum = 0 - nums[i];
                
                while(l< r){
                    if(nums[l]+nums[r]== sum){
                        al.add(new ArrayList<>(Arrays.asList(nums[i], nums[l], nums[r])));
                        while(l<r && nums[l] == nums[l+1]) l++;
                        while(l<r && nums[r] == nums[r-1]) r--;
                        l++;
                        r--;
                    }
                    else if(nums[l]+nums[r]<sum){
                        l++;
                    }
                    else
                        r--;
                }
            }

        }
                
       return al; 
        
    }
}
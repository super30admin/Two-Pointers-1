// Time Complexity : O(n*n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {
        
        List<List<Integer>> result= new ArrayList<>();
        
        if(nums==null || nums.length==0)
            return result;
        
        Arrays.sort(nums);
        
        for(int i=0;i<nums.length-2;i++){
            
            if(i>0 && nums[i]==nums[i-1]) continue;
            
            int low=i+1; 
            int high=nums.length-1;
            
            while(low<high){
                int sum=nums[i]+nums[low]+nums[high];
                if(sum==0){
                    
                    List<Integer> li=Arrays.asList(nums[i],nums[low],nums[high]);
                    low++;
                    high--;
                    while(low<high && nums[low]==nums[low-1])
                        low++;
                    while(low<high && nums[i]==nums[high+1])
                        high--;
                    result.add(li);
                    
                    
                }else{
                    if(sum>0){
                        high--;
                        
                    }else{
                        low++;                        
                    }
                }
            }
        }
        return result;
        
    }
    
}

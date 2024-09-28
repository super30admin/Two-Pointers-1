//Time Complexity: O(n^2)
//Space Complexity: O(1) - not considering the output list

//Use 3 pointers to traverse

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new LinkedList<>();
        
        if(nums == null || nums.length ==0)return new LinkedList<>();
        
        int i,low, high;
        
        for(i =0;i<nums.length;i++){
            
           
            
            if(i>0 && nums[i] == nums[i-1])continue;
            
            low =i+1;
            high = nums.length -1;
            while(low<high){
            int sum = nums[i]+nums[low]+nums[high];
            
            if(sum ==0){
                
                result.add(Arrays.asList(nums[i], nums[low],nums[high]));
                low++;
                high--;
                
                while(low < high && nums[low] == nums[low-1]){low++;}
                
                while(low < high && nums[high] == nums[high+1]){high--;}
                
            }
            else if(sum<0){low++;}
            else high--;
        }
        }
        return result;
    }
}
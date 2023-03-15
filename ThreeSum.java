/*
Time Complexity  O(n*2)
Space Complexity O(n)
*/
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
     
        List<List<Integer>> r = new ArrayList<>();
        
        if(nums == null || nums.length <= 2)
            return r;
        
        Arrays.sort(nums);
        
        for(int i=0;i<nums.length-2;i++) {
            while(i > 0 && i < nums.length - 1 && nums[i] == nums[i-1])
                i++;
            
            int low = i + 1;
            int high = nums.length - 1;
            int target = 0 - nums[i];
            Set<Integer> set = new HashSet<>();
            
            for(int j = low; j <= high; j++) {
                
                int comple = target - nums[j];                
                if(set.contains(comple)) {
                    List<Integer> l1 = Arrays.asList(comple, nums[i], nums[j]);       
                    r.add(l1);
                    while(j +  1 <= high && nums[j] == nums[j + 1])
                        j++;  
                } 
                set.add(nums[j]);
                
            }            
        }
        return r;
        
    }
}

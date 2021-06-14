//Time Complexity: O(N*N)
//Space Complexity: O(1)



class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        int prevLow = Integer.MIN_VALUE;
        
        for(int low = 0; low < nums.length - 2; low++){
            if(low != 0 && nums[low] == nums[low-1])
                continue;
            List<Integer> temp = new ArrayList<Integer>();
            
            int mid = low + 1;
            int high = nums.length - 1;
        
            while(mid < high){
                int sum = nums[low] + nums[mid] + nums[high];
                if(sum == 0){
                    result.add(new ArrayList<>(Arrays.asList(nums[low], nums[mid], nums[high])));
                   while(mid < high && nums[mid+1]==nums[mid])
                       mid++;
                mid++;
                    
                }else if(sum < 0){
                    mid++;
                }else{
                    high--;
                }
            }
        
        }
        
        return result;
    }
}

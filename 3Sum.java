class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums.length == 0 || nums == null){
            return new ArrayList<>();
        }
        
        //sort the array first
        Arrays.sort(nums);
        
       List<List<Integer>> result = new ArrayList<>();
        /*
        iterate the array, and at each iteration use 2 pointers low and high initialise 
        at low =i + 1 and high = nums.length -1 to find the pair which when summed to element at i          == 0
        
        if sum > 0, high--
        else if sum < 0 low++
        if found then low++,higg-- and add number to result list
        */
        
        for(int i = 0 ;i < nums.length - 2; i++){
            if(i > 0 && nums[i] == nums[i-1])continue;
            
            //optimization
            if(nums[i] > 0)break; //as from here we will not find any triplet which sum to 0
            //same rule if applied when target sum is given, if(nums[i] > target) break;
                
            int low = i+1;
            int high = nums.length-1;
            while(low < high){
                int sum = nums[i] + nums[low] + nums[high];
                if(sum == 0){
                    List<Integer> list = Arrays.asList(nums[i] , nums[low] , nums[high]);
                    result.add(list);
                    low++;
                    high--;
                    
                    while(low < high && nums[low] == nums[low-1])low++;
                    while(low < high && nums[high] == nums[high+1])high--;                
                        
                }
                else if(sum > 0){
                    high--;
                }else{
                    low++;
                }                   
            }
        }
        return result;
    }
}
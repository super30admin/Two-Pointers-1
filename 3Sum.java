// Keeping 1 no. constant and using 2- Pointer for rest of Array
// Use 2 Pointers only on sorted array . So sort the array

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        
        for(int i=0; i<nums.length; i++){
            //check for duplicates in outer pass. Ignore the duplicates & move ahead
            if(i > 0 && nums[i] == nums[i-1])
                continue;
            
            int left = i + 1;
            int right = nums.length - 1;
            
            //2 pointer approach
            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];
                if(sum == 0){
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left ++;
                    right --;
                    //check for duplicates
                    while(left < right && nums[left] == nums[left-1])
                        left ++;
                    while(left < right && nums[right] == nums[right+1])
                        right --;
                }
                else if(sum < 0)
                    left ++;
                else
                    right --;
            }
        }
        return result;
    }
}

//Time Complexity : O(n^2)
//Space Complexity : O(1)
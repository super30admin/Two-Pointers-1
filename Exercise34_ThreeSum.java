/*********** Time Complexity: O(n) ************/
/*********** Space Complexity: O(n) ************/


class Solution {
    
    public List<List<Integer>> threeSum(int[] nums) {
        int length = nums.length;
        
        int left = 0, right = length-1;     //first and last pointers
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);                  //sorting the nums array
        
        for(int i=0; i<length-2; i++)       //since left and right are considered already
        {
            left = i+1;                     //next left
            right = length-1;               //previous right
            
            while(left < right)
            {                
                int temp_sum = nums[i] + nums[left] + nums[right];  //considering temp sum
                
                if((i==0 || nums[i]>nums[i-1]) && temp_sum == 0)    //if triplet sums upto 0 
                {
                    List<Integer> temp_list = Arrays.asList(nums[i], nums[left], nums[right]);
                    result.add(temp_list);                          //add the temp list to result list of lists
                    left++;                                         
                    right--;
                    
                    //to avoid duplicate left element
                    while(left<length-1 && nums[left] == nums[left-1]) 
                        left++;
                    //to avoid duplicate right element
                    while(right>left && nums[right] == nums[right+1])
                        right--;
                }
                
                else if((i==0 || nums[i]>nums[i-1]) && temp_sum>0)   //decrement right since temp_sum > 0
                {
                    right--;
                }
                else                                                //increment left since temp_sum < 0
                {
                    left++;
                }
            }
        }
        
        return result;
    }
}
// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

// Problem1 (https://leetcode.com/problems/sort-colors/)
class Solution {
    
    // Time complexity - O(n)
    // Space complexity - O(1)
    public void sortColors(int[] nums) {
        if(nums == null || nums.length == 0)
            return;
        
        int red = 0, blue = nums.length - 1, curr = 0;
        
        while(curr <= blue){
            if(nums[curr] == 0){
                swap(nums, curr++, red++);
            }else if(nums[curr] == 2){
                swap(nums, curr, blue--);
            }else{
                curr++;
            }
        }
    }
    
    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}

// Problem2 (https://leetcode.com/problems/3sum/)
//Non optimised solution 
class Solution {
    //Time complexity - O(n ^ 3)
    //Space complexity - O(n)
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums == null || nums.length < 3)
            return new ArrayList<>();
       
        Set<List<Integer>> set = new HashSet<>();
        
        for(int i = 0; i < nums.length - 2; i++){
             for(int j = i + 1; j < nums.length - 1; j++){
                  for(int k = j + 1; k < nums.length; k++){
                      int sum = nums[i] + nums[j] + nums[k];
                      if(sum == 0){
                          List<Integer> list = Arrays.asList(nums[i],nums[j], nums[k]);
                          
                          Collections.sort(list);
                          set.add(list);
                      }
                      
                  }
             }    
        }
        
        return new ArrayList<>(set);
        
    }
}

//Optimised solutions - 
//three pointers - time complexity - O(n ) space complexity - O(1)
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums == null || nums.length < 3)
            return new ArrayList<>();
        
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for(int i = 0; i < nums.length - 2; i++){
            if(i > 0 && nums[i] == nums[i - 1]) continue;
            if(nums[i] > 0) break;
            
            int low = i + 1;
            int high = nums.length - 1;
            
            while(low < high){
                int sum = nums[i] + nums[low] + nums[high];
                if(sum == 0){
                    List<Integer> list = Arrays.asList(nums[i] , nums[low], nums[high]);
                    res.add(list);
                    low++;
                    high--;
                    while(low < high && nums[low] == nums[low - 1]) low++;
                    while(low < high && nums[high] == nums[high + 1]) high--;
                }else if(sum < 0){
                    low ++;
                }else{
                    high --;
                }
                
               
            }
            
            
            
        }
        
        return res;
    }
}
// Problem3 (https://leetcode.com/problems/container-with-most-water/)
 //Optimised using two pointers
class Solution {
    //Optimised using two pointers - Time complexity - O(n)
    // Space Complexity - O(1)
    public int maxArea(int[] height) {
        if (height == null || height.length == 0){
            return 0;
        }
        
        int maxArea = Integer.MIN_VALUE;
        int low = 0, high = height.length - 1;
        
        while(low < high){
            maxArea = Math.max(maxArea, Math.min(height[low], height[high]) * (high - low));
            
            if(height[low] < height[high]) low ++;
            else high --;
        }
        
        
        return maxArea;
    }
}
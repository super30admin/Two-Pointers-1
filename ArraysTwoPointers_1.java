// ===========================================Three Sum============================
// Time Complexity : O(n^2) Outer loop from 0 till length -2 and inner loop Low and high from 0 to lenth of array
// Space Complexity : O(1) We are not using any auxilary data structure. Handling the duplicates by altering high and low pointers.
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// This is techinicaly 3 pointer solution where we set two pointers inside outer loop.
// Element from outer loop is added with low and high pointers of inner loop and compared aganst sum.
// If sum greater than 0 we break. If prev and current elemnt are same we continue.
// Check duplicates in inner and outer loops as well
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int sum = 0;
        
        if(nums == null|| nums.length ==0)
            return new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0; i<nums.length-2;i++){
            //Eliminate Duplicate in outer loop
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            if(nums[i]> 0)
                break;
            
            int low = i+1;
            int high = nums.length-1;
            while(low < high){
                
                sum = nums[i] + nums[low] + nums[high]; 
                if(sum ==0){
                    result.add(Arrays.asList(nums[i], nums[low], nums[high]));
                    low++;
                    high--;
                    //Eliminate Duplicates between high and low pointers(Inner loop)
                    while(low < high && nums[low] == nums[low-1])
                        low++;
                    while(low < high && nums[high] == nums[high+1])
                        high--;
                }
                else if(sum > 0){
                    high--;
                }else {
                    low++;
                }
                    
                
            }
            
                     
            }
        return result;
        }
    }


==================================Contains with most water==========================
  // Time Complexity : O(n) Loop through the array and check if the array is max.
// Space Complexity : O(1) We are not using any auxilary data structure. 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// area = height * width. Calculate the hight minimum from high and low points.
// Widhth will be difference b/w high and low along the x - axis
// Get the maximum area.
class Solution {
    public int maxArea(int[] height) {
        if(height == null|| height.length ==0)
            return -1;
        int max_area = Integer.MIN_VALUE;
        int low = 0;
        int high = height.length-1;
        while(low < high){
            max_area = Math.max(max_area, (Math.min(height[low] , height[high])) * (high - low));
        
            if(height[low] < height[high]){
                low++;
            }else{
                high--;
        }                                   
    }
        return max_area;
}
}
// =================================Color Sort======================================
// Time Complexity : O(n) Loop through the array and place 0's first, 1's second and 2's third.
// Space Complexity : O(1) We are not using any auxilary data structure. 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach
// Consider low equivalent to 0; mid equivalent to 1 and high equivalent to 2
// If mid is 0 then move mid to next pointer move mid to mid+1. Swap low and mid as mid should be 1.
// If mid is 1 then move mid to next pointer as need NOT to swap low and high ;
// If mid is 2 then swap high and low points and move high to previous pointer. As now high is set to 2;
class Solution {
    public void sortColors(int[] nums) {
        
        int mid=0;
        int low = 0;
        int high = nums.length-1;
        while(mid <= high){
            if(nums[mid] == 0){
                swap(nums, low, mid);
                mid++;
                low++;
            }else if(nums[mid] == 1){
                mid++;
            }else {
                swap(nums,high,mid);
                high--;
            }
        }
    }
    private void swap(int[] nums, int i, int j){
        int temp =nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        
    }
}

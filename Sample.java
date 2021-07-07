// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

//Max container problem
//Time o(n), n - length of i/p array
//space o(1)
class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        if(height == null || height.length==0)
            return 0;
        int low =0, high = height.length-1;
        
        while(low<high){
            int area = (high - low)*Math.min(height[low],height[high]);
            max=Math.max(area,max);
            if(height[low]<height[high])
                low++;
            else
                high--;
        }
        return max;
    }
}

//Three sum problem
//Time o(n pow 2), n - length of i/p array
// Auxillary Space 0(1) 
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        List<List<Integer>> res = new ArrayList<>();
        if(nums == null || nums.length == 0)
            return res;
        Arrays.sort(nums);
        int low = 0, high = 0;
        for(int i=0; i<nums.length -2; i++){
            low = i+1;
            high = nums.length -1;
            
            if(i!=0 && nums[i]==nums[i-1]){
                continue;
            }
            
            while(low<high){
                int sum = nums[low]+nums[high]+nums[i];
                if(sum == 0){
                    res.add(Arrays.asList(nums[i],nums[low],nums[high]));
                    low++;
                    high--;
                    while(low<high && nums[low] == nums[low-1])
                        low++;
                    while(low<high && nums[high] == nums[high+1])
                        high--;
                }
                else if(sum > 0){
                    high--;
                }
                else{
                    low++;
                }  
            }  
        }
        return res;
    }
}

//Sort colors Problem
//Time o(n), n - length of i/p array
//Space o(1)

class Solution {
    public void sortColors(int[] nums) {
        if(nums == null || nums.length == 0)
            return;
        int low = 0,mid=0, high = nums.length - 1;
        
        while(mid<=high)
        {
            if(nums[mid]==1)
                mid++;
            else if(nums[mid]==2){
                swap(nums,mid,high);
                high--;
            }
            else{
                swap(nums,mid,low);
                low++;
                mid++;
            } 
        }
    }
    
    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
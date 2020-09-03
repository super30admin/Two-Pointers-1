//3sum
// Time Complexity :O(n^2)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no


// Your code here along with comments explaining your approach
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
    List<List<Integer>> output = new ArrayList<>();
 
    for (int i = 0; i < nums.length; i++) {
        int j = i + 1;
        int k = nums.length - 1;
 
        if (i > 0 && nums[i] == nums[i - 1]) {
            continue;
        }
 
        while (j < k) {
            if (k < nums.length - 1 && nums[k] == nums[k + 1]) {
                k--;
                continue;
            }
 
            if (nums[i] + nums[j] + nums[k] > 0) {
                k--;
            } else if (nums[i] + nums[j] + nums[k] < 0) {
                j++;
            } else {
                output.add(Arrays.asList(nums[i],nums[j],nums[k]));
                j++;
                k--;
            }
        }
    }
 
    return output;
        
    }
}


//Container with most water
// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no


// Your code here along with comments explaining your approach
class Solution {
    public int maxArea(int[] height) {
        int first=0;
        int last=height.length-1;
        int area=0;
        while(first<last)
        {
            area=Math.max(area,(last-first)*Math.min(height[last],height[first]));
            if(height[first]<height[last])
            {
                first +=1;
            }
            else
                last -=1;
        }
        return area;
    }
}
//sort colors
// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no


// Your code here along with comments explaining your approach
class Solution {
    public void sortColors(int[] nums) {
        if(nums==null || nums.length==0)
            return;
        int left=0;
        int right=nums.length-1;
        int curr=0;
        while(curr<=right)
        {
            if(nums[curr]==0)
            {
                swap(nums,curr,left);
                left+=1;
                curr+=1;
            }
            else if(nums[curr]==1)
            {
                curr+=1;
            }else{
                swap(nums,curr,right);
                right-=1;
            }
        }
        }
        private void swap(int[] nums, int i, int j)
        {
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        }
    
}

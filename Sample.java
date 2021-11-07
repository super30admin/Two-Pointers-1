// sort colors

// Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

class Solution {
    public void sortColors(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        int mid = left;
        
        while(mid<=right){
            if(nums[mid]==0){
                swap(nums,left,mid);
                left++;
                mid++;
            }
            else if(nums[mid]==2){
                swap(nums,mid,right);
                right--;
            }
            else
                mid++;
        }
    }
    
    private void swap(int[] nums, int left, int right){
        int temp = nums[left];
        nums[left]=nums[right];
        nums[right]=temp;
    }
}

// 3 sum

// Time Complexity : O(n^2)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        Arrays.sort(nums);
        
        List<List<Integer>> result = new ArrayList<>();
        
        int i = 0;
        while(i<nums.length-2){
            int l = i+1;
            int r = nums.length-1;
            while(l<r){
                
                int sum = nums[i]+nums[l]+nums[r];
                if(sum==0){
                    ArrayList<Integer> triplet = new ArrayList<>();
                    triplet.add(nums[i]);
                    triplet.add(nums[l]);
                    triplet.add(nums[r]);
                    result.add(triplet);
                    
                    // avoiding duplicates for left and right
                    
                    while(l<r && nums[l]==nums[l+1]){
                        l++;
                    }
                    while(l<r && nums[r]==nums[r-1]){
                        r--;
                    }
                    
                    l++;
                    r--;
                    
                }
                else if(sum<0){
                    l++;
                }
                else{
                   
                    r--; 
                }
            }
            
            // avoiding duplicates for i
            
            while(i<nums.length-2 && nums[i]==nums[i+1]){
                i++;
            }
            i++;
        }
        
        return result;
    }
}

// container with most water

// Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

class Solution {
    public int maxArea(int[] height) {
        
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;
        int minHeight = 0;
        
        while(left<right){
            
            //area = Math.max(max, Math.min(height[left],height[right]) * (right-left))
            
            if(height[left]<height[right]){
                minHeight = height[left];
                maxArea = Math.max(maxArea, minHeight * (right-left));
                left++;
            }
            if(height[left]>height[right]){
                minHeight = height[right];
                maxArea = Math.max(maxArea, minHeight * (right-left));
                right--;
            }
            if(height[left]==height[right]){
                minHeight = height[right];
                maxArea = Math.max(maxArea, minHeight * (right-left));
                right--;
            }
            
        }
        
        return maxArea;
        
    }
}

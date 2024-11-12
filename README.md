# Two-Pointers-1

## Problem1 (https://leetcode.com/problems/sort-colors/)
## Solution 1
## Time Complexity:O(N) Space Complexity:O(1)
## We are having here three pointers so we swap the middle pointer with high 
## on getting a high value and with low on getting low value, but we continue on middle value.
class Solution {
    public void sortColors(int[] nums) {
        int low=0,mid=0,high=nums.length-1;

        while(mid<=high){
            if(nums[mid]==2)
            {
                swap(nums,mid,high);
                high--;
            }
            else if(nums[mid]==0){
                swap(nums,low,mid);
                low++;
                mid++;
            }
            else{
                mid++;
            }
        }
    }

    private void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
## Problem2 (https://leetcode.com/problems/3sum/)
## Solution 2
## Time Complexity:O(nlogn)+O(n2) Space Complexity:O(logN)
## First we will sort and for every element will be running a two pointer approach.

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
      List<List<Integer>> result=new ArrayList<>();
      Arrays.sort(nums);
      int n=nums.length;
      int target=0;
      for(int i=0;i<n;i++)
      { if(i>0 && nums[i]==nums[i-1]){continue;}
        int low=i+1,high=n-1;
        while(low<high){
            int sum=nums[i]+nums[low]+nums[high];
            if(sum==target){
                result.add(Arrays.asList(nums[i],nums[low],nums[high]));
                low++;
                high--;
                while(low<high && nums[low]==nums[low-1]){
                    low++;
                }
                while(low<high && nums[high]==nums[high+1])
                {
                    high--;
                }
            }
            else if(sum<target){
                low++;
            }
            else
            high--;
        }
      }
      return result;  
    }
}

## Problem3 (https://leetcode.com/problems/container-with-most-water/)
## Solution 3
## Time Complexity:O(n) Space Complexity:O(1)
## We will have the two pointer approach and store the max value and shift the pointer with the lower value.
class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int max=0;
        while(i<j)
        {
            int h;
            int w=j-i;
            if(height[i]<height[j])
            {
                h=height[i];
                i++;
            }
            else{
                h=height[j];
                j--;
            }
            max=Math.max(max,h*w);

        }
        return max;
    }
}
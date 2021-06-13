//Problem 1
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach

class Solution {
    //Time Complexity = O(n)
    //Space Complexity = O(1)
    public void sortColors(int[] nums) {
        if(nums==null || nums.length==0) return;
        
        int low=0; //first pointer low pointing to 0
        int mid=0; //second pointer mid pointing to 0
        int high=nums.length-1; //3rd pointer high pointing to the last index
        
        //low---0
        //mid---1
        //high---2
        
        while(mid<=high){ //while mid and high have not crossed each other
        if(nums[mid]==0) //if the mid element is 0
        {
            swap(nums,mid,low); //swap mid and low
            mid++; //increment mid and low 
            low++;
        }
        else if(nums[mid]==1) //if mid is 1
        {
            mid++; //do nothing just increment mid
        }
        else 
        {
            swap(nums,high,mid); //else swap mid and high 
            high--; //increment high 
        }
        }
        
    }
    
    private void swap(int[] nums, int i, int j)
    {
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp; 
    }
}

//Problem 2
// Time Complexity : O(n^2)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this : no

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int n=nums.length;
        
        for(int i=0; i<n ;i++)
        {
            if(i!=0 && nums[i]==nums[i-1]) continue; //ignores this iteration 
            int low=i+1; //first pointer
            int high=n-1; //second pointer
            
            while(low<high){
                int sum= nums[i]+nums[low]+nums[high]; //sum of 3 pointer
                if(sum==0) //found our pair
                {
                    List<Integer> l = Arrays.asList(nums[i], nums[low], nums[high]); //add to the list
                    result.add(l);
                    low++; high--; //move to the next pointer
                    while(low<high && nums[low] == nums[low-1]) low++; //ignore same number
                    while(low<high && nums[high] == nums[high+1]) high--;
                }
                else if(sum>0)
                {
                    high--; //if sum is greater than 0, then move towards 0 
                }
                else{
                    low++; //if sum is less than 0, then move towards 0 
                }
            }
        }
        return result;
    }
}

//Problem 3
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

class Solution {
    
    //Time Complexity = O(n)
    //Space Complexity = O(1)
    public int maxArea(int[] height) {
        
        int low= 0; //set to the first index
        int high= height.length-1; //set to the last index
        int max=0; //max is 0 initially 
            
        while(low!=high) //while both are different 
        {
             max= Math.max(max, Math.min(height[low],height[high]) * (high-low));
            //calculate the max area by finding the max between current area and max area till now
           
            if(height[low]<height[high]) //if the area is less, due to the low pointer
            {
                low++; //move to the next low pointer
            }
            else{
                high--; //else move the high pointer
            }
           
        }
        
        return max;
        
    }
}
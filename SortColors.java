//Problem 34 : Sort Colors 
// Time Complexity : O(n)
// Space Complexity : O(1);
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :No

/*
  Optimized : 1) One pass : Using two pointers and one extra pointer called mid/current. 
              2) Two pass : Using count sort, storing frequencies of elements in associated indexes and then iterating over the frequnecy array and updating input array accordingly. //TC: O(n), SC: O(1)
  Brute Force: Sort The Array
*/

class Solution34 {
    public void sortColors(int[] nums) {
        
        if(nums==null || nums.length==0){
            return;
        }
        
        int low  = 0;
        int mid  = 0;
        int high = nums.length-1;
        //TC- O(n), SC-O(1)
        //increment mid if element ==1 because we have to move 1 in mid
        //if element is 0, just swap it with low and increment low & mid
        //if element is 2, then swap it with high and decrement high because we have to move 2 to the right side, i.e we will not be increasing mid
        while(mid<=high){
            
            if(nums[mid]==1){
                mid++;
            }else if(nums[mid]==0){
                swap(nums,low,mid);
                low++;
                mid++;
            }else{
                swap(nums,mid,high);
                high--;
            }
            
            
        }
        
    
        /*count sort
        //TC: O(n), SC: O(1)
        int[] arr = new int[3];
        for(int i=0;i<nums.length;i++){
            arr[nums[i]] += 1;  
        }
        int k=0;
        for(int i=0;i<arr.length;i++){//this iteration will be constant because it is fixed of length 3
            int freq = arr[i];
            
            while(freq>0){
                nums[k++] = i;
                freq--;
            }
            
        }*/
        
    }
    
    private void swap(int[] nums,int i, int j){
        int temp = nums[i];
        nums[i]  = nums[j];
        nums[j]  = temp;
    }
}
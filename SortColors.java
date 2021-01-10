// Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :no
// Any problem you faced while coding this :yes, not understanding how to move the pointers and how to use the 0,1,2 elements
// Your code here along with comments explaining your approach
/*
        -Brute force is to sort using libraries which is O(nlogn)time
        -brute force is to have an aux array of size n, and place the elements in order red
        ,white , blue. This would have O(n) time complexity and O(n) space
        
        
    //use 3 pointers low, high and mid
    at every iteration check the element at mid
    if element is 0, swap with low , low++, mid++
    if element is 2, swap with high, high--
    else swap with mid, mid++;
    
    this is because we are given 3 elements 0,1,2 only
    
    
        
        */


class sortColors {

public void sortColors(int[] nums){
    if(nums.length == 0 || nums == null){
        return;
    }
    
    int low =0;
    int high = nums.length - 1;
    int mid =0;
    
    while(mid <= high){
        
        //3 cases here
        if(nums[mid] == 0)
        {
            swap(nums,low,mid);
            low++;
            mid++;
        }
        
        else if(nums[mid] == 1){
            mid++;
        }
        //for nums[mid] == 2, put it at end
        else{
            
            swap(nums,high,mid);
            high--;
        }
    }
    
}
        
    private void swap(int[]nums,int i,int j){
               int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
    }
}
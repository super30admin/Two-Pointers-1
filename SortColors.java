// Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :no
// Any problem you faced while coding this :yes, not understanding how to move the pointers and how to use the 0,1,2 elements
// Your code here along with comments explaining your approach
/*
        -Brute force is to sort using libraries which is O(nlogn)time
        -brute force is to have an aux array of size n, and place the elements in order red
        ,white , blue. This would have O(n) time complexity and O(n) space
        
        
        Better approach is to make use of 2 pointers, so that nums is sorted in place with 1 single pass
        this has O(n) time and o(1)space.
        
        Use 2 ppinters inintialised at start and end of array.
        At each iteration compare elements present at p1, p2 and move the only pointer towards the greater element. 
        
        
        */


class SortColors {
    public void sortColors(int[] nums) {
        
       
        //if there are no elements
        if(nums.length == 0){
            System.out.println("No input elements are present");
            return;
        }
        
        //assign 2 pointers at start and end of the array
        int p1 = 0;
        int p2 = nums.length-1;
        
        //continue to swap until the p1 and p2 cross
        while(p1 <= p2){
            //if element at p1 > element at p2, then swap
            //always move the pointers to greater side
            
            
            if(nums[p1] > nums[p2]){
                //swap here  
                swap(nums,p1,p2);
                p2--;
            }else{
                p1++;        
             }
        
    }
}
        
    private void swap(int[]nums,int p1,int p2){
               int temp = nums[p1];
                nums[p1] = nums[p2];
                nums[p2] = temp;
    }
}
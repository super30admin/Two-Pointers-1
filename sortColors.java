// Time Complexity: O(n)
// Space Complexity: O(1)
// Leetcode: 75. Sort Colors
class Solution {
    public void sortColors(int[] nums) {
        if(nums==null || nums.length<=1)
            return;
        
        int n=nums.length;
        // initialize 3 pointers lt, curr, rt
        int lt=0, rt=n-1, curr=0;
        
        while(curr<=rt)
        {
           
            //left to lt pointer there are always zeros
             if(nums[curr]==0)
                {
                    swap(nums,curr,lt);
                 // Since i am sure that there will never be 2's at lt pointer(beacuse curr pointer has already checked the elements before at lt pointer and has moved all 2's towards right). Hence i incfrease my curr pointer
                    curr++; 
                    lt++;

                }
             //right to rt pointer there are always twos
                else if(nums[curr]==2)
                {
                     swap(nums,curr,rt);
                    rt--;

                }
                else // nums[curr]==1
                {
                   curr++;

                }
            
            
        }
    }
    
    public void swap(int[] nums, int i, int j)
    {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
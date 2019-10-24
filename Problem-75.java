/*

Time Complexity: O(n)

Leetcode: Successful:
Runtime: 0 ms, faster than 100.00% of Java online submissions for Sort Colors.
Memory Usage: 35.1 MB, less than 99.21% of Java online submissions for Sort Colors.

Approach:

used two pointers, one for red element and one for blue element.
the idea is that if red and blue are at their correct position, then everything is good.

maintaing lastred i.e next index of a 0, and last index of 2 as per the correct order.

decrement blue counter and increment red counter.
where ever we find i==lastblue, we know that we have solved the problem.


*/

class Solution {
    public void sortColors(int[] nums) {
        
        int lastred=0; // next index of 0
        int lastblue=nums.length; // index of previously found 2 as per result

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                // swap and increment the lastred counter
                int temp=nums[lastred];
                nums[lastred]=0;
                nums[i]=temp;
                if(lastred!=i)
                    i--;    // decrement i to process the swapped number
                lastred++;
                    
            }
            if(nums[i]==2)
            {
                // if we are at a position where last index of 2 and i is same, that means the entire array is done
                if(lastblue==i)
                    break;
                lastblue--; // here we are decremeting first, as we are starting from nums.length
                
                // swap the elements
                int temp=nums[lastblue];
                nums[lastblue]=2;
                nums[i]=temp;
                i--;    // decrement i, to process the swapped number
   
      
              
            }
            
        }
        
      
    }
}

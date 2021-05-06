/*Approach: 
Let's have 3 pointers. Pointing to beginning, end and eventually middle.
The beggining is supposed to have all the 0s. The middle is supposed to have all the 1s and the end is 
supposed to have all the 2s. 
1. Middle cannot be made to point to middle, otherwise it might leave some elements that haven't been swapped either on the right side of the middle or left. Example: [0,1,0]
2. If middle pointer is pointing to a 2, we can swap it with the element pointed by high pointer and safely decrement the high pointer because after swapping, we know for sure that the swapped element is in the correct place.
3. Similaryly after swapping a 0, we can decrement the low pointer.
4. If it is a 1, just increment the middle because it anyway started from 0 index

Time complexity: O(n)
Space complexity: O(1)
*/
class Solution {
    public void sortColors(int[] nums) {
        int low = 0; 
        int high = nums.length-1;
        int mid = 0;
        int temp;
        
        while(low<=mid && mid<=high)
        {
            if(nums[mid]==0)
            {
                temp = nums[low];
                nums[low] = 0;
                nums[mid]=temp;
                low++; //since there's defintely a 0 at the old index after swapping
            }
            if(nums[mid]==2) //needs to go to the end
            {
                temp = nums[high];
                nums[high] = 2;
                nums[mid]=temp;
                high--; //since there's defintely a 2 at the old index after swapping
            }
            else
            {
                mid++;
            }
        }
    }
}
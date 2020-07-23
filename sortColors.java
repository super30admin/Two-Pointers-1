/** The problem is known as Dutch National Flag Problem.
 * Time Complexity : O(N) we are passing through every element in array using index pointer
 * Space Complexity : O(1) since sorting is being done in place
 * Executed on leetcode? yes
 * issues faced : no
 * Approach : start index is at beginning of array and moves to the right as soon as we encounter a zero
 * end index sits at the end of the array and it moves to the left as soon as we encounter a two.
 * so basically start and end index keep track of the next place where you can have a zero and 2 respectively.
 *
 * Algo: 
 * 1. if you get a nums[index]=0, swap nums[start] and nums[index]. increment both start and index
 * 2. if you get nums[index]=2, swap nums[end] and nums[index]. decrement end and dont do anything to index
 * because: suppose you have [0,1,2,0] and nums[start] =1 ; index is at nums[i] = 2 and nums[end] = 0, after we swap the array becomes [0,1,0,2]. now we cant do anything to index yet
 * we need to check if nums[start] and nums[index] have to be swapped, in this case, yes! we can do this in the next iteration.
 * 3. if nums[index] = 1, just increment index pointer 

 */

public class sortColors {
    sortColors(int[] nums) {
        int start = 0; //position where a zero must be there
        int end = nums.length-1; //position where 2 should be there
        //if we bring zeroes to beginning and 2s to the end, we have ones in the middle anyways
        int index = 0; 
        while(index<=end && start<end)
        {
            if(nums[index]==0)
            {
                nums[index] = nums[start];
                nums[start] = 0;
                start++;
                index++;
            }
            else if(nums[index]==2)
            {
                nums[index] = nums[end];
                nums[end] = 2;
                end--;
            }
            else
            {
                index++;
            }
        }
        System.out.print("sorted array:");
        for(int n : nums)
        {
            System.out.print(n+" ");
        }    
    }
    public static void main(String[] args) {
        int[] nums = new int[]{2,0,2,1,1,0};
        sortColors obj = new sortColors(nums);
    }

}
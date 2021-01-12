/**

Leetcode: 167. Two Sum II - Input array is sorted

Given an array of integers that is already sorted in ascending order, 
find two numbers such that they add up to a specific target number.

The function twoSum should return indices of the two numbers such that they add up to the target,
 where index1 must be less than index2.

Note:

Your returned answers (both index1 and index2) are not zero-based.
You may assume that each input would have exactly one solution and you may not use the same element twice.


[2,7,11,15], target = 9

start =0;
end = nums.length -1; // 4 -1 = 3

while( start < end) {

// if currentSum = start + end == target, then sound the pair at start and end
    int currentSum = numbers[start} + numbers[end];
    
// if currentSum start + end < target, then increment the start
// else (means currentSum > target) then decrement end

}|

Collabedit: http://collabedit.com/mbg5r
**/

class Solution
{
    public int[] twoSum(int[] numbers, int target) 
    {
       
        int start =0;
        int end = numbers.length -1;
        
        int output[] = new int[2];
        
        
        while (start < end )
        {
            int currentSum = numbers[start] + numbers[end];
            
            if( currentSum == target)
            {
                // we found the pair at start and end 
                output[0] = start+1;
                output[1] = end+1;
                return output;
            
            }
            else if ( currentSum > target)
            {
            
                end--;
            }
            else
            {
                start++;
            }
        
        }
        
        output[0] = -1;
        output[1] = -1;
        return output;
        
    }
}
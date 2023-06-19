// Time Complexity : O(n)
// Space Complexity : O(1)
    // n is the length of the given array

// Your code here along with comments explaining your approach
    //We use 2 pointers, low and high, initialized as "0" and "n-1" respectively, where n is the length of the array. We also use a variable to track the current maximum volume formed. At every iteration, we either move over low to right or high to left.
    //When the height at low is smaller than that of right, then we can say that moving the low pointer right is optimal. Because all the volumes formed with low with the other highs is smaller than the current volume. 
    //If the height at high is smaller, than we move the high pointer left. When low and high meet each other, we stop and return the maximum volume stored in the variable.

class Solution {
    public int maxArea(int[] height) {
        int maxVolume = 0;
        int low = 0;
        int high = height.length-1;
        while(low<high)
        {
            maxVolume = Math.max(maxVolume, Math.min(height[low], height[high])*(high-low));
            if (height[low]<=height[high])
            {
                low++;
            }
            else
            {
                high--;
            }
        }
        return maxVolume;
    }
}
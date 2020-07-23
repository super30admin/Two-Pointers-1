/* Time complexity: O(n)
Space complexity: O(1)

1. The container with most water is found by multiplying the distance interms of index between two elements and the minimum of the two numbers in terms of magnitude/value.
2. So, at a given point if you decide to move the pointer towards the other, you are reducing the distance which might reduce the area as well 
as long as the magnitude of the element is getting reduced.
3. To make sure, above issue doesnt occur, we move the pointer placed in a position whose element is lower then the other as we can atleast retain high magnitude/value.

*/

class Solution{
    public int maxArea(int[] height){
        int max = 0; int low = 0; int high = height.length-1;
        while(low<=high){
            max = Math.max(max, ((high-low) * (Math.min(height[high], height[low]))));

            if(height[low] < height[high]){
                low++;
            }

            else{
                high--;
            }

        }

        return max;
    }
}
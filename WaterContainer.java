//time complexity:O(n)
//space complexity:O(1)
class Solution {
    public int maxArea(int[] height) {
        int left=0;int right=height.length-1;
        int max=0;
        if (height ==null||height.length==0)
        {
            return -1;
        }
        while(left<right)
        {
            //we determine the greatest area by looking at the height 
            //i.e the value in the array. more the height more the capacity
            max=Math.max(max, (right-left)*Math.min(height[left],height[right]));
            // calculate the area by using the difference of the index value and
            //multiplying it with the minimum height as it will be the max capacity.
            
            //moving the left and right pointers and taking the areas 
            //between them and then taking the max of these areas gives 
            //the container with most water
            if(height[left]<height[right])
            {
                left++;
            }
            else
            {
                right--;
            }
        }
        return max;
    }
}

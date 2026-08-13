//Approach: With left and right pointers initialized, we need to find the minimum value between the elements at these two locations
// and accordingly calculate the area, update the maxValue and move the pointer.

//Time Complexity: O(n)
//Space Complexity: O(1)

public class WaterWithContainer
{
    public int maxArea(int[] height)
    {
        //Validate the inputs
        if (height == null || height.length == 0) return 0;

        //Initialize the variables
        int left = 0;
        int right = height.length-1;
        int max = Integer.MIN_VALUE;
        int area = 0;


        while(left < right)
        {
            if(height[left] < height[right])
            {
                area = height[left] * (right-left);
                max = Math.max(area, max);
                left++;
            }
            else
            {
                area = height[right] * (right-left);
                max = Math.max(area, max);
                right--;
            }
        }
        return max;
    }
}
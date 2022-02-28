//Take two pointers one at left and right
//Also maintain the breadth
// (ht[l] < h[r]) ? ++l : --r and update the area

//TC: O(n)
//SC: O(1)
class Solution {
    public int maxArea(int[] height) {
        int left =  0, right = height.length-1;
        int maxArea=0;
        while(left < right)
        {
            // Update ans by maximum of previousmazarea and area between bars at start and end index
            // Move the pointer at index with shorter bar
            maxArea = Math.max(maxArea , (right-left)*Math.min(height[left], height[right]));

            if(height[left] <= height[right])
            {
                ++left;
            }
            else if (height[left] == height[right])
            {
                ++left;
                --right;
            }
            else{
                --right;
            }
        }

        return maxArea;

    }
}
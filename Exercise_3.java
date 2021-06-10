//Time Complexity - O(N)
//Space complexity - O(1)


class Solution {
    public int maxArea(int[] height) {

        // initialize max element

        int max = 0;

        //intialize left to the first element in the array and right to the last element

        int left = 0;
        int right = height.length - 1;

        //iterate through the array

        while(left < right) {

            // calculate the area by multiplying min height between 2 elements * width and update max
            int currentArea = Math.min(height[left],height[right]) * (right - left);
            max = Math.max(max,currentArea);

            // which pointer to move
            if(height[left] < height[right]) {

                left++;


            }
            else {

                right--;

            }

        }


        return max;



    }
}
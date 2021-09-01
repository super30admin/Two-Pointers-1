//Container woth most water:

//Time Complexity: O(n/2)
//Space Compelxity: O(1)


class Solution {
    public int maxArea(int[] height) {

        int low =0;
        int high = height.length-1;

        int max=0;

        while(low< high){

            int min = Math.min(height[low],height[high]);

            if(min == height[low]){

                max = Math.max(max, min*(high-low));
                low++;
            }else{
                max = Math.max(max, min*(high-low));
                high--;
            }
        }

        return max;

    }
}
//Explore container idd also: see video

//TC: O(n)
//SC : O(1)

class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int low = 0, high = n-1;

        int area = 0;

        while(low<high){

            int h = 0;
            int w = high - low;

            if(height[low]<height[high]){
                h = height[low];
                low++;
            }else{
                h = height[high];
                high--;
            }

            area = Math.max(area, h*w);
        }

        return area;
    }
}
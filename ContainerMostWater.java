// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :no


// Your code here along with comments explaining your approach

//2 Pointer method
class ContainerMostWater{
    public int maxArea(int[] height){

        int max = 0;
        int n = height.length;

        //2 pointers low and high
        int low = 0;
        int high = n-1;

        while(low < high){
            int currArea = Math.max(max, Math.min(height[low], height[high]) * (high -low));
            max = Math.max(max,currArea);

            // move the pointer for the min value of 2 heights i.e., move low pointer one step to the right wheneevr low < high or low = high
            if(height[low] <= height [high])
                low ++;

            else
                high --;
        }
        return max;
    }
}

/*
Brute Force method : TC - O(n^2) and SC - O(1)

class Solution {
    public int maxArea(int[] height) {

        //null check
        if(height == null || height.length == 0)
          return -1;

        int max = 0;

        for(int i = 0; i < height.length ; i++){
            for(int j = i+1 ; j < height.length ; j++){
                max = Math.max(max, (Math.min(height[i],height[j]) * (j-i)));
            }
        }
        return max;
    }
}
*/
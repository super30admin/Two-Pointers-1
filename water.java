class Solution {
    //Brute Force approach
    //vertical line : Shorter line
    //width :m distance between two lines
    //Time Complexity : O(n^2)
    //Space Complexity : O(1)
    public int maxArea(int[] height) {
        int maxArea =0;
        for(int i =0;i<height.length;i++){
            for(int j =i+1;j<height.length;j++)
                maxArea = Math.max(maxArea,Math.min(height[i],height[j])*(j-i));
        }

        return maxArea;

    }
}


class Solution {
    //Solved using two pointer approach (one at the start of the array and other at the end of the array)
    //Time Complexity : O(n)
    //Space Complexity : O(1)

    public int maxArea(int[] height) {
        int maxArea=0;//variable to store the max area covered.
        int l=0;
        int r= height.length-1;
        while(l<r){

            maxArea= Math.max(maxArea,Math.min(height[l],height[r])* (r-l));
            if(height[l]<height[r])
                l++;
            else
                r--;
        }

        return maxArea;

    }
}



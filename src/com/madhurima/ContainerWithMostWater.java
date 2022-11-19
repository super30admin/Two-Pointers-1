/*
    Time Complexity = O(n)
    Space Complexity = O(1)
    Did this code successfully run on Leetcode : yes
 */

package com.madhurima;

public class ContainerWithMostWater {
}

class SolutionC {
    public int maxArea(int[] height) {
        if(height == null || height.length < 2){
            return 0;
        }

        int n = height.length;
        int low = 0;
        int high = n-1;
        int max = 0;

        while(low < high){
            max = Math.max(max, Math.min(height[low], height[high])*(high-low));
            if(height[low] < height[high]){
                low++;
            }else{
                high--;
            }
        }

        return max;

    }

    public static void main(String[] args) {
        SolutionC s = new SolutionC();
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(s.maxArea(height));
    }
}

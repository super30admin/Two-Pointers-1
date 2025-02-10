//TC: O(n)
//SC: O(1)
//Did it run on leetcode: Yes
public class Solution_ContainerWithMostWater {
    public int maxArea(int[] height) {
        int n = height.length;
        int max = Integer.MIN_VALUE;
        // for(int i = 0; i < n-1; i++){
        //     for(int j = i+1; j < n; j++){
        //         max = Math.max(max, Math.min(height[i], height[j]) * (j-i));
        //     }
        // }
        // return max;

        int i = 0;
        int j = n-1;
        while(i < j){
            int lh = height[i];
            int rh = height[j];
            max = Math.max(max, Math.min(lh, rh) * (j-i));
            if(lh < rh)
                i++;
            else
                j--;
        }
        return max;
    }
}

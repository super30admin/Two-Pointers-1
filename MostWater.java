// Time Complexity : O(n) n - length of array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


//Area formed between two lines depends on the shortest container. 
//We try to maximise the area. Hence, two pointers are incremented/decremented based on the lengths. 
//Each time area is calculated and max area is updated. The pointer pointing to longest container is retained at 
//every comparison.

public class MostWater {

    public static int maxArea(int[] height) {
        if(height == null || height.length == 0) return 0;
        int L = 0, R = height.length - 1, max = 0;
        while(L < R){
            int water = (R - L) * Math.min(height[L], height[R]);
            max = Math.max(max, water);
            if(height[L] < height[R]) L++;
            else R--;
        }
        return max;  
    }

    public static void main(String[] args){
        int[] arr = {2,3,4,5,18,17,6};
        System.out.println(maxArea(arr));
    }
}

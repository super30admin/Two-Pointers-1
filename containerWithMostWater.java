/**
 * Time Complexity: O(N) as we are passing through every element in the array
 * Space Complexity : O(1) as we are not using any extra memory
 * Executed on leetcode:  yes
 * Approach: we start with two pointers , one at beginning and one at end of the array.
 * we iterate until start<end as we need to calculate max area of containers
 * after calculating the area, we check which one among the two pillars has more height. pillar with max height will have greater contrbution to that max area
 * so we bring the start pointer to the right (basically we are retaining pillar with max area for further calculations/iterations) if left pillar is smaller in height
 * in opp case, we bring right pointer to the left.
 * at the end, we will end up having max area using pillars which hve most and second most heights or same max heights
 */


class container {
    public int maxArea(int[] height) {
        if(height.length<2) return 0;
        int start = 0;
        int end = height.length-1;
        int max = Integer.MIN_VALUE;
        while(start<end)
        {
            int h = Math.min(height[start],height[end]);
            int l = end-start;
            max = Math.max(max,h*l);
            if(height[end]>height[start]) start++;
            else end--;
        }
        return max;
    }
    public static void main(String[] args) {
        int[] nums = new int[]{1,8,6,2,5,4,8,3,7};
        container obj = new container();
        System.out.println("max area= "+obj.maxArea(nums));
    }
}
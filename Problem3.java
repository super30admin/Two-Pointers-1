/*
Container With Most Water
approach: two pointer, increment index which has lower height to maximize area.
time: O(n)
space: O(1)
 */
public class Problem3 {
    public int maxArea(int[] height) {
        int l=0,h=height.length-1, max = 0;
        while(l<h) {

            int currArea = Math.min(height[l], height[h])*(h-l);
            max = Math.max(max, currArea);

            if(height[l]<=height[h]) l++;
            else h--;
        }

        return max;
    }
}

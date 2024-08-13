/**
 * essentially the max width at any point will be at the furthest pointer(high).
 * so all we do is that  the min height between low and high should be maxxed. if we do that, we are good.
 * here, we do it using two pointer solution.
 * Max water that can be held in a container
 * Space complexity = O(1)
 * Time complexity = O(n)
 */
public class Container {
    public int maxArea(int[] height) {
        int left =0;
        int right = height.length-1;
        int max = Integer.MIN_VALUE;
        int start=0;
        int end=0;
        while(left< right) {
            int area = (right-left)*Math.min(height[left], height[right]);
            if(max< area) {
                max = area;
                start = left;
                end = right;
            }
            
            if(height[left]< height[right]) {
                left++;
            } else {
                right--;
            }
        }
        System.out.println("start at " + start);
        System.out.println("end at " + end);
        return max;
    }
}
// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// Your code here along with comments explaining your approach
// We observe that the container is between maximum pillars from start and end of the array and having maximum
// distance between them. So we start traversing from both ends, we find 2 maximum pillars, but the water contained will
// be based on minimum value of those 2 pillars. So, we calculate the area between those pillars then move inwards(reduce
// either start or end pointer), and try to find an area which is maximum.
public class ContainerWithMaxWater {

    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
    }

    public static int maxArea(int[] height) {
        int result = 0;
        int leftIndex = 0;
        int rightIndex = height.length - 1;

        while (leftIndex < rightIndex) {
            int temp = Math.min(height[leftIndex], height[rightIndex]) * (rightIndex - leftIndex);
            if (temp > result) {
                result = temp;
            }
            if (height[leftIndex] <= height[rightIndex]) {
                leftIndex++;
            } else {
                rightIndex--;
            }

        }
        return result;
    }
}

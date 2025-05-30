
public class ContainerWithWater {
    public int maxArea(int[] height) {
        int w = 0;
        int len = height.length;
        int low = 0;
        int high = len - 1;
        int curmax = 0;
        int result = 0;

        for (int i = 0; i < len; i++) {
            w = high - low;
            int min = Math.min(height[low], height[high]);
            curmax = min * w;
            result = Math.max(result, curmax);

            if (height[low] < height[high]) {
                low++;
            } else {
                high--;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        ContainerWithWater sol = new ContainerWithWater();

        int[] height = {1,8,6,2,5,4,8,3,7};
        int maxWater = sol.maxArea(height);

        System.out.println("Maximum area of water container: " + maxWater);  // Output: 49
    }
}

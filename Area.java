public class Area {
    public int maxArea(int[] height) {
        if (height.length == 0 || height == null)
            return 0;

        int max = Integer.MIN_VALUE;
        int l = 0;
        int h = height.length - 1;

        while (l <= h) {
            int area = (h - l) * (Math.min(height[h], height[l]));
            if (area > max)
                max = area;
            if (height[l] <= height[h])
                l++;
            else
                h--;
        }
        return max;

    }

    public static void main(String[] args) {
        int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        Area a = new Area();
        System.out.println(a.maxArea(height));
    }
}
